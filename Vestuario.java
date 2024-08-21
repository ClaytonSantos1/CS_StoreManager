
/**
 * A classe Vestuario, representa uma loja de vestuário.
 * 
 * @author (Clayton Miranda dos Santos) 
 * @version (16/06/24)
 */
public class Vestuario extends Loja{
    
    // variáveis de instância
    private boolean produtosImportados;

    // Construtor para objetos da classe Cosmetico
    public Vestuario(String nome, 
                     int quantidadeFuncionarios, 
                     int salarioBaseFuncionario, 
                     Endereco endereco,
                     Data dataFundacao, 
                     boolean produtosImportados,
                     int estoqueProdutos) {

        super(nome, quantidadeFuncionarios, quantidadeFuncionarios, endereco, dataFundacao, estoqueProdutos);

        this.produtosImportados = produtosImportados;
    }

    // métodos de acesso (getters e setters)
    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    // método que retorna as informações do objeto Cosmetico    
    @Override
    public String toString() {
        return  System.lineSeparator() + " Nome da loja: " + getNome() + 
                System.lineSeparator() + " Quantidade de Funcionários: " + getQuantidadeFuncionarios() + 
                System.lineSeparator() + " Salário Base Funcionário: " + getSalarioBaseFuncionario() +
                System.lineSeparator() + " Endereço da loja: " + getEndereco() + 
                System.lineSeparator() + " Data de fundação da loja: " + getDataFundacao() +
                System.lineSeparator() + " Produto importado" + getProdutosImportados() +
                System.lineSeparator() + " Estoque de produtos: " + getEstoqueProdutos();
    }
}
