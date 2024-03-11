package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Silver2 {
    public static void application(BufferedReader br) throws IOException {
        No12891.No12891(br);
    }


}

class No12891 {

    /* DNA 비밀번호
    *
    * 평소에 문자열을 가지고 노는 것을 좋아하는 민호는 DNA 문자열을 알게 되었다. DNA 문자열은 모든 문자열에 등장하는 문자가 {‘A’, ‘C’, ‘G’, ‘T’} 인 문자열을 말한다. 예를 들어 “ACKA”는 DNA 문자열이 아니지만 “ACCA”는 DNA 문자열이다. 이런 신비한 문자열에 완전히 매료된 민호는 임의의 DNA 문자열을 만들고 만들어진 DNA 문자열의 부분문자열을 비밀번호로 사용하기로 마음먹었다.
    * 하지만 민호는 이러한 방법에는 큰 문제가 있다는 것을 발견했다. 임의의 DNA 문자열의 부분문자열을 뽑았을 때 “AAAA”와 같이 보안에 취약한 비밀번호가 만들어 질 수 있기 때문이다. 그래서 민호는 부분문자열에서 등장하는 문자의 개수가 특정 개수 이상이여야 비밀번호로 사용할 수 있다는 규칙을 만들었다.
    * 임의의 DNA문자열이 “AAACCTGCCAA” 이고 민호가 뽑을 부분문자열의 길이를 4라고 하자. 그리고 부분문자열에 ‘A’ 는 1개 이상, ‘C’는 1개 이상, ‘G’는 1개 이상, ‘T’는 0개 이상이 등장해야 비밀번호로 사용할 수 있다고 하자. 이때 “ACCT” 는 ‘G’ 가 1 개 이상 등장해야 한다는 조건을 만족하지 못해 비밀번호로 사용하지 못한다. 하지만 “GCCA” 은 모든 조건을 만족하기 때문에 비밀번호로 사용할 수 있다.
    * 민호가 만든 임의의 DNA 문자열과 비밀번호로 사용할 부분분자열의 길이, 그리고 {‘A’, ‘C’, ‘G’, ‘T’} 가 각각 몇번 이상 등장해야 비밀번호로 사용할 수 있는지 순서대로 주어졌을 때 민호가 만들 수 있는 비밀번호의 종류의 수를 구하는 프로그램을 작성하자. 단 부분문자열이 등장하는 위치가 다르다면 부분문자열이 같다고 하더라도 다른 문자열로 취급한다.
    * */
    public static int[] myCompare;
    public static int[] needPwd;
    public static int count;
    public static void No12891(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] password = br.readLine().toCharArray();
        myCompare = new int[4];
        needPwd = new int[4];
        count = 0;
        int ans = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num == 0) count++;
            needPwd[i] = num;
        }
        for(int i = 0; i < P; i++) {
            add(password[i]);
        }
        if(count == 4) ans++;
        for(int i = P; i < S; i++) {
            int j = i - P;
            remove(password[j]);
            add(password[i]);
            if(count == 4) ans++;
        }
        System.out.println(ans);
    }

    private static void add(char c) {
        switch (c) {
            case 'A' :
                myCompare[0]++;
                if(myCompare[0] == needPwd[0]) count++;
                break;
            case 'C' :
                myCompare[1]++;
                if(myCompare[1] == needPwd[1]) count++;
                break;
            case 'G' :
                myCompare[2]++;
                if(myCompare[2] == needPwd[2]) count++;
                break;
            case 'T' :
                myCompare[3]++;
                if(myCompare[3] == needPwd[3]) count++;
                break;
        }
    }

    private static void remove(char c) {
        switch (c) {
            case 'A' :
                if(myCompare[0] == needPwd[0]) count--;
                myCompare[0]--;
                break;
            case 'C' :
                if(myCompare[1] == needPwd[1]) count--;
                myCompare[1]--;
                break;
            case 'G' :
                if(myCompare[2] == needPwd[2]) count--;
                myCompare[2]--;
                break;
            case 'T' :
                if(myCompare[3] == needPwd[3]) count--;
                myCompare[3]--;
                break;
        }
    }
}