package step5;

import java.util.Scanner;

public class Q9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String str = sc.next();
            int length = str.length();
            System.out.println(str.charAt(0) + "" + str.charAt(length - 1));
        }
    }
}
