import java.util.Scanner;

;
public class Main {
    public static void main(String[] args) {

        ano_nasc bb = new ano_nasc();
        int idadeUsuario = bb.ano_nasc(); //criar uma variavel para mostrar é totalmente válido tambem e o ideal
        System.out.println("Sua idade é: " + idadeUsuario);
        if(idadeUsuario > 18){
            System.out.println("Você é maior de idade!!");
        }else{
            System.out.println("Você é menor de idade!");

        }
         cachorro ba = new cachorro();
        String cachorro = ba.cachorro();
        System.out.println(cachorro);
        String nome = "Kauê";
        String Sobrenome= "Alcantara Rocha";
       nomecompleto(nome,Sobrenome);
       System.out.println(nomecompleto(nome,Sobrenome));
    }

    public static String nomecompleto(String nome , String Sobrenome){

        return "Seu nome completo é: " +  nome + ""+ Sobrenome;
    }

}