package Test;

import java.util.Scanner;

public class Beak2798 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N];

        for(int i = 0 ; i < N ; i++){
            arr[i] = in.nextInt();
        }

        int result = search(arr, N, M);
        System.out.println(result);
    }

    static int search(int arr[], int N, int M){
        int result = 0;
    }
}