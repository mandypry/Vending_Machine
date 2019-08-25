import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EstoqueTest{

    @Test
    public void CriarProdutoEstoque() {
            Produto produto = new Produto(); //novo produto da classe "Produto"
            produto.nome = "Suco de Frutas Vermelhas";

            Estoque estoque = new Estoque();
            estoque.produto = produto;

            Categoria categoria = new Categoria(); //novo produto da classe "Categoria"
            categoria.tipo = "Alimenticio";

            Subcategoria subcategoria = new Subcategoria(); //novo produto da classe "Subcategoria"
            subcategoria.unidMedida = "Liquido";

            estoque.quantidade = 5;

            //Testando o "set" do produto {Set modifica o atributo}
            estoque.setProduto(produto);
            estoque.setCategoria(categoria);
            estoque.setSubcategoria(subcategoria);
            Integer quantidade = 0;
            estoque.setQuantidade(quantidade);

            //Testando o "get" do produto {Get acessa o atributo 'pega'}
            assertThat(estoque.getProduto().nome, is("Suco de Frutas Vermelhas"));
            assertThat(estoque.getCategoria().tipo, is("Alimenticio"));
            assertThat(estoque.getSubcategoria().unidMedida, is("Liquido"));
            assertThat(estoque.getQuantidade(), is(5));
        }
    }