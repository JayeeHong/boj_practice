package step4;

import java.util.Scanner;

public class Q10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for (int j = a; j <= b; j++) {
                arr[j - 1] = c;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N - 1; i++) {
            sb.append(arr[i]).append(" ");
        }
        sb.append(arr[N - 1]);

        System.out.println(sb);
    }
}
