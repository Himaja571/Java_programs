
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;   // For 3-digit numbers
            temp /= 10;
        }

        if (sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");

        sc.close();
    }
}






