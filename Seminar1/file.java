import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Input name: ");
        String name = sc.nextLine();
        //System.out.println(name);  
        System.out.printf("%s, %d", name, 45);
        sc.close();
    }
}
