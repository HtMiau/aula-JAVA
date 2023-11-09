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

            if (Imc<=18.5){
                System.out.println("Você está no normal.");
            }else if (Imc>=18.5 && Imc<=24.9) {
                System.out.println("você está com Magreza");
            }
            if (Imc>=25 && Imc<=29.9) {
                System.out.println("Você está com sobre peso");
            } else
            if (Imc>= 30  && Imc<=34.9){
                System.out.println( "Você está com Obesidade grau 1");
            } else
            if (Imc>=35 && Imc<= 39.9) {
                System.out.println("Você está com Obesidade grau 2");
            } else
            if (Imc>40.0){
                System.out.println("Você está com Obesidade grau 3 ");
            }


    }

}
