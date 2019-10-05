import java.util.Scanner;
import java.util.Arrays;

public class Assignment_6_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("indtast tre tal ");
        double tal1 = input.nextDouble();
        double tal2 = input.nextDouble();
        double tal3 = input.nextDouble();

        displayTal (tal1, tal2, tal3);
    }

    public static void displayTal(double tal1, double tal2, double tal3) {
        double[] Array = {tal1, tal2, tal3};
        Arrays.sort(Array);
        for (double tal: Array) {
            System.out.println(tal + " ");

        }

        System.out.println();

    }
}
