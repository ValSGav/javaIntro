package Seminar6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class FinalHomeWork {
    public static void main(String[] args) {

        HashSet<Notebook> setOfNotebook = getSetOfNotebook();

        HashMap<String, String> filter = new HashMap<String, String>();

        Scanner sc = new Scanner(System.in, "cp866");
        String stringMenu = String.join("\n",
                "Выберите критерии отбора ноутбука:",
                "1 - Минимальный размер ОЗУ",
                "2 - Тип диска(HDD\\SSD)",
                "3 - Минимальный размер диска",
                "4 - Операционная система",
                "5 - Максимальная диагональ ноутбука",
                "6 - Максимальный вес",
                "7 - Очистить отбор",
                "8 - Вывести походящие ноутбуки",
                "9 - Выход");

        System.out.print(stringMenu + 
                                String.join("\n","", 
                                String.format("Текущий фильтр: %s", filter.toString()),
                                ">>:"));

        boolean isExit = false;
        while (!isExit) {
            switch (sc.nextLine()) {
                case "1":
                    System.out.println("Введите размер ОЗУ: ");
                    addConditionToFilter(filter, "sizeOfOperationMemoryInGb",  sc.nextLine());
                    break;
                case "2":
                    System.out.println("Введите тип системного диска (HDD/SSD): ");
                    addConditionToFilter(filter, "diskType",  sc.nextLine());                    
                    break;
                case "3":
                    System.out.println("Введите размер системного диска (в Tb): ");
                    addConditionToFilter(filter, "diskCapacity",  sc.nextLine());                    
                    break;
                case "4":
                    System.out.println("Введите название операционной системы (Windows/Linux/IOS): ");
                    addConditionToFilter(filter, "operationSystem",  sc.nextLine());                    
                    break;
                case "5":
                    System.out.println("Введите диагональ ноутбука: ");
                    addConditionToFilter(filter, "diagonal",  sc.nextLine());                    
                    break;
                case "6":
                    System.out.println("Введите вес ноутбука: ");
                    addConditionToFilter(filter, "weight",  sc.nextLine());                    
                    break;
                case "7":
                    filter.clear();
                    break;
                case "8":
                    showNoteBookWithFilter(setOfNotebook, filter);
                    break;
                case "9":
                    isExit = true;
                    break;

                default:
                    System.out.print("Выберите один из указанных пунктов меню:");
                    
                    break;

            }
            System.out.print(stringMenu +  
                                String.join("\n","", 
                                String.format("Текущий фильтр: %s", filter.toString()),
                                ">>:"));
        }
        sc.close();

    }

    public static HashSet<Notebook> getSetOfNotebook() {
        Disk disk2Tb = new Disk("Samsung", false, true, 2);
        Disk disk4Tb = new Disk("Toshiba", false, true, 4);
        Disk disk6Tb = new Disk("Western Digital", false, true, 6);

        HashSet<Notebook> setNotebooks = new HashSet<Notebook>();

        setNotebooks.add(new Notebook((float) 1.4, (float) 14.0, 8, disk2Tb, "Windows"));
        setNotebooks.add(new Notebook((float) 1.2, (float) 14.0, 8, disk2Tb, "Linux"));
        setNotebooks.add(new Notebook((float) 1.1, (float) 15.2, 16, disk4Tb, "Windows"));
        setNotebooks.add(new Notebook((float) 1.3, (float) 13.0, 16, disk4Tb, "IOS"));
        setNotebooks.add(new Notebook((float) 1.0, (float) 13.0, 16, disk6Tb, "IOS"));

        return setNotebooks;
    }

    public static void addConditionToFilter(HashMap<String, String> filter, String condition, String value){
        filter.put(condition, value);
    }

    public static void showNoteBookWithFilter(HashSet<Notebook> setOfNotebook, HashMap<String, String> filter){

        for (Notebook itemNotebook : setOfNotebook) {
            if (itemNotebook.isMeetsTheFilterCondition(filter)){
                System.out.println(itemNotebook.toString());
            }
        }

    }

}
