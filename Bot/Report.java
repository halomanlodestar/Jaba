package Bot;
import java.util.*;
import java.util.stream.Collectors;

public class Report {
    String Username;
    Regions Region;
    public enum Regions {
        AS, EU, NA
    }
    // Constructor
    public Report(String username, Regions region) {
        this.Username = username;
        this.Region = region;
    }

    public static void Filter(List<Report> Players, Regions region) {
        Players.stream()
            .filter(player -> region.equals(player.Region))
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (Username + " : " + Region);
    }
}