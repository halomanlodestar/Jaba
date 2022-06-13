package Test;
import java.util.*;
import Bot.*;
import Bot.Report.*;
class Main {
    public static void main(String[] args) {
        List<Report> Players = List.of(
            new Report("LoadStar2476", Regions.AS),
            new Report("ELite0412", Regions.AS),
            new Report("Ambiennt", Regions.NA)
        );
        Report.Filter(Players, Regions.NA);
    }
}