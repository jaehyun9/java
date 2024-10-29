package test;

public class Test6 {
    public static void main(String[] args) {

        int a = 0;
        int b = 11;
        int c = 3;

        int max = a;

        if (max < b) {
            max = b;
        } if (max < c) {
            max = c;
        }
        System.out.println(max);
    }
}
