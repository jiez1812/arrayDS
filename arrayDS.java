/**
 * Created by user on 1/9/2016.
 */
import java.util.Scanner;

public class arrayDS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int j = arr.length - 1; j >= 0; j--){
            System.out.print(arr[j] + " ");
        }
    }
}
