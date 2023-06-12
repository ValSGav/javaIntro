// 1) Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow

package Seminar2;

import java.util.Scanner;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        
        String queueString = "select * from students WHERE";

        //String jsonString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.println("Введите строку условий, которую Вы хотите добавить к запросу: ");
        String jsonString = sc.nextLine();
        StringBuilder workStr = new StringBuilder(queueString);

        String[] arrStrings = 
            jsonString.replaceAll("\"", "").replaceAll("\\{", "").replaceAll("\\}", "").split(",");
        for (int i = 0; i < arrStrings.length; i++) {
            String[] arrKeyAndValue = arrStrings[i].split(":");
            if (!arrKeyAndValue[1].equals("null")){
                if(i !=0) workStr.append(" AND");
                workStr.append(" ").append(arrKeyAndValue[0].strip()).append("=").append(arrKeyAndValue[1].strip());
            }
        }
        
        System.out.println(workStr.toString());
    }
}
