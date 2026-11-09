package AT19;

public class Main {
    public static void main(String[] args) {

        Caixa<String> nomeProduto = new Caixa<>();
        Caixa<Integer> quantidadeProduto = new Caixa<>();
        Caixa<Double> preco = new Caixa<>();

        nomeProduto.guardar("Caderno");
        quantidadeProduto.guardar(10);
        preco.guardar(25.50);

        System.out.println("Nome do produto: " + nomeProduto.obter());
        System.out.println("Quantidade disponível: " + quantidadeProduto.obter());
        System.out.printf("Preço: R$ %.2f%n", preco.obter());
    }
}
