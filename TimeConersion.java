import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String time = s.nextLine();
        int hour = Integer.parseInt(time.substring(0,2));
        int minute = Integer.parseInt(time.substring(3,5));
        int second = Integer.parseInt(time.substring(6,8));
        String medium = time.substring(8,10);
        
        hour += ((medium.equals("PM") && hour != 12)?12:0);// conversion based on current medium
        hour -= ((medium.equals("AM") && hour == 12)?12:0);
        
        System.out.println(String.format("%02d",hour) + ":" + String.format("%02d",minute) + ":" + String.format("%02d",second));
    }
}
