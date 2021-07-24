import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> arr_list = new ArrayList<List<Integer>>();
        
        for(int i = 0; i<n;i++){
            int d = sc.nextInt();
            ArrayList<Integer> inner_list = new ArrayList<Integer>();
            while(d-- > 0){
                inner_list.add(sc.nextInt());
            }
            arr_list.add(inner_list);
            
        }
        int q = sc.nextInt();
        while(q-- >0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y > arr_list.get(x - 1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(arr_list.get(x - 1).get(y - 1));
            }
        }

        sc.close();
            
        
    }
}
