package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = "";

        while (true) {
            System.out.println("exit 입력시 종료, go 입력시 반복");
            s = sc.nextLine();
            if (s.equals("exit")) {
                break;
            } else if (s.equals("go")) {
                continue;
            }
        }
    }
}
