import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in stopwatch \n1: Start \n2: Stop");
        System.out.println("Choose Option ");
        int option1 = scanner.nextInt();

        if(option1 == 1) {
            long start = System.nanoTime();
            System.out.println("Chose option 2 for stop");
            int option2 = scanner.nextInt();
            if(option2 == 2){
                long stop = System.nanoTime();
                double time = ((stop - start) / 1000000000);
                System.out.println("Time is " + time + "second");
            }
            else {
                System.out.println("You choose wrong option");
            }
        }
        else {
            System.out.println("Chose start first");
        }
    }
}
