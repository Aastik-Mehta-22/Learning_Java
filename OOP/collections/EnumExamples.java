package collections;

import collections.EnumExamples.Week;

public class EnumExamples {
    
    enum Week {
        Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday
        // these are enum constants
        //public, static and final
        // since its final you can not create child enums
        // type is Week

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for(Week day : week.values()){
            System.out.println(day);
        }
    }
}
