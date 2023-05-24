import java.text.DecimalFormat;
import java.util.Scanner;

public class MetrosCentimetros {
    public static void main(String[] args) {
        System.out.println("Olá! Esse é um conversor de metros para centímetros!");

        Scanner in = new Scanner(System.in);

        System.out.println("Quantos metros você quer converter?");
        double metros = in.nextDouble();

        double centimetros = metros * 100;

        DecimalFormat formato = new DecimalFormat("0");

        System.out.println(metros + " metros é igual a " + formato.format(centimetros) + " centímetros.");
        System.out.println("Tenha um bom dia!");
    }
}
