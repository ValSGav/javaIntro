// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
// 1 3 4 2
// 1 3 2 4
// 1 2 3 4

package Seminar2;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HomeWorkTask2 {
    /**
     * @param args
     * @throws SecurityException
     * @throws IOException
     */
    public static void main(String[] args) {

        int[] arr = { 7, 3, 1, 2, 5, 8, 4 };
        sortArray(arr);

    }

    public static void sortArray(int[] arr) {
        Logger logger = Logger.getLogger("HomeWorkTask2");
        try {
            FileHandler fh = new FileHandler("log.txt");
            ConsoleHandler ch = new ConsoleHandler();
            logger.removeHandler(ch);
            logger.addHandler(fh);

            boolean isNotDone = true;
            for (int i = 0; i < arr.length - 1 && isNotDone; i++) {
                isNotDone = false;
                for (int j = 0; j < (arr.length - 1 - i); j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        logger.log(Level.INFO, arrayElementsToString(arr));
                        ;
                        isNotDone = true;
                    }
                }
            }
            logger.removeHandler(fh);
            fh.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static String arrayElementsToString(int[] arr) {
        StringBuilder sbResultString = new StringBuilder();

        String separator = "";
        for (int i = 0; i < arr.length; i++) {
            sbResultString.append(separator);
            sbResultString.append(arr[i]);
            separator = ";";
        }
        return sbResultString.toString();
    }
}
