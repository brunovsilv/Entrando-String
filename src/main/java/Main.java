import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner SC = new
  Scanner(System.in);
    
    System.out.println("Digite seu primeiro nome:");
    String nome = SC.next();

     System.out.println("Digite seu sobrenome:");
       String sobrenome = SC.next();

    System.out.println("Seu nome completo é: " + nome + " " + sobrenome);

    SC.close();
  }


}