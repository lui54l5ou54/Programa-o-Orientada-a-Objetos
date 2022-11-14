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




    }
}