import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Exercício Guiado

        Scanner scanner;
        scanner = new Scanner(System.in);
        String nome;
        String sobrenome;
        int dia;
        int mes;
        int ano;
        char inicialN;
        char inicialS;

        System.out.println("Digite seu nome: ");
        nome= scanner.nextLine();
        inicialN = nome.charAt(0);

        System.out.println("Digite seu sobrenome: ");
        sobrenome= scanner.nextLine();
        inicialS = sobrenome.charAt(0);


        System.out.println("Digite o dia do seu nascimento: ");
        dia = scanner.nextInt();

        System.out.println("Digite o mês do seu nascimento: ");
        mes = scanner.nextInt();

        System.out.println("Digite o ano do seu nascimento: ");
        ano = scanner.nextInt();

        System.out.println("O nome do usuário é: "+nome+" "+sobrenome+" con iniciais: "+inicialN
        +inicialS+", cuja data de nascimento é: "+dia+"/"+mes+"/"+ano);


        //Mesa

        //Exercico 1




        private static boolean ehPrimo(int numero) {
            for (int j=2; j< numero; j++){
                if (numero% j==0)
                    return false;
            };
            return true;
        }

        System.out.println("Digite o ano do seu nascimento: ");




        //Exercicio 2

    }
}