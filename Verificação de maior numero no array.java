import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int array[] = new int[10];
        int maior = -1000000;
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o " + (i + 1) + "º número: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Agora irá ser realizada a verificação do maior numero dentro do array.\n");
        for (int i = 0; i < 10; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        System.out.println("O maior número do array é: " + maior);
    }
}
