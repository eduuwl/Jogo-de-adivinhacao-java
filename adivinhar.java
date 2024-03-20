import java.util.Scanner;
import java.util.Random;

public class aleatorio {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroaleatorio = rd.nextInt(25) + 1;
        int tentativas = 0;
        int palpite;
        System.out.println("adivinhe um numero de 1 a 25 ");
        do {
            System.out.print("Insira seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;
            if (palpite < numeroaleatorio) {
                System.out.println("O numero e maior ");
            } else if (palpite > numeroaleatorio) {
                System.out.println("O numero e menor ");
            } else {
                System.out.println("Parabens Sacana!!! " + numeroaleatorio + " em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroaleatorio);

        scanner.close();
    }
}
