package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Silver4 {
    public static void No2164(BufferedReader br) throws IOException {
        // 카드2
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            queue.add(i + 1);
        }
        while(queue.size() != 1) {
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());
    }
}
