import java.util.Scanner;
class findMaxProduct{
	long maxProduct(int[] arr, int n) {
        
        long min=arr[0];
        long max=arr[0];
        long max_so_far=arr[0];
        for(int i=1;i<n;i++){
            long temp=Math.max(Math.max(arr[i],arr[i]*max),arr[i]*min);
            min=Math.min(Math.min(arr[i],arr[i]*max),arr[i]*min);
            max=temp;
            max_so_far=Math.max(max,max_so_far);
        }
        return max_so_far;
    }
}
public class ProductSubarray {

	public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter total number of elements in array");
         int num=in.nextInt();
         int[] array=new int[num];
         System.out.println("Enter the array elements");
         for(int i=0;i<num;i++) {
        	 array[i]=in.nextInt();
         }
         findMaxProduct obj=new findMaxProduct();
         System.out.println("The maximum product in given array is "+obj.maxProduct(array, num));
	}

}
