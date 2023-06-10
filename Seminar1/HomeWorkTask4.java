// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
//Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
// Под знаком вопроса - всегда одинаковая ЦИФРА.
// Введите уравнение: ?? + ?? = 44
// Решение: 22 + 22 = 44

import java.util.Scanner;

public class HomeWorkTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println(
                "Введте формулу, содержащую цфры, знаки +-/*=, и знак ? вместо любой цифры (например 22? * ? = 112?): ");
        String equation = sc.nextLine();
        String[] arrOfPartsOfEquation = getPartsOfEquation(equation);

        if (arrOfPartsOfEquation[0] != null &&
                arrOfPartsOfEquation[0].matches("-?\\?*\\d*\\?*\\d*\\?*(\\.\\?*\\d*\\?*\\d*\\?*)*") &&
                arrOfPartsOfEquation[2].matches("-?\\?*\\d*\\?*\\d*\\?*(\\.\\?*\\d*\\?*\\d*\\?*)*") &&
                arrOfPartsOfEquation[3].matches("-?\\?*\\d*\\?*\\d*\\?*(\\.\\?*\\d*\\?*\\d*\\?*)*") &&
                arrOfPartsOfEquation[1].matches("[/\\*-\\+]?")) {

            String digit = "";
            Double numberOne = 0.0;
            Double numberTwo = 0.0;
            Double numberResult = 0.0;
            Double numberCalculateResult = 0.0;

            for (int i = 0; i < 10; i++) {
                digit = Integer.toString(i);
                numberOne = Double.parseDouble(arrOfPartsOfEquation[0].replaceAll("\\?", digit));
                numberTwo = Double.parseDouble(arrOfPartsOfEquation[2].replaceAll("\\?", digit));
                numberResult = Double.parseDouble(arrOfPartsOfEquation[3].replaceAll("\\?", digit));

                switch (arrOfPartsOfEquation[1]) {
                    case "*":
                        numberCalculateResult = numberOne * numberTwo;
                        break;
                    case "/":
                        numberCalculateResult = numberOne / numberTwo;
                        break;
                    case "+":
                        numberCalculateResult = numberOne + numberTwo;
                        break;
                    case "-":
                        numberCalculateResult = numberOne - numberTwo;
                        break;

                    default:
                        numberCalculateResult = 0.1;
                        break;
                }
                numberCalculateResult = (double) Math.round(numberCalculateResult * 10000) / 10000;// нагуглил как
                                                                                                   // обходить
                                                                                                   // переполнение
                                                                                                   // вещественной части
                                                                                                   // типа,
                                                                                                   // а может что-то
                                                                                                   // такое было на
                                                                                                   // лекциях по другим
                                                                                                   // языкам
                if (numberCalculateResult.equals(numberResult)) {
                    System.out.printf("Найден верный вариант подстановки: %s %s %s = %s",
                            Double.toString(numberOne),
                            arrOfPartsOfEquation[1],
                            Double.toString(numberTwo),
                            Double.toString(numberResult));
                    System.out.println();
                } else {
                    System.out.printf("- не верно(%s = %s): %s %s %s = %s",
                            Double.toString(numberCalculateResult),
                            Double.toString(numberResult),
                            Double.toString(numberOne),
                            arrOfPartsOfEquation[1],
                            Double.toString(numberTwo),
                            Double.toString(numberResult));
                    System.out.println();
                }
            }
        } else {
            System.out.println("Введена формула не соответствующая формату!");
        }
        sc.close();

    }

    public static String[] getPartsOfEquation(String equation) {

        String[] returnStrings = new String[4];

        int indexOfOperation = equation.indexOf("/");
        if (indexOfOperation == -1) {
            indexOfOperation = equation.indexOf("-");
        }
        if (indexOfOperation == -1) {
            indexOfOperation = equation.indexOf("+");
        }
        if (indexOfOperation == -1) {
            indexOfOperation = equation.indexOf("*");
        }
        int indexOfEq = equation.indexOf("=");

        if (indexOfEq != -1 && indexOfOperation != -1) {
            returnStrings[0] = equation.substring(0, indexOfOperation).replaceAll(" ", "");
            returnStrings[1] = equation.substring(indexOfOperation, indexOfOperation + 1).replaceAll(" ", "");
            returnStrings[2] = equation.substring(indexOfOperation + 1, indexOfEq).replaceAll(" ", "");
            returnStrings[3] = equation.substring(indexOfEq + 1, equation.length()).replaceAll(" ", "");
        }

        return returnStrings;
    }

}
