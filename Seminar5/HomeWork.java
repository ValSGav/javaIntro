package Seminar5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HomeWork {


    //Позаимствовал сортировку мэпа из интернетов, но я разобрался, честно!
    //Просто не нашел сортировки по value, везде пишут, что comporator можно настроить 
    //исключительно в разрезе ключа мэпа, а тут, насколько я понял(но это не точно), что-то переопределили, и стало можно :)
    public static <K, V extends Comparable<V>> Map<String, ArrayList<String>> valueSort(final Map<String, ArrayList<String>> map) {
       
        Comparator<String> valueComparator = new Comparator<String>() {
            // return comparison results of values of
            // two keys
            public int compare(String k1, String k2) {
                if (map.get(k1).size() < map.get(k2).size())
                    return 1;
                else
                    return -1;
            }

        };

        // SortedMap created using the comparator
        Map<String, ArrayList<String>> sorted = new TreeMap<String, ArrayList<String>>(valueComparator);

        sorted.putAll(map);

        return sorted;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "cp866");
        String stringMenu = "1 - Добавить контакт \n2 - Вывести всех \n3 - Выход\n>>:";
        Map<String, ArrayList<String>> phoneBase = new TreeMap<String, ArrayList<String>>();

        System.out.print(stringMenu);

        boolean isExit = false;
        while (!isExit) {
            switch (sc.nextLine()) {
                case "1":
                    addContact(sc, phoneBase);
                    System.out.print(stringMenu);
                    break;
                case "2":
                    showContacts(phoneBase);
                    System.out.print(stringMenu);
                    break;
                case "3":
                    isExit = true;
                    break;

                default:
                    System.out.print("Выберите один из указанных пунктов меню:");
                    System.out.println(stringMenu);
                    break;
            }
        }
        sc.close();
    }

    public static void addContact(Scanner sc, Map<String, ArrayList<String>> phoneBase) {

        System.out.println("Введите фамилию:");
        String surnameString = sc.nextLine();
        System.out.println("Введите телефон:");
        String phoneString = sc.nextLine();

        if (!phoneBase.containsKey(surnameString)){
            phoneBase.put(surnameString, new ArrayList<String>());
        }

        phoneBase.get(surnameString).add(phoneString);

    }

    public static void showContacts(Map<String, ArrayList<String>> phoneBase) {

        System.out.println(valueSort(phoneBase));

    }

}
