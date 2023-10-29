import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int weight;
        int volume;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Наша программа позволит вам вычислить плотность");

        System.out.print("Введите значение массы: ");
        weight = scanner.nextInt();

        System.out.print("Введите значение объема: ");
        volume = scanner.nextInt();

        double density = weight / volume;

        System.out.println("Значение плотности = "+density+" кг/м³");


    }
}