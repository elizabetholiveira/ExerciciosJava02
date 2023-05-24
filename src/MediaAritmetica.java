import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        System.out.print("Olá! Vamos calcular a média aritmética simples das suas notas dos bimestres?");
        System.out.println(" Por favor, preencha com suas notas abaixo!");

        Scanner in = new Scanner(System.in);

        //double primeirobi = in.nextDouble();
        //double segundobi = in.nextDouble();
        //double terceirobi = in.nextDouble();
        //double quartobi = in.nextDouble();

        System.out.print("Nota do primeiro bimestre = ");
        double primeirobi = in.nextDouble();

        System.out.print("Nota do segundo bimestre = ");
        double segundobi = in.nextDouble();

        System.out.print("Nota do terceiro bimestre = ");
        double terceirobi = in.nextDouble();

        System.out.print("Nota do quarto bimestre = ");
        double quartobi = in.nextDouble();

        System.out.println("Calculando...");

        DecimalFormat formato = new DecimalFormat("0.0");
        double media = (primeirobi + segundobi + terceirobi + quartobi) / 4;

        System.out.println("A sua média final é = " + formato.format(media));
        System.out.println("Tenha um bom dia!");
    }
}
