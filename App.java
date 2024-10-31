package Calculator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        int number1;
        int number2;
        char symbol;
        String fin = "";

        while (!fin.equals("exit")) {
            System.out.println("첫번째 숫자를 입력하세요.");
            int num1 = sc.nextInt();
            System.out.println("사칙연산을 입력하세요.");
            char char1 = sc.next().charAt(0);
            System.out.println("두번째 숫자를 입력하세요.");
            int num2 = sc.nextInt();
            sc.nextLine();

            double result = calculator.calculate(num1, num2, char1);

            System.out.println(result);
            System.out.println("종료를 원하면 exit");
            fin = sc.nextLine();

        }

        List<Double> resultList = calculator.getResult();
        for (Double result : resultList) {
            System.out.println(result);

        }
    }



        public void lv1 () {
            Scanner sc = new Scanner(System.in);

            String fin = "";
            while (!fin.equals("exit")) {
                System.out.println("첫번째 숫자를 입력하세요.");
                int num1 = sc.nextInt();
                System.out.println("사칙연산을 입력하세요.");
                char char1 = sc.next().charAt(0);
                System.out.println("두번째 숫자를 입력하세요.");
                int num2 = sc.nextInt();
                sc.nextLine();

                int result = calculator(num1, num2, char1);

                System.out.println();
                System.out.println("결과는 " + result + " 입니다.");

                System.out.println("종료를 원하면 exit");
                fin = sc.nextLine();

            }
            sc.close();
        }
        public static int calculator ( int number1, int number2, char symbol){
            int result = 0;

            if (symbol == '+') {
                result = number1 + number2;
            } else if (symbol == '-') {
                result = number1 - number2;
            } else if (symbol == '*') {
                result = number1 * number2;
            } else if (number2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else if (symbol == '/') {
                result = number1 / number2;
            } else {
                System.out.println("잘못된 사칙연산입니다.");
            }
            return result;



        }
}
