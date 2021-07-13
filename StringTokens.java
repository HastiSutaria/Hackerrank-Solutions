import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        }
        else{
            String[] strArr = s.split("[?_!'.,@ ]+");
            System.out.println(strArr.length);
        
            for(String result : strArr)
                System.out.println(result);
        }
        scan.close();
    }
}

