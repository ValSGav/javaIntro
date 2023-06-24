package Seminar6;

public class Cat {
    private String name = "";
    private int age = 0;
    Boolean isVacciated = false;
    private Boolean sex = true;
    int levelOfAngry = 1;

    public Cat( String name, int age, Boolean sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString(){
        return "Котик " + this.name + ", возраст " + this.age + (this.sex? "male": "female");
    }


    public String doVacciated() {
        if (this.isVacciated == true) {
           return "Кот " + this.name + " уже вакцинирован!";
        } else {
            this.isVacciated = true;
            return "Кот " + this.name + " теперь вакцинирован.";
        }
    }

    public String doMeow(int count) {
        String returnString = "";
        for (int i = 0; i < count; i++) {
            returnString += "Meow!!!";
        }
        return returnString;
    }

    public void teaseTheCat() {
        if (this.levelOfAngry < 5)
            this.levelOfAngry++;
    }

    public void petTheCat() {
        if (this.levelOfAngry > 1)
            this.levelOfAngry--;
    }

    public String getTheMoodOfTheCat() {
        switch (this.levelOfAngry) {
            case 1:
                return "good";
            case 2:
                return "indifferent";
            case 3:
                return "wary";
            case 4:
                return "irritated";
            case 5:
                return "anger";
            default:
                return "good";
        }
    }

}
