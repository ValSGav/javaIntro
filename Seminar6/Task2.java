// Реализовать класс Cat
// Доабвить в него поля:
// Имя, возраст, привит ли кот (boolean), пол
// Добавить методы:
// Кот Имя мяукнул n раз
// Прививка кота, если был привит - сообщить об этом
// ПРидумать 1-2 своих метода

package Seminar6;

public class Task2 {
    public static void main(String[] args) {
        Cat Kot = new Cat("Барни", 3, true);
        
        System.out.println(Kot);
        System.out.println(Kot.doVacciated());
        Kot.doMeow(10);
        System.out.println(Kot.doVacciated());
        System.out.println(Kot.getTheMoodOfTheCat());
        Kot.teaseTheCat();
        System.out.println(Kot.getTheMoodOfTheCat());
        Kot.petTheCat();
        System.out.println(Kot.getTheMoodOfTheCat());
        Kot.teaseTheCat();
        System.out.println(Kot.getTheMoodOfTheCat());
        Kot.teaseTheCat();
        System.out.println(Kot.getTheMoodOfTheCat());
        Kot.teaseTheCat();
        System.out.println(Kot.getTheMoodOfTheCat());
        Kot.teaseTheCat();
        System.out.println(Kot.getTheMoodOfTheCat());
    }
    
}


