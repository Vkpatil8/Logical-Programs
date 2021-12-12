import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = scanner.nextInt();
        int result = 0;
        for (int i =2; i<num; i++){
            if (num % i == 0) {
                result = 1;
                break;
            }
        }
        if (result == 1)
            System.out.println(num + " is composite number ");
        else
            System.out.println(num + " is perfect numbers");
    }
}