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

      String produto1  = "Batata frita";
      String produto2  = "Salgado";
      String produto3  = "Achocolatado";

      Double precoProduto1 = 10.00;
      Double precoProduto2 = 12.00;
      Double precoProduto3 = 4.00;

        System.out.println("Cardápio");
        System.out.println(produto1 + " - R$" + precoProduto1);
        System.out.println(produto2 + " - R$" + precoProduto2);
        System.out.println(produto3 + " - R$" + precoProduto3);

    }
}
