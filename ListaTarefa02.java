import java.util.Scanner;

public class MaquinaVendas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor pago: R$ ");
        double valorPago = leitor.nextDouble();

        System.out.print("Valor da compra: R$ ");
        double valorCompra = leitor.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("Quantia paga é insuficiente para realizar a compra.");
        } else {
            int trocoTotal = (int) (valorPago - valorCompra);
            System.out.println("Troco: R$ " + trocoTotal + ",00");

            int resto = trocoTotal;

            // Calculando as notas
            int notas50 = resto / 50;
            resto = resto % 50;

            int notas20 = resto / 20;
            resto = resto % 20;

            int notas10 = resto / 10;
            resto = resto % 10;

            int notas5 = resto / 5;
            resto = resto % 5;

            int notas2 = resto / 2;
            resto = resto % 2;

            int notas1 = resto;

            // Exibindo os resultados
            System.out.println("Notas de R$ 50,00: " + notas50);
            System.out.println("Notas de R$ 20,00: " + notas20);
            System.out.println("Notas de R$ 10,00: " + notas10);
            System.out.println("Notas de R$ 5,00: " + notas5);
            System.out.println("Notas de R$ 2,00: " + notas2);
            System.out.println("Notas de R$ 1,00: " + notas1);
        }

        leitor.close();
    }
}