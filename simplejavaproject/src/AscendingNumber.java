import java.util.Scanner;

public class AscendingNumber {
    public static void main(String[] args) {
        int input;
        System.out.print("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();
        int len = Integer.toString(input).length();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = input % 10;
            input = input / 10;
        }
        for (int m = 0; m < arr.length; m++) {
            for (int n = m + 1; n < arr.length; n++) {
                int temp = 0;
                if (arr[m] > arr[n]) {
                    temp = arr[m];
                    arr[m] = arr[n];
                    arr[n] = temp;
                }
            }
        }
        //Arrays.sort(arr);
        System.out.print("Sort number : ");
        for (int j = 0; j < len; j++) {
            System.out.print(arr[j]);
        }
    }
}