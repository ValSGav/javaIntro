//напишите метод, который сжимает строку.
//пример вход aaaabbbcdd
//выход a4b3cd2

package Seminar2;

public class task2 {
    public static void main(String[] args) {

        String str = "aaaabbbcdd";
        System.out.println(str);
        System.out.println(compressString(str));

    }

    public static String compressString(String str) {
        StringBuilder returnString = new StringBuilder();
        returnString.append(str.charAt(0));
        int currentCountOfChar = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != (str.charAt(i - 1))) {
                if (currentCountOfChar != 1)
                    returnString.append(currentCountOfChar);
                currentCountOfChar = 1;
                returnString.append(str.charAt(i));
            } else {
                currentCountOfChar++;
            }

        }
        if (currentCountOfChar != 1) {
            returnString.append(currentCountOfChar);
        }
        return returnString.toString();
    }
}
