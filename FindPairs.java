import java.util.HashMap;
import java.util.*;

public class FindPairs {
    public int pairs(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int n = arr.length;
        int count =0;

        for (int i = 0; i < n; i++) {
            for (int j =i+1; j<n; j++) {

                int absolute = Math.abs(arr[i]- arr[j]);

                if (absolute >= k) {
                    map.put(arr[i], arr[j]);
                }
            }
        }
        count = map.size();
        return count;
    }

    public static void main(String[] args) {
        FindPairs pair = new FindPairs();


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];

        System.out.println(n);
        System.out.println(k);

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(pair.pairs(arr, k));
    }
}
