import java.text.DecimalFormat;
import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {
        System.out.println("Olá! Eu sou um conversor de Fahrenheit para Celsius!");

        Scanner in = new Scanner(System.in);

        System.out.println("Qual a temperatura de Fahrenheit que você deseja converter?");
        double fahrenheit = in.nextDouble();

        System.out.println("Calculando...");

        double celsius = (fahrenheit - 32) / 1.8;

        DecimalFormat grau = new DecimalFormat("0.0");

        System.out.println(fahrenheit + " em fahrenheit é igual a " + grau.format(celsius) + " em celsius.");
        System.out.println("Tenha umm bom dia!");
    }
}
