import java.util.Scanner;
public class ReverseTheSubArray {
    public static int[] Reverse(int[]arr,int x,int y){
        
        if(x>=y){
            return arr;

        }
        
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
        
        Reverse(arr,x+1,y-1);
        return arr;
  

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the limit: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int[] res= Reverse(arr,x,y);
        for(int i=0;i<=n;i++){
        System.out.println(res[i]);
        }
    }

}
