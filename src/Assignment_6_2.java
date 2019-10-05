import java.util.Scanner;

public class Assignment_6_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Skriv nogen tal: ");
        long taal = input.nextLong();

        System.out.println("Summen af tallene: " +sumDigits(taal));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
