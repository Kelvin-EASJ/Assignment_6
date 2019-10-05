public class Assignment_6_38 {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i < 100; i++) {
            char c = getRandomUpperCaseLetter();
            System.out.print(c + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            char c = getRandomDigitCharacter();
            System.out.println(c + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static char getRandomCharacter (char ch1, char ch2) {
    return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
}
