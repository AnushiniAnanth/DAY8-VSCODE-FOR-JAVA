import java.util.*;
public class MaxElementUsingRecursion {
public static int FindMax(int[] arr,int n){
    int max=arr[0];
    if(n==1){
       return max=arr[n];
    }
    else if (arr[n-1]>arr[n-2]){
        return max=arr[n-1];
    }
    
    return FindMax(arr,n-1);

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
        int ans=FindMax(arr,n);
        System.out.println(ans);
        
    }

}
