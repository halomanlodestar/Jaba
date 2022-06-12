package Bot;
import java.util.*;
import java.util.stream.Collectors;

public class Report {
    String Username;
    Region Region;
    // Constructor
    public Report(String username, Report.Region region) {
        this.Username = username;
        this.Region = region;
    }

    public void Execution(List<Report> Players) {
        Players.stream()
            .filter(player -> Region.equals(player.Region))
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (Username + " : " + Region);
    }
    public static enum Region {
        AS, EU, NA
    }
}
