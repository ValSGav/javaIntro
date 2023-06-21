// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

// 123456 Иванов

// 321456 Васильев

// 234561 Петрова

// 234432 Иванов

// 654321 Петрова

// 345678 Иванов

// Вывести данные по сотрудникам с фамилией Иванов.

package Seminar5;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

       Map<Integer, String>  db = new LinkedHashMap<Integer, String>();

       db.put(3227222,"Иванов");
       db.put(6298543, "Петрова");
       db.put(7888884, "Иванов");
       db.put(9666322, "Петрова");
       db.put(0556667, "Иванов");

       for (var str : db.entrySet()) {
            if(str.getValue().equals("Иванов")){
                System.out.printf("Сотрудник %s, паспорт номер %s", str.getValue(), str.getKey());
                System.out.println();
            }
       }
        
    }
    
}
