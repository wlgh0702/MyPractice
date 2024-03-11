package Platinum;

import function.Platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Platinum5 {
    public static void No11003(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        Deque<Platinum.Node> deque = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            while(!deque.isEmpty() && num < deque.getLast().value) {
                deque.removeLast();
            }
            deque.addLast(new Platinum.Node(i, num));

            if(deque.getFirst().index <= i - L) {
                deque.removeFirst();
            }
            sb.append(deque.getFirst().value + " ");
        }
        System.out.println(sb);
    }
}
