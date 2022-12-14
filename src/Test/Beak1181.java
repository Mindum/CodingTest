package Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//단어 정렬
public class Beak1181 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String arr[] = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() { //내림차순으로 정렬해주는 기능
            public int compare (String s1, String s2){ // 문자열을 비교해주는 함수 compare
                if (s1.length() == s2.length()){//문자열끼리 비교해서 어떤 문자열을 선택할지 정하는 if문
                    return s1.compareTo(s2); // compareTo는 사전 순으로 정렬해주는 기능임
                }
                else{
                    return s1.length() - s2.length();
                }
            }
        });
        System.out.println(arr[0]);

        for(int i=1;i<N;i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }
}

