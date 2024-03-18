package Gold;

import common.Num;
import common.SortNum;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Gold2 {
    public static void No1377(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        SortNum[] arr = new SortNum[N];
        for(int i = 0; i < N; i++) {
            arr[i] = new SortNum(i, Integer.parseInt(br.readLine()));
        }
        Arrays.sort(arr);
        int max = 0;
        for(int i = 0; i < N; i++) {
            if(max < arr[i].index - i) {
                max = arr[i].index - i;
            }
        }
            System.out.println(max + 1);
    }
}
