import java.util.Scanner;

public class AntesEDepois {
    public static void main(String[] args) {
        System.out.println("Olá! Você tem um número e quer saber qual vem antes(antecessor) e qual vem depois(sucessor) dele? Então está no lugar certo!");

        Scanner in = new Scanner(System.in);

        System.out.println("Me diga, qual é o número que você tem?");
        int numero = in.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.print("Certo! O número anterior a " + numero + " é " + antecessor);
        System.out.println(" e o número seguinte é " + sucessor + "!");
        System.out.println(antecessor + " -> " + numero + " -> " + sucessor);
        System.out.println("Tenha um bom dia!");

    }
}
