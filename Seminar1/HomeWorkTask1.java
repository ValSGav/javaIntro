// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

/**
 * HomeWorkTask1
 */
import java.util.Scanner;

public class HomeWorkTask1 {

    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner sc = new Scanner(System.in, "cp866");
        int number = sc.nextInt();sc.nextLine();
        System.out.printf("%d! = %d", number, getFactorial(number));
        sc.close();

    }

    public static long getFactorial(long number) {
        if (number < 1)
            return -1;
        else if (number == 1)
            return 1;
        else
            return number * getFactorial(number-1);
    }
}