/********************
 * 계산기 1.0
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
        System.out.println("input : ");

        System.out.println("result : ");
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
     * Duv int.
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
