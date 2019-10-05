public class Assignment_6_6 {

    public static void main(String[] args) {
        displayPattern(10);
    }

    public static void displayPattern(int n) {
        int bredde = getBredde(n);

        String pad = "";
        for (int i = 0; i < bredde; i++) {
            pad += " ";
        }

        for (int i = 1; i <= n; i++) {
        for (int j = 0; j < n - i; j++) {
            System.out.println(pad);
        }
        for (int k = i; k >= 1; k--) {
            System.out.print(String.format("%-"+bredde+"d", k));
        }
            System.out.println();
        }
    }

    private static int getBredde(int n) {
        StringBuilder s = new StringBuilder(n + "");
        return s.length() + 1;
    }
}
