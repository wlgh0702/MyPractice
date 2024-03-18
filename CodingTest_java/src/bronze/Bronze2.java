package bronze;

import java.io.BufferedReader;
import java.io.IOException;

public class Bronze2 {
    public static void No2750(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        for(int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                if(numbers[i] > numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        for(int i = 0; i < N; i++) {
            System.out.println(numbers[i]);
        }
    }
}
