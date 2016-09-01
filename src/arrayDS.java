/**
 * Created by user on 1/9/2016.
 */
import java.util.Scanner;

public class arrayDS {
    public static void main(String[] args){
        int[] arr, arr2;

        System.out.print("Input array size: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        arr = new int[i];
        arr2 = new int[i];

        Scanner arrIn = new Scanner(System.in);
        for(int j = 0; j < arr.length; j++) {
            System.out.print("Enter the array[" + (j + 1) + "] of Array(" + i + "):");
            int num = arrIn.nextInt();
            arr[j] = num;
        }


        int temp, a = 0;

        for(int b = arr.length - 1; b >= 0; b-- ) {
            arr2[a] = arr[b];
            a++;
        }

        for(int k = 0; k < arr.length;k++){
            if (k <= arr.length) {
                System.out.print(arr2[k] + ",");
            }else{
                System.out.print(arr2[k]);
            }
        }
    }
}
