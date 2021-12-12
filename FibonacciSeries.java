import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        //variables
        int num1=0;
        int num2=1;
        int num3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of terms: ");
        int noOfTerms = sc.nextInt();

        System.out.print(num1+" "+num2);
        for(int i=2; i<noOfTerms; i++) {
            num3 = num1 + num2;
            System.out.print(" "+num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
