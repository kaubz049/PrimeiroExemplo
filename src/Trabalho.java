public class Trabalho {

    /*MÓDULO 3 – Cardápio da Cantina
    Objetivo: Mostrar produtos e calcular o valor de um combo.

    Variáveis sugeridas: String produto1, double preco1 ... para 3 produtos.

            Tarefas:

    Guardar nome e preço de 3 produtos.

    Imprimir cardápio:

    Cantina Escolar

    Salgado - R$ 5,00
    Suco - R$ 3,50
    Bolo - R$ 4,00
    Calcular total de um combo (ex.: salgado + suco).

    Extra: Mostrar valor do combo com desconto de 5%.*/

    public static void main(String[] args) {

      //Define os nome dos produtos
      String produto1  = "Batata frita";
      String produto2  = "Salgado";
      String produto3  = "Achocolatado";

      //Define os preços dos produtos
      Double precoProduto1 = 10.00;
      Double precoProduto2 = 12.00;
      Double precoProduto3 = 4.00;

      //Realiza as operações matemáticas
      Double valorSomado = precoProduto1 + precoProduto3;
      Double valorDesconto = valorSomado * 0.05;
      Double valorFinalComDesconto = valorSomado - valorDesconto;

      //Informa para o usuario o preço dos produtos
      System.out.println("Cardápio");
      System.out.println(produto1 + " - R$" + precoProduto1);
      System.out.println(produto2 + " - R$" + precoProduto2);
      System.out.println(produto3 + " - R$" + precoProduto3);
      System.out.println("----------------------------------");

      //Informa para o usuario o valor final da sua compra
      System.out.println("O valor da " + produto1 + " + " + produto3 + " é de: " + valorSomado);
      System.out.println("Com desconto aplicado do combo de 5%, o valor final da compra é: " + valorFinalComDesconto);

    }
}
