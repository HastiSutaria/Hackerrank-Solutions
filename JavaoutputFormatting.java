import java.util.Scanner;

public class JavaoutputFormatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
                /* "-" is used for left padding, "15" characters, "s" for string, "0" to add zeros beforehand, "d" int "%n" new line */
            }
            System.out.println("================================");

    }
}
