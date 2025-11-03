package jdbc;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentManagement {
    private static final Logger LOGGER = Logger.getLogger(StudentManagement.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Insert new student");
            System.out.println("2. View all students");
            System.out.println("3. Update student");
            System.out.println("4. Delete student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> insertStudent();
                case 2 -> viewStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> {
                    System.out.println("👋 Exiting program...");
                    return;
                }
                default -> System.out.println("❌ Invalid choice!");
            }
        }
    }

    // 1️⃣ Insert
    public static void insertStudent() {
        try (Scanner sc = new Scanner(System.in);
             Connection con = DBConnection.getConnection()) {

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            String sql = "INSERT INTO students (name, age) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, age);

            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("✅ Student added successfully!");
            else
                System.out.println("⚠️ Failed to insert student.");

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error inserting student", e);
        }
    }

    // 2️⃣ View
    public static void viewStudents() {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "SELECT * FROM students ORDER BY id";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n=== Student List ===");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        " | Name: " + rs.getString("name") +
                        " | Age: " + rs.getInt("age"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3️⃣ Update
    public static void updateStudent() {
        try (Scanner sc = new Scanner(System.in);
             Connection con = DBConnection.getConnection()) {

            System.out.print("Enter student ID to update: ");
            int id = sc.nextInt();

            System.out.print("Enter new age: ");
            int age = sc.nextInt();

            String sql = "UPDATE students SET age = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, age);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("✅ Updated successfully!");
            else
                System.out.println("⚠️ No student found with that ID.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 4️⃣ Delete
    public static void deleteStudent() {
        try (Scanner sc = new Scanner(System.in);
             Connection con = DBConnection.getConnection()) {

            System.out.print("Enter student ID to delete: ");
            int id = sc.nextInt();

            String sql = "DELETE FROM students WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("✅ Deleted successfully!");
            else
                System.out.println("⚠️ No student found with that ID.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

