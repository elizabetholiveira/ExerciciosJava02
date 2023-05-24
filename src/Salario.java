import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        System.out.println("Olá! Vamos calcular as suas horas para ver qual o seu salário esse mês!");

        Scanner in = new Scanner(System.in);

        System.out.println("Quanto você ganha pela hora?");
        double ganhohora = in.nextDouble();

        System.out.println("Quantas horas você trabalhou por dia esse mês?");
        double horadia = in.nextDouble();

        System.out.println("Quantos dias você trabalhou esse mês?");
        double diasmes = in.nextDouble();

        System.out.println("Calculando...");

        double salario = diasmes * horadia * ganhohora;

        DecimalFormat formato = new DecimalFormat("0.00");

        System.out.println("O seu salário esse mês é de " + formato.format(salario) + " reais.");
        System.out.println("Tenha um bom dia!");
    }
}
