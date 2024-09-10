import java.util.*;

public class printTheArray {
    public static void ArrayPrint(int[]arr,int  n) {
        if(n==0){
            return ;
        }
        ArrayPrint(arr,n-1);
            System.out.println(arr[n-1]);
           
        

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        System.out.println("Enter the array: ");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        ArrayPrint(arr,n);
    }

}
