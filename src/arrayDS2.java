/**
 * Created by user on 2/9/2016.
 */
import java.util.*;

public class arrayDS2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }

        for(int j = arr.length - 1; j >= 0; j--){
            System.out.print(arr[j] + " ");
        }
    }
}
