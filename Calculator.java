package Calculator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Calculator {

    private final List<Double> result = new ArrayList<>();

    public double calculate(int number1, int number2, char symbol) {

        if (symbol == '+') {
            result.add((double) number1 + number2);
            return number1 + number2;
        } else if (symbol == '-') {
            result.add((double) number1 - number2);
            return number1 - number2;
        } else if (symbol == '*') {
            result.add((double) number1 * number2);
            return number1 * number2;
        } else if (number2 == 0) {
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        } else if (symbol == '/') {
            result.add((double) number1 / number2);
            return number1 / number2;
        } else {
            System.out.println("잘못된 사칙연산입니다.");
        }
        return 0.0;
    }

    public List<Double> getResult() {
        return result;
    }
    public void setResult(Double result) {
        this.result.add(result);
    }
    Queue<Integer> deleteList = new LinkedList<>();
    Integer deleteList = Queue.remove();

}
