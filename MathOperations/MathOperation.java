package MathOperations;
import java.util.Scanner;

import static java.lang.Math.*;

public class MathOperation{
    public static int add(int a, int b) {
        // Your code here
        return addExact(a,b);
    }

    public static int subtract(int a, int b) {
        // Your code here
        return subtractExact(a,b);
    }

    public static int multiply(int a, int b) {
        // Your code here
        return multiplyExact(a,b);
    }

    public static float divide(int a, int b) {
        // Your code here
        return floorDiv(a,b);
    }
    public static void main(String[] args) {
        // Demonstrate the math operations here
        Scanner input = new Scanner(System.in);
        System.out.println(" This Program will compute the mathematical Operation\n");
        System.out.println(" Enter First Number :");
        int num = input.nextInt();
        System.out.println("Enter Second Number :");
        int  num1 = input.nextInt();
        System.out.println("Select Mathematical Operation \ninput 1 for [add]\ninput 2 for [subtract]\ninput 3 for [multiply]\ninput 4 for [divide]");
        int Operation=input.nextInt();
        switch (Operation) {
            case 1: {
                System.out.println(num + " + " + num1 + " = " + add(num, num1));
                break;
            }
            case 2: {
                System.out.println(num + " - " + num1 + " = " +subtract(num,num1));
                break;
                }
            case 3: {
                System.out.println(num + " * " + num1 + " = " +multiply(num,num1));
                break;
            }
            case 4: {
                System.out.println(num + " / " + num1 + " = " +divide(num,num1));
                break;
            }
            default:
                System.out.println(" Wrong input");
        }

    input.close();

    }
}

