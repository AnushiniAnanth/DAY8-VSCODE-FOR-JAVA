import java.util.*;
public class PrintStatement {
   
        public static void Statement(String s,int n){
            if(s.length()==n){
                return ;

            }
            System.out.println(s.charAt(n));
            Statement(s,n+1);
            }

        
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        int n;
           
           Statement(s,0);
        }

}
