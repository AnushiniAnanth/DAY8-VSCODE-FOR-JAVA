import java.util.*;
public class PrintTheStatement {
    public static void printStatement(String s ,int n){
        if(n>0){
        System.out.println(s);
        printStatement( s ,n-1);
    }
    
        
    }

    
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string: ");
    String s=sc.nextLine();
        System.out.println("Enter the limit: ");
        int n=sc.nextInt();
        printStatement(s,n);
    }
}
