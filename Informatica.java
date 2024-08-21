
/**
 * A classe Informatica, representa uma loja de Informatica.
 * 
 * @author (Clayton Miranda dos Santos) 
 * @version (16/06/24)
 */
public class Informatica extends Loja{
    
    // variáveis de instância
    private int seguroEletronicos;

    // Construtor para objetos da classe Cosmetico
    public Informatica(String nome, 
                     int quantidadeFuncionarios, 
                     int salarioBaseFuncionario, 
                     Endereco endereco,
                     Data dataFundacao,
                     int seguroEletronicos, 
                     int estoqueProdutos) {

        super(nome, quantidadeFuncionarios, quantidadeFuncionarios, endereco, dataFundacao, estoqueProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    // métodos de acesso (getters e setters)
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(int seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    // método que retorna as informações do objeto Cosmetico    
    @Override
    public String toString() {
        return  System.lineSeparator() + " Nome da loja: " + getNome() + 
                System.lineSeparator() + " Quantidade de Funcionários: " + getQuantidadeFuncionarios() + 
                System.lineSeparator() + " Salário Base Funcionário: " + getSalarioBaseFuncionario() +
                System.lineSeparator() + " Endereço da loja: " + getEndereco() + 
                System.lineSeparator() + " Data de fundação da loja: " + getDataFundacao() +
                System.lineSeparator() + " Seguro de Eletrônicos" + getSeguroEletronicos() +
                System.lineSeparator() + " Estoque de produtos: " + getEstoqueProdutos();
    }
}
