package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Silver1 {
    public static void No11286(BufferedReader br) throws IOException {
        // 절댓값 힙

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                } else {
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });
        for(int i = 0; i < N; i++) {
            int now = Integer.parseInt(br.readLine());
            if(now == 0) {
                if(pq.isEmpty()) {
                    sb.append(now + "\n");
                } else {
                    sb.append(pq.poll() + "\n");
                }
            } else {
                pq.add(now);
            }
        }
        System.out.println(sb);
    }
}
