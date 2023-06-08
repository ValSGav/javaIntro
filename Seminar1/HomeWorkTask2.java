// 2) Вывести все простые числа от 1 до 1000

public class HomeWorkTask2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i+=2) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }    
    }
    public static boolean isPrime(int number) {
        for (int i = 3; i < number/2; i+=2) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
