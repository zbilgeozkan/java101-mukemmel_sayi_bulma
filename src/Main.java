
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        num = input.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total = total + i;
            }
        }
        if (total == num) {
            System.out.println(num + " mükemmel sayıdır. ");
        }
        else {
            System.out.println(num + " mükemmel sayı değildir. ");
        }

    }
}