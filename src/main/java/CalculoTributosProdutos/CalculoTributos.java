package CalculoTributosProdutos;

// Tipos de produtos implementando a interface com lambda
public class CalculoTributos {
    public static void main(String[] args) {
        // Lambda para cada tipo de produto
        ProdutoTributavel alimentacao = (preco) -> preco * 0.01;
        ProdutoTributavel saude = (preco) -> preco * 0.015;
        ProdutoTributavel vestuario = (preco) -> preco * 0.025;
        ProdutoTributavel cultura = (preco) -> preco * 0.04;

        double precoProduto = 100.0;

        System.out.println("Imposto sobre Alimentação: R$ " + alimentacao.calcularImposto(precoProduto));
        System.out.println("Imposto sobre Saúde e Bem-Estar: R$ " + saude.calcularImposto(precoProduto));
        System.out.println("Imposto sobre Vestuário: R$ " + vestuario.calcularImposto(precoProduto));
        System.out.println("Imposto sobre Cultura: R$ " + cultura.calcularImposto(precoProduto));
    }
}