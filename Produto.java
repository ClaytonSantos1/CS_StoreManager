/**
 * A classe Produto representa um produto comercializado ou não por uma Loja no shopping.
 * 
 * @author (Clayton Miranda dos Santos) 
 * @version (15/05/24)
 */

public class Produto {
    
    // variáveis de instância
    private String nome;
    private double preco;
    private Data dataValidade;

    // Contrutor para objetos Produto
    public Produto(String nome, double preco, Data dataValidade) {

        // inicializa variáveis de instância
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    // métodos de acesso (getters e setters)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    // método que verifica a data de validade do produto em ralaçãp da data atual
    public boolean estaVencido(Data data) {
        if (dataValidade.getAno() < data.getAno())
            return true;
        else if (dataValidade.getMes() < data.getMes())
            return true;
        else if (dataValidade.getDia() < data.getDia())
            return true;
        else
            return false;
    }

    // método que retorna as informações do objeto Produto
    @Override
    public String toString() {
        return System.lineSeparator() + " Nome do produto: " + nome + 
               System.lineSeparator() + " Preço do produto: " + preco +
               System.lineSeparator() + " Data de validade: " + dataValidade;
    }
}
