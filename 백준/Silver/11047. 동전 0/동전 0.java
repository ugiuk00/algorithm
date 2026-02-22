

import java.util.Scanner;
// 전형적인 동전 그리디 문제
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt();
        }

        int count = 0;

        // 큰 값부터 반복
        for (int i = N - 1; i >= 0; i--) {
            if (coins[i] <= K) {
                // 몫 더하기
                count += (K / coins[i]);
                // 갱신
                K %= coins[i];
            }
        }

        System.out.println(count);
    }
}
