package numberBaseball;

import java.util.Scanner;

public class NumberBaseball {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numArr[] = new int[3]; // 세자리 숫자
        int inputArr[] = new int[3]; // 입력할 세자리 숫자
        int strike = 0; // 자리수 or 숫자가 1개 맞으면 스트라이크
        int ball = 0; // 하나도 맞지않으면 볼

        for (int i = 0; i < numArr.length; i++) { // 숫자 i 를 초기화, i의 길이가 배열의 길이보다 짧으면 i++
            numArr[i] = (int)(Math.random() * 9 + 1);   // 랜덤숫자
                for (int j = 0; j < i; j++) {
                    if(numArr[i] == numArr[j]) {
                        i--;
                            break;
                    }
                }
        }
        for (int number : numArr) {
            System.out.println(number + " ");
        }

    }
}
