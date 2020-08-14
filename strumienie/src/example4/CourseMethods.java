package example4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CourseMethods {
    public static void main(String[] args) {

        //boxed
        List<Integer> collect = IntStream.rangeClosed(0,10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(collect);

        //distinct
        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(1L, "Java", 199, "Programowanie")
        );
        Stream<Course> uniqueStream = courses.distinct();

        //filter
        Stream<Course> expensiveCourses = uniqueStream.filter(course -> course.getPrice()>200);
        expensiveCourses.forEach(System.out::print);
        System.out.println("\n");

        //flatMap
        Course[] cheapCourses = {
                new Course(1L, "Java", 49, "Programowanie"),
                new Course(2L, "Sztuka pisania", 79, "Rpzwój osobisty"),
        };
        Course[] expensiveCourses1 = {
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "Python od podstaw", 169, "Programowanie")
        };
        Stream<Course[]> courses1 = Stream.of(
                cheapCourses,
                expensiveCourses1
        );
        Stream<Course> allCourses = courses1.flatMap(Arrays::stream);
        allCourses.forEach(System.out::println);

        //limit
        System.out.println("\n");
        List<Integer> collect2 = IntStream.iterate(0,n->n+1)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(collect2);

        //map
        Stream<Course> courses2 = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Java od podstaw", 159, "Programowanie"),
                new Course(4L, "Tajniki Google", 299, "Marketing")
        );
        List<String> javaTitles = courses2
                .map(Course::getName)
                .filter(name->name.toLowerCase().contains("java"))
                .collect(Collectors.toList());
        System.out.println(javaTitles);

        //sorted
        System.out.println("\n");
        Stream<Course> courses3 = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "Java od podstaw", 159, "Programowanie")
        );
        Stream<Course> sortedCourse = courses3
                .sorted((c1,c2)->Double.compare(c1.getPrice(),c2.getPrice()));
        sortedCourse.forEach(System.out::println);

        //peek
        System.out.println("\n");
        Stream<Course> courses4 = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "Java od podstaw", 159, "Programowanie")
        );
        List<String> javaTitles1 = courses4
                .filter(c -> c.getName().toLowerCase().contains("java"))
                .peek(course -> System.out.println("filtered stream: " + course))
                .map(Course::getName)
                .collect(Collectors.toList());
        System.out.println(javaTitles1);

        //skip
        System.out.println("\n");
        Stream<Course> courses5 = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "Java od podstaw", 159, "Programowanie"),
                new Course(5L, "Python od podstaw", 139, "Programowanie")
        );
        Stream<Course> withoutCheapCourses = courses5
                .sorted(Comparator.comparing(Course::getPrice))
                .skip(3);
        withoutCheapCourses.forEach(System.out::println);
    }
}
