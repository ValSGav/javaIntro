
//Дано четное число N и символы c1 c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся c1 c2, на чиная с c1

package Seminar2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");        
        
        System.out.println("Введите число N(длина строки которую хотим получить): ");
        int _N = Integer.parseInt(sc.nextLine());
        
        char c1 = 'f';
        char c2 = 'd';

        String res = getNewString(_N, c1, c2);

        System.out.println(res);

        sc.close();

    }

    public static String getNewString(int _N, char c1, char c2){
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= _N/2; i++) {
           sb.append(c1).append(c2);
        }

        return sb.substring(0, _N).toString();
    }
}
