import java.util.Scanner;

public class ListaTarefa01
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite 3 números e veja a media aritmetica... ");
    double num1 , num2 , num3 , media ;
    
    System.out.print("numero 1: ");
    num1 = sc.nextDouble();
    System.out.print("numero 2: ");
    num2 = sc.nextDouble();
    System.out.print("numero 3: ");
    num3 = sc.nextDouble();

    media = (num1+ num2+ num3)/ 3;

    System.out.println("a media e: " + media);
    
    if ( num1 >= num2 && num1 >= num3 ) {
        System.out.println("o maior número é: " + num1);
    } else if ( num2 >= num1 && num2 >= num3 ) {
        System.out.println("o maior número é: " + num2);
    }  else if ( num3 >= num1 && num3 >= num2 ) {
        System.out.println("o maior número é: " + num3);
    } 
    
    if ( num1 <= num2 && num1 <= num3 ) {
        System.out.println("o menor número é: " + num1);
    } else if ( num2 <= num1 && num2 <= num3 ) {
        System.out.println("o menor número é: " + num2);
    }  else if ( num3 <= num1 && num3 <= num2 ) {
        System.out.println("o menor número é: " + num3);
    } 
    

    sc.close();
    }
}
