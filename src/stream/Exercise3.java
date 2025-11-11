package stream;

import java.util.List;
import java.util.stream.Stream;

public class Exercise3 {
    private String name;
    private int age;
    private List<String> subjects;

    public Exercise3(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public static void main(String[] args) {
        List<Exercise3> students = List.of(
                new Exercise3("Virak", 23, List.of("C", "Java")),
                new Exercise3("Proek", 22, List.of("ReactJS", "NodeJS")),
                new Exercise3("Antre", 22, List.of("ReactJS", "NodeJS"))

        );

        // Find Subjects
//        Stream<Exercise3> stream = students.stream();
//        Stream<List<String>> listStream = stream.map(s -> s.getSubjects());
//        List<List<String>> collect = listStream.collect(Collectors.toList());
//        System.out.println(collect);

        Stream<String> stringStream = students.stream().flatMap(s -> s.getSubjects().stream());
        stringStream
                .distinct()
//                .collect(Collectors.toList());
        .forEach(System.out::println);
//        System.out.println(collect);


    }
}
