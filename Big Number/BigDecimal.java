import java.math.BigDecimal;
import java.util.*;
class BigDecimal{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        
        //Write your code here
        Arrays.sort(s, new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return 0;
        }
        BigDecimal s1next = new BigDecimal(s1);
        BigDecimal s2next = new BigDecimal(s2);
        return s2next.compareTo(s1next);
        }
    });
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}