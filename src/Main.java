import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int num01 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        int num02 = scanner.nextInt();

        if (num01 < num02) {
            System.out.println("O maior número é " + num02);
        } else if ( num02 < num01) {
            System.out.println("O maior número é " + num01);
        } else {
            System.out.println("Os números são iguais!");
        }
    }
}