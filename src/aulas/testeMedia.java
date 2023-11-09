package aulas;
import java.util.Scanner;

public class testeMedia {
    public static void main(String[] args) {
        float num1;
        float num2;
        float num3;
        float num4;

        float media;

        Scanner valor = new Scanner(System.in);


        System.out.println("entre  com uma nota: ");
        num1 = valor.nextFloat();

        System.out.println("entre  com uma segunda nota : ");
        num2 = valor.nextFloat();

        System.out.println("entre  com uma terceira nota : ");
        num3 = valor.nextFloat();

        System.out.println("entre  com uma quarta nota : ");
        num4 = valor.nextFloat();

        media = (num1 + num2 + num3 + num4)/ 4;


        System.out.println("O resultado da media é " + media);

        if (media>=6){
            System.out.println("Aluno aprovado!!!");
        } else {
            System.out.println("Aluno Reprovado!!!!");
        }


    }
}
