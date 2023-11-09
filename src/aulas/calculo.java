package aulas;

import java.util.Scanner;

public class calculo {

    public static void main(String[] args) {

        int num1;
        int num2;



        int soma;
        int subtracao;
        int divisao;
        int multiplicacao;


        Scanner valor = new Scanner(System.in);


        System.out.println(" insira um número ");
        num1 = valor.nextInt();

        System.out.println(" insira um seundo número ");
        num2 = valor.nextInt();



        soma = num1 + num2;
        System.out.println("O resultado da soma é: "+soma);

        subtracao = num1 - num2;
        System.out.println("O resultado da sbtração é: "+subtracao);

        divisao = num1/num2;
        System.out.println("O resultado da divisão é: " + divisao);

        multiplicacao = num1 * num2;
        System.out.println( "O resultado da multiplicação é: " + multiplicacao);

    }
}
