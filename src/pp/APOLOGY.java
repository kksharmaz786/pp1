import java.util.Scanner;

public class APOLOGY {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                int p=0;
                for (int i = 0;i<s.length();){
                        if (s.charAt(i) == ' '){
                                i=i+1;
                                if(p == 1)
                                System.out.println();
                                p = 0;
                                continue;
                        }
                        else{
                                System.out.print(s.charAt(i));
                                i=i+1;
                                p = 1;
                        }
                }
        }
}