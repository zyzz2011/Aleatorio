import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);





  int numero = sc.nextInt();
    
  System.out.println("O número digitado foi");
  System.out.println(numero);
    
    if (numero > 0){
     System.out.println("O número é positivo.");
    }
    if(numero < 0){
     System.out.println("O número é negativo.");
    }
    if(numero == 0)
  sc.close();
  }

 
}