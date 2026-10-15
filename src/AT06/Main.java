package AT06;

public class Main {
    public static void main(String[] args) {
        Impressora i1 = new Impressora("HP");
        Impressora i2 = new Impressora("Epson");
        CaixaDeSom c1 = new CaixaDeSom("JBL");

        i1.conectar();
        i1.desconectar();

        System.out.println();

        i2.conectar();
        i2.desconectar();

        System.out.println();

        c1.conectar();
        c1.desconectar();

    }
}
