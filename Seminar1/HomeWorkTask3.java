
// Реализовать простой калькулятор (+-/*)
import java.util.Scanner;

public class HomeWorkTask3 {
    public static void main(String[] args) {
        boolean isExit = false;
        int counter = 0;
        double res;
        String firstNumber = "";
        String secondNumber = "";
        String operation = "";
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Для выхода введите 'q' и Enter");

        while (!isExit) {
            switch (counter) {
                case 0: // первое число
                    System.out.print("Введите первое число: ");
                    firstNumber = sc.next();
                    sc.nextLine();
                    counter++;
                    break;
                case 1: // знак
                    System.out.print("Введите операцию('+' или '-' или '*' или '/''): ");
                    operation = sc.next();
                    sc.nextLine();
                    counter++;
                    break;
                case 2: // второе число
                    System.out.print("Введите второе число: ");
                    secondNumber = sc.next();
                    sc.nextLine();
                    counter++;
                    break;
                case 3: // результат
                    switch (operation) {
                        case "/":
                            res = Double.valueOf(firstNumber) / Double.valueOf(secondNumber);
                            break;
                        case "*":
                            res = Double.valueOf(firstNumber) * Double.valueOf(secondNumber);
                            break;
                        case "+":
                            res = Double.valueOf(firstNumber) + Double.valueOf(secondNumber);
                            break;
                        case "-":
                            res = Double.valueOf(firstNumber) - Double.valueOf(secondNumber);
                            break;

                        default:
                            res = 0;
                            break;
                    }
                    ;
                    System.out.printf("%f %s %f = %f", Double.valueOf(firstNumber), operation,
                            Double.valueOf(secondNumber), res);
                    System.out.println();
                    ;
                    counter++;
                    break;
                default: // начинаем заново
                    counter = 0;
                    break;
            }

            if (firstNumber.equals("q")
                    || secondNumber.equals("q")
                    || operation.equals("q"))
                isExit = true;

        }
        sc.close();

        // String a = "asdfas/fda";
        // if (a.contains(String.valueOf("/"))){
        // operatorPosition = a.indexOf("/");

    }
}
