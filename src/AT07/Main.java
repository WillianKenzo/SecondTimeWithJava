package AT07;

public class Main {
    public static void main(String[] args) {

        Professor p1 = new Professor("Galdino", "0701220471", 80, 40.00);
        Secretario s1 = new Secretario("Claudete", "0701220174", 2500);

        p1.exibirDados();
        System.out.println("Salário: R$ " + p1.calcularSalario());
        p1.registrarPresenca();

        System.out.println();

        s1.exibirDados();
        System.out.printf("Salário mensal: R$ %.2f%n", s1.calcularSalario());
        s1.registrarPresenca();


    }


}
