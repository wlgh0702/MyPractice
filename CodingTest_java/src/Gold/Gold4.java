package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Gold4 {
    public static void No1253(BufferedReader br) throws IOException {
        /*
        * '좋은 수' 구하기
        *
        * N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.
        * N개의 수가 주어지면 그 중에서 좋은 수의 개수는 몇 개인지 출력하라.
        * 수의 위치가 다르면 값이 같아도 다른 수이다.
        * */
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[N];
        int count = 0;
        for(int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);
        for(int i = 0; i < N; i++) {
            int start = 0;
            int end = N - 1;
            int num = numbers[i];
            while(start < end) {
                int sum = numbers[start] + numbers[end];
                if(sum < num) {
                    start++;
                } else if(sum > num) {
                    end--;
                } else {
                    if(start == i) {
                        start++;
                    } else if(end == i) {
                        end--;
                    } else {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
