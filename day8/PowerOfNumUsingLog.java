import java.util.*;

public class PowerOfNumUsingLog {
    public static int powerNumlog(int n,int p){
        if(p==0){
            return 1;
        }
        int power=powerNumlog(n,p/2);
    
        if(p%2==0){
            return power*power;
        }
        else{
        
    return n*power*power;
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
            System.out.println("Enter the number: ");
            int n=sc.nextInt();
            System.out.println("Enter the power: ");
             int p=sc.nextInt();
            int res=powerNumlog(n,p);
            System.out.println(res);
        }
        
    }


