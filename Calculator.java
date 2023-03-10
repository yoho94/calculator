/********************
 * 계산기 1.0 hotfix
 ********************/

import java.util.Scanner;

/**
 * The type Calculator.
 */
public class Calculator {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a ? b : ");
        int a = sc.nextInt();
        char c = sc.next().charAt(0);
        int b = sc.nextInt();

        int result;

        switch (c) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = sub(a, b);
                break;
            case '/':
                result = div(a, b);
                break;
            case '%':
                result = mod(a, b);
                break;
            case '*':
            case 'X':
            case 'x':
                result = mul(a, b);
                break;
        }

        System.out.println("result : " + result);
    }

    /**
     * Add int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public static int add(int a, int b) {
        return 0;
    }

    /**
     * Sub int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public static int sub(int a, int b) {
        if (a >= b) {
            System.out.print("a가 b보다 큽니다.");
        } else {
            System.out.print("a가 b보다 작습니다.");
        }
        return Math.max(a, b) - Math.min(a, b);
    }

    /**
     * Div int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public static int div(int a, int b) {

        return a / b;
    }

    /**
     * Mul int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public static int mul(int a, int b) {
        return 0;
    }

    /**
     * Mod int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public static int mod(int a, int b) {
        return a % b;
    }

}
