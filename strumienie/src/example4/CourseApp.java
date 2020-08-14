package example4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CourseApp {
    public static void main(String[] args) {

        //forEach()
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        //courses.forEach(course -> System.out.println(course));
        //drugi sposób
        courses.forEach(System.out::println);

        //count()
        Stream<Course> courses1 = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        long streamSize = courses1.count();
        System.out.println(streamSize);

        //min() i max()
        Stream<Course> courses2 = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        Optional<Course> cheapestCourse = courses2.min((c1,c2)->Double.compare(c1.getPrice(),c2.getPrice()));
        cheapestCourse.ifPresent(System.out::println);
        //drugi sposób
        //courses2.min(Comparator.comparingDouble(Course::getPrice))
        //       .ifPresent(System.out::println);

        //anyMatch
        Stream<Course> courses3 = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        boolean under100 = courses3.anyMatch(course->course.getPrice()<100);
        if (under100)
            System.out.println("Co najmniej jeden kurs tańszy niż 100zł");

        //allMatch
        Stream<Course> courses4 = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        boolean above10 = courses4.allMatch(course -> course.getPrice()>10);
        if (above10)
            System.out.println("Wszystkie kursy droższe niż 10zł");

        //noneMatch
        Stream<Course> courses5 = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        boolean above300 = courses5.noneMatch(course -> course.getPrice()>300);
        if(above300)
            System.out.println("Żaden z kursów nie jest droższy od 300zł ");

        //toArray
        Stream<Course> courses6 = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        Course[] coursesArray = courses6.toArray(Course[]::new);
        System.out.println(Arrays.toString(coursesArray));

        //collect
        Stream<Course> courses7 = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );
        ArrayList<Course> coursesList = courses7.collect(
                ArrayList<Course>::new,
                ArrayList::add,
                ArrayList::addAll
        );
        System.out.println(coursesList);
        //inaczej
        //List<Course> courseList = courses7.collect(Collectors.toList());
        //System.out.println(courseList);

        //reduce
        Stream<String> names = Stream.of("Ania", "Kasia","Basia" );
        String allNames = names.reduce("",(result,next)->result+next+" ");
        System.out.println(allNames);

    }
}
