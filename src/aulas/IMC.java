package aulas;
import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        float peso;
        float altura;

        float Imc;

        Scanner valor = new Scanner(System.in);

        System.out.println(" insira seu peso");
        peso = valor.nextFloat();

        System.out.println(" insira sua altura ");
        altura = valor.nextFloat();

        Imc= peso/(altura*altura);

        System.out.println("Seu Indice de Massa Corporal é :" + Imc);



    }

}
