package At02;
import AT02.EntregaLocal;
import AT02.EntregaNacional;

public class Principal {

    public static void main(String[] args) {

        EntregaLocal entregaLocal = new EntregaLocal("PED001");

        EntregaNacional entregaNacional = new EntregaNacional("PED002", 100);

        entregaLocal.exibirResumo();

        entregaNacional.exibirResumo();
    }
}
