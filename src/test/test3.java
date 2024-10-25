package test;

public class test3 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 10, 15, 16, 18, 20, 21};

        for (int i : numbers) {
            if (i % 2 == 0) {
                System.out.println("짝수");
            } else if (i % 3 == 0) {
                System.out.println("3의 배수");
            } else if (i % 5 == 0) {
                System.out.println("5의 배수");
            } else {
                System.out.println("기타");
            }
        }
    }
}
