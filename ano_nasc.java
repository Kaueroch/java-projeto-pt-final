import java.util.Scanner;

public class ano_nasc {
    public static int ano_nasc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual ano estamos?");
        int anoatual = scanner.nextInt();
        System.out.println("Qual ano voce nasceu?");
        int ano = scanner.nextInt();
        int idade = anoatual - ano;
        //perguntar ano que nasceu

        return idade;
    }
}
