// Дана строка в файле(читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит строчку и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package Seminar2;

import java.io.FileReader;
import java.io.File;
import java.nio.charset.Charset;


public class HomeWorkTask3 {
    public static void main(String[] args) {

        String fileName = "Seminar2/HWT3test.txt";
        try {
            File fl = new File(fileName);
            FileReader fr = new FileReader(fileName, Charset.forName("cp866"));    
            char[] buff = new char[(int) fl.length()];
            fr.read(buff);

            //String[] arrayOfStringStudentsData = parseStringFromFile(buff.toString());

            // for (String stringStudentData : arrayOfStringStudentsData) {
               
            //     //String arrayOfData[] = parseStringOfData(stringStudentData);
            // }

            fr.close();
        } catch (Exception e) {
            // TODO: handle exception
        };        
    }

    public static String[] parseStringOfData(String inputData){
        inputData = inputData.replaceAll("\"", "");
        String[] arrayOfStringData = inputData.split("\\,");
        return arrayOfStringData;
    }


    public static String[] parseStringFromFile(String inputData){
        
        inputData = inputData.replaceAll("[\\[\\]]", "");
        String[] arrayOfStringStudentsData = inputData.split("\\}\\,\\{");
                
        for (String inputString : arrayOfStringStudentsData) {
            inputString = inputString.replaceAll("[\\{\\}]", "");

        }

        return  arrayOfStringStudentsData;
    }
}
