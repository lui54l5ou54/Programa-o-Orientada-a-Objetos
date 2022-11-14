package exemplovariavel;

import java.util.Scanner;

public class Main {
    public static int main(String[] args) {
        int soma;
        int sub;
        int mult;
        int div;
        int resto;

        div = 45 / 15;
        sub = 45 - 30;
        soma = 23 + 22;
        resto = 135 / 90;
        mult = 15 * 3;

        System.out.println(" O Valor da soma é: " + soma + ", da multiplicação: " + mult +
                ", da divisão: " + div + " da subtração é: " + sub + "e do resto é: " + resto);

//    Exemplo de Classe


//    Exercicio 1

        String n1 = "Minha terra têm Palmeiras";
        String n2 = "Onde canta o sabiá";


        if (n1.equals(n2)) {
            System.out.println("Versos são iguais");
        } else {
            System.out.println("Versos não são iguas");
        }
        ;
//  Exercicio 2

        Integer vl1 = 20;
        Integer vl2 = 10;
        int comparar;

        if (vl1.equals(vl2))
            System.out.println("São iguasis");
        else {
            comparar = vl1.compareTo(vl2);
            if (comparar > 0)
                System.out.println("Valor1 é maior que Valor2");
            else
                System.out.println("Valor2 é maior que Valor1");


//            Scanner
            //Exercicio 1

            Scanner scanner;
            scanner = new Scanner(System.in);

            String nome;
            String sobrenome;
            char in;

            char inicialN;
            char inicialS;
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();
            System.out.println("Digite seu sobrenome: ");
            sobrenome = scanner.nextLine();
            inicialN= nome.charAt(0);
            inicialS = sobrenome.charAt(0);

            System.out.println("As iniciais são: "+inicialN+inicialS);

//      Funções


            //Exercicio 1

            int numero1;
            int numero2;
//
//            System.out.println("Digite o valor do dividendo: ");
//            numero1 = scanner.nextInt();
//            System.out.println("Digite o valor do divisor: ");
//            numero2 = scanner.nextInt();

            int divisao(int numero1, int numero2){

                return numero1/numero2;
            }






        }
    }
}