package aulas;
import java.util.Scanner;

public class TesteJAVA {

    //criando uma sub classe, main, dentro da classe
    public static void main (String [] args){

        //utilizando variaveis. È diferente do Javascript

        //instanciando, trazendo valores para a variável
        int soma;
        int num1 ;
        int num2 ;




        //O scanner vai estabelecer a entrada de informação, in (entrada) e out (saida)
        Scanner valor = new Scanner (System.in);


        System.out.println ("esntre  com o primeiro número : ");
        num1 = valor.nextInt();

        System.out.println ("esntre  com um segundo número : ");
        num2 = valor.nextInt();

        // aordem de execução é importante, pode causar erros
        soma = num1 + num2;

        //escrevendo com quebra de linha
        System.out.println("O resultado da soma de " + num1 + " e do " + num2 + " é " + soma );


    }
}
