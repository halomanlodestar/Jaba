package Bot;
import java.util.*;
import java.io.*;

public class Report {
    // Instances
    public String Username;
    public String Broken;
    public String Region;
    static int count = 1;

    // Dictionary
    static Dictionary<Integer, String> ListUserNames = new Hashtable<>();
    static Dictionary<Integer, String> ListRegion = new Hashtable<>();

    // Constructor
    public Report(String username, String broken, String region) {
        this.Username = username;
        this.Broken = broken;
        this.Region = region;
        ListUserNames.put(count, Username);
        ListRegion.put(count, region);
        count++;
        writeList();
    }

    public int AllReports() {
        return count;
    }

    public String getRegion(String s) {
        return Region;
    }
    
    public static String getList() {
        StringBuffer s = new StringBuffer();
        for (int i = 1; i < count; i++) {
            String r = ("[" + i + "] : " + ListUserNames.get(i) + " : " + ListRegion.get(i));
            System.out.println(r);
            s.append(r +'\n');
        }
        //System.out.println("\n \n\n\n" + s);
        return (s.toString());
    }
    private void writeList() {
        try {
            File Lists = new File("D:\\context\\GitHub\\jaba\\Bot\\List.txt");
            FileWriter ListWrite = new FileWriter(Lists);
            ListWrite.write(getList());
            ListWrite.close();
            System.out.println("Successfully Updated List");
        }
        catch (IOException e){
            System.out.println("Error : " + e);
        }
    }
}