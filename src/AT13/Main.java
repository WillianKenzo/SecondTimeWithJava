
package AT13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Informe o nome do titular: ");
            String titular = sc.nextLine();

            System.out.println("Informe o saldo inicial: ");
            double saldo = sc.nextDouble();

            ContaBancaria c = new ContaBancaria(titular, saldo);

            System.out.println("Informe um valor de saque: ");
            double valor = sc.nextDouble();

            c.sacar(valor);

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida.");

        } catch (IllegalArgumentException e) {
            System.out.println("Valor inválido. " + e.getMessage());

        } catch (SaldoInsuficienteException e) {
            System.out.println("Saque não autorizado. " + e.getMessage());

        } finally {
            sc.close();
        }
    }
}
