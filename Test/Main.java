package Test;
import Bot.*;
import java.util.*;
// Elements

public class Main {

    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Report in Following Format ::");
        System.out.println("Username : ");
        System.out.println("Rule Broken :");
        System.out.println("Region : ");
        String username = sc.nextLine();
        String broken = sc.nextLine();
        String region = sc.nextLine();
        new Report(username, broken, region);
        System.out.println("--------------------\nThanks for Reporting. \n--------------------");
        Report.getList();
        //
        sc.close();
    }
}