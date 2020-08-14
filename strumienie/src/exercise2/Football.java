package exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Football {

    public static void main(String[] args) {

        System.out.println("Wszystkie mecze:");
        Stream<Match> result = createStream();
        printAllResultSorted(result);

        System.out.println("\nMecze Polski:");
        result=createStream();
        System.out.println(teamMatches(result,"Polska"));

        System.out.println("\nLiczba drużyn:");
        result=createStream();
        System.out.println(teamsNumber(result));

        System.out.println("\nLiczba bramek:");
        result=createStream();
        System.out.println(numberOfGoals(result));

    }

    private static Stream<Match> createStream()    {
        return Stream.of(
                new Match("Polska", "Niemcy", 2, 0),
                new Match("Francja", "Belgia", 1, 1),
                new Match("Rosja", "Polska", 4, 1),
                new Match("Francja", "Rosja", 0, 4),
                new Match("Polska", "Belgia", 7, 2)
        );
    }

    private static List<Match> teamMatches(Stream<Match> matches, String team) {
        Stream<Match> teamMatches = matches
                .filter(c -> c.getHosts().contains(team) || c.getGuests().contains(team));
        return teamMatches.collect(Collectors.toList());
    }

    private static void printAllResultSorted(Stream<Match> results) {
        results.sorted(
                (result1, result2) -> {
                    int result1Difference = result1.getHostsScore() - result1.getGuestsScore();
                    int result2Differesce = result2.getHostsScore() - result2.getGuestsScore();
                    return Integer.compare(result2Differesce, result1Difference);
                }
        ).forEach(System.out::println);
    }

    private static long teamsNumber(Stream<Match> result){
        return result.map(Match::getTeamNames)
                .flatMap(Arrays::stream)
                .distinct()
                .count();
    }

    private static long numberOfGoals(Stream<Match> result){
        return result.mapToInt(Match::getGoalsSum)
                .sum();
    }
}
