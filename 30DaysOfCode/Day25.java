import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n > 0){
        boolean p = false;
            int check = Integer.parseInt(br.readLine());
            if(check == 1){
                System.out.println("Not prime");
            }
            else{
            for(int i = 2; i*i<=check; i++){
                if(check % i == 0)
                    p = true; 
            }
            if(p==true)
                System.out.println("Not prime");
            else
                System.out.println("Prime");    
            }
            n--;
        }
    }
}

