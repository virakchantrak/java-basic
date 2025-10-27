package collectionFramework.set;

import java.util.EnumSet;

// Enum set
public class Exercise2 {
    public static void main(String[] args) {
        EnumSet<Day> days = EnumSet.allOf(Day.class);

        EnumSet<Day> range = EnumSet.range(Day.THURSDAY, Day.SATURDAY);
        System.out.println(days);
        System.out.println(range);
    }
}
