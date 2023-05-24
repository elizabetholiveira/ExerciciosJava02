import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioDesconto {
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
        double imposto = (11*salario)/100;
        double inss = (8*salario)/100;
        double sindicato = (5*salario)/100;
        double liquido = salario - imposto - inss - sindicato;

        DecimalFormat formato = new DecimalFormat("0.00");

        System.out.println("O seu salário bruto esse mês é de " + formato.format(salario) + " reais.");
        System.out.println("Foram descontados R$" + formato.format(imposto) + " para o Imposto de Renda.");
        System.out.println("Foram descontados R$" + formato.format(inss) + " para o  INSS.");
        System.out.println("E foram desccontador R$" + formato.format(sindicato) + " para o sindicato.");
        System.out.println("O seu salário líquido desse mês é de " + formato.format(liquido) + " reais.");
        System.out.println("");
        System.out.println("Tenha um bom dia!");

    }
}
