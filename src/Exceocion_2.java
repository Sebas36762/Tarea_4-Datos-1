import java.util.Scanner;

public class Exceocion_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int uwu;
        System.out.println("Digite un número");
        try {
            uwu = scanner.nextInt();
            System.out.println(uwu);
        } catch (Exception e) {
            System.out.println("Error" + e);
        } finally {
            System.out.println("Se completo el proceso");
        }
    }
}
