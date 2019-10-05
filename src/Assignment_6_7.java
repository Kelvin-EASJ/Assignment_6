import java.util.Scanner;

public class Assignment_6_7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Investerings numre: ");
        double investeringTal = input.nextDouble();
        System.out.print("Årlige interesse: ");
        double aarligeInteresse = input.nextDouble();

        double maanedlyInteresse = aarligeInteresse / 1200.0;

        System.out.println("Years    Future Value");
        for(int i = 1; i <= 30; i++) {
            double fremtidVaerdi = fremtidsinvesteringVaerdi(investeringTal, maanedlyInteresse, i);
            System.out.printf("%-5d    %12.2f\n", i, fremtidVaerdi);
        }
        System.out.println();
    }

    public static double fremtidsinvesteringVaerdi(double investeringTal, double maanedlyInteresse, int aar) {
        return investeringTal * Math.pow(1 + maanedlyInteresse, aar *12);
    }
}
