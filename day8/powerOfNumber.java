import java.util.*;

public class powerOfNumber {
    public static int powerOfNum(int n,int p){
        if(p==0){
            return 1;
           
        }
        return n*powerOfNum(n,p-1);
         
    }
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        
            System.out.println("Enter the number: ");
            int n=sc.nextInt();
            System.out.println("Enter the power: ");
             int p=sc.nextInt();
            int res=powerOfNum(n,p);
            System.out.println(res);
        }

}
