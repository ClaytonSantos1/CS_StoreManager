
/**
 * A classe Cosmetico, representa uma loja de cosmeticos.
 * 
 * @author (Clayton Miranda dos Santos) 
 * @version (16/06/24)
 */
public class Cosmetico extends Loja{
    
    // variáveis de instância
    private int taxaComercializacao;

    // Construtor para objetos da classe Cosmetico
    public Cosmetico(String nome, 
                     int quantidadeFuncionarios, 
                     int salarioBaseFuncionario, 
                     Endereco endereco,
                     Data dataFundacao,
                     int taxaComercializacao,
                     int estoqueProdutos) {

        super(nome, quantidadeFuncionarios, quantidadeFuncionarios, endereco, dataFundacao, estoqueProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    // métodos de acesso (getters e setters)
    public int getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(int taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    // método que retorna as informações do objeto Cosmetico    
    @Override
    public String toString() {
        return  System.lineSeparator() + " Nome da loja: " + getNome() + 
                System.lineSeparator() + " Quantidade de Funcionários: " + getQuantidadeFuncionarios() + 
                System.lineSeparator() + " Salário Base Funcionário: " + getSalarioBaseFuncionario() +
                System.lineSeparator() + " Endereço da loja: " + getEndereco() + 
                System.lineSeparator() + " Data de fundação da loja: " + getDataFundacao() +
                System.lineSeparator() + " Taxa de Comercializacao: " + getTaxaComercializacao() +
                System.lineSeparator() + " Estoque de produtos: " + getEstoqueProdutos();
    }
}
