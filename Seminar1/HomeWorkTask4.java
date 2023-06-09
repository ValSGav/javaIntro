// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
//Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
// Под знаком вопроса - всегда одинаковая ЦИФРА.
// Введите уравнение: ?? + ?? = 44
// Решение: 22 + 22 = 44

public class HomeWorkTask4 {
    public static void main(String[] args) {

        

    }

    public static String[] getPartsOfEquation(String equation) {

        String[] returnStrings = new String[4];
        
        int indexOfOperation = equation.indexOf("/");
        if (indexOfOperation ==-1){
            indexOfOperation  = equation.indexOf("-");
        }
        else if (indexOfOperation ==-1){
            indexOfOperation  = equation.indexOf("+");
        }
        else if (indexOfOperation ==-1){
            indexOfOperation  = equation.indexOf("*");
        }
        
        int indexOfEq   = equation.indexOf("=");

        if (indexOfEq != -1 && indexOfOperation != 1){            
            returnStrings[0] = equation.substring(0, indexOfOperation-1).replaceAll(" ", "");
            returnStrings[1] = equation.substring(indexOfOperation-1, indexOfOperation-1).replaceAll(" ", "");
            returnStrings[2] = equation.substring(indexOfOperation, indexOfEq -2).replaceAll(" ", "");
            returnStrings[3] = equation.substring(indexOfEq-1, equation.length()).replaceAll(" ", "");
        }      
        
        return returnStrings;
    }
}
