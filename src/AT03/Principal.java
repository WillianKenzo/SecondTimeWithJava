package AT03;

public class Principal {
    public static void main(String[] args) {

        Guerreiro g = new Guerreiro("Aragorn", 20);

        Mago m = new Mago("Patolino", 100);

        System.out.println("--Guerreiro Honrado--");
        g.exibirStatus();
        g.atacar();

        System.out.println();

        System.out.println("--Mago Supremo--");
        m.exibirStatus();
        m.atacar();

    }
}
