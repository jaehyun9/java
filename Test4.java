package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = "";

        switch (s) {
            case "공격수" :
                System.out.println("공격수");
                break;
            case "수비수" :
                System.out.println("수비수");
                break;
            case "미드필더" :
                System.out.println("미드필더");
                break;
            case "골키퍼" :
                System.out.println("골키퍼");
                break;
        }
        System.out.println("");
    }
}
