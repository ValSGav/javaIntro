package Seminar5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.naming.ldap.HasControls;

public class HomeWork {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "cp866");
        String stringMenu = "1 - Добавить контакт \n2 - Вывести всех \n3 - Выход\n>>:";
        Map<String, String> phoneBase = new HashMap<String, String>(0);

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

    public static void addContact(Scanner sc, Map<String, String> phoneBase) {
        
        System.out.println("Введите фамилию:");
        String surnameString = sc.nextLine();
        System.out.println("Введите телефон:");
        String phoneString = sc.nextLine();

        phoneBase.put(phoneString, surnameString);
        
    }

    public static void showContacts(Map<String, String> phoneBase){
        TreeMap<String, ArrayList<String>> phoneBaseGrouped = new TreeMap<String, ArrayList<String>>();
        phoneBaseGrouped.comparator().;

        phoneBase.values().iterator()

        for (var item : phoneBase.entrySet()) {
            if (phoneBaseGrouped.get(item.getValue()) == null){
                phoneBaseGrouped.put(item.getValue(), new ArrayList<String>());
            } 
            
            phoneBaseGrouped.get(item.getValue()).add(item.getKey());
        }

        phoneBaseGrouped.sort

        System.out.println(phoneBaseGrouped);

    }
}
