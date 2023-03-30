import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое целое число: ");
            int a = sc.nextInt();
            System.out.println("Введите второе целое число: ");
            int b = sc.nextInt();

            if (a == b) {
                System.out.println(a + " = " + b);
            } else if (a < b) {
                System.out.println(a + " < " + b);
            } else {
                System.out.println(a + " > " + b);
            }
    }
}