import java.util.Scanner;

// Soal 1 - Data Types
public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.print("Masukkan angka ke-" + (t + 1) + ": ");
            String input = scanner.next();

            try {
                long n = Long.parseLong(input);

                boolean fitByte = (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE);
                boolean fitShort = (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE);
                boolean fitInt = (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE);

                System.out.println(n + " can be fitted in:");
                if (fitByte) System.out.println("* byte");
                if (fitShort) System.out.println("* short");
                if (fitInt) System.out.println("* int");
                System.out.println("* long");

            } catch (NumberFormatException e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }

        scanner.close();
    }
}
