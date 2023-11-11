package step3;

import java.util.Scanner;

public class Q25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = N / 4;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            sb.append("long ");
        }
        sb.append("int");

        System.out.println(sb.toString());
    }
}
