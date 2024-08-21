
/**
 * A classe Alimentacao, representa uma loja de Alimentacao.
 * 
 * @author (Clayton Miranda dos Santos) 
 * @version (16/06/24)
 */
public class Alimentacao extends Loja{
    
    // variáveis de instância
    private Data dataAlvara;

    // Construtor para objetos da classe Cosmetico
    public Alimentacao(String nome, 
                     int quantidadeFuncionarios, 
                     int salarioBaseFuncionario, 
                     Endereco endereco,
                     Data dataFundacao,
                     Data dataAlvara,
                     int estoqueProdutos) {

        super(nome, quantidadeFuncionarios, quantidadeFuncionarios, endereco, dataFundacao, estoqueProdutos);

        this.dataAlvara = dataAlvara;
    }

    // métodos de acesso (getters e setters)
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    // método que retorna as informações do objeto Cosmetico    
    @Override
    public String toString() {
        return  System.lineSeparator() + " Nome da loja: " + getNome() + 
                System.lineSeparator() + " Quantidade de Funcionários: " + getQuantidadeFuncionarios() + 
                System.lineSeparator() + " Salário Base Funcionário: " + getSalarioBaseFuncionario() +
                System.lineSeparator() + " Endereço da loja: " + getEndereco() + 
                System.lineSeparator() + " Data de fundação da loja: " + getDataFundacao() +
                System.lineSeparator() + " Data do Alvara" + getDataAlvara() +
                System.lineSeparator() + " Estoque de produtos: " + getEstoqueProdutos();
    }
}
