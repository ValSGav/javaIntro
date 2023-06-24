// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. Вывести название каждой планеты и количество его повторений в списке.

package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>(
                Arrays.asList("Земля", "Земля", "Земля", "Меркурий", "Венера", "Меркурий", "Плутон"));
        planets.sort(null);
        int count = 1;
        for (int i = 1; i < planets.size(); i++) {
            if (planets.get(i).equals(planets.get(i-1))) {
                count++;
            } else {
                System.out.printf("%s:%s", planets.get(i-1), count);
                System.out.println();
                count = 1;
            }
        }
       
        if (count != 1) {
           System.out.printf("%s:%s", planets.get(planets.size() - 1), count);
           System.out.println();
        } else {
           System.out.printf("%s:%s", planets.get(planets.size() - 1), "1");
            System.out.println();
        }

        List<Character> list1 = List.of('1', '2','3');
        System.out.println(list1);

    }
}
