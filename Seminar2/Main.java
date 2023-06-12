package Seminar2;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        String str = "asdf";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.toString());
        sb.append("mumu");
        sb.append("tutu");
        System.out.println(sb.toString());

    }

}
