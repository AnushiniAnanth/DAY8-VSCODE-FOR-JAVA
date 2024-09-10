
import java.util.*;

public class FindMaxUsingRecursive {
    public static int BinarySearch(int [] arr,int l,int r){
        
        int mid=(l+r)/2;
        if(l==r){
            return arr[r];
        }
        
        /*else if(arr[mid]<max){
        max=BinarySearch(arr, l,mid-1);
        }
        else{

        
        max=BinarySearch(arr,mid+1,r);
        }
        return max;*/
        int leftMax=BinarySearch(arr,l,mid);
        int rightMax=BinarySearch(arr,mid+1,r);
        return Math.max(leftMax,rightMax);

        


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
        int ans=BinarySearch(arr,0,n-1);
        System.out.println("The maximum value is "+ans);
        
    }


}
