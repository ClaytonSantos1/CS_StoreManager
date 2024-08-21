
/**
 * A classe Bijuteria, representa uma loja de Bijuteria.
 * 
 * @author (Clayton Miranda dos Santos) 
 * @version (16/06/24)
 */
public class Bijuteria extends Loja{
    
    // variáveis de instância
    private int metaVendas;

    // Construtor para objetos da classe Cosmetico
    public Bijuteria(String nome, 
                     int quantidadeFuncionarios, 
                     int salarioBaseFuncionario, 
                     Endereco endereco,
                     Data dataFundacao,
                     int metaVendas, 
                     int estoqueProdutos) {

        super(nome, quantidadeFuncionarios, quantidadeFuncionarios, endereco, dataFundacao, estoqueProdutos);
        this.metaVendas = metaVendas;
    }

    // métodos de acesso (getters e setters)
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(int metaVendas) {
        this.metaVendas = metaVendas;
    }

    // método que retorna as informações do objeto Cosmetico    
    @Override
    public String toString() {
        return  System.lineSeparator() + " Nome da loja: " + getNome() + 
                System.lineSeparator() + " Quantidade de Funcionários: " + getQuantidadeFuncionarios() + 
                System.lineSeparator() + " Salário Base Funcionário: " + getSalarioBaseFuncionario() +
                System.lineSeparator() + " Endereço da loja: " + getEndereco() + 
                System.lineSeparator() + " Data de fundação da loja: " + getDataFundacao() +
                System.lineSeparator() + " Meta de Vendas" + getMetaVendas() +
                System.lineSeparator() + " Estoque de produtos: " + getEstoqueProdutos();
    }
}
