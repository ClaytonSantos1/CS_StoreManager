/**
 * A classe Loja representa um espaço físico ocupado ou não por uma empresa no shopping.
 * 
 * @author (Clayton Miranda dos Santos) 
 * @version (12/05/24)
 */
public class Loja {

    // variáveis de instância
    private String nome;
    private int quantidadeFuncionarios; 
    private int salarioBaseFuncionario;
    private char tamanho;
    private Endereco enderecoLoja;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    
    // Construtor_1 para objetos Loja      
    public Loja(String nome, 
                int quantidadeFuncionarios, 
                int salarioBaseFuncionario, 
                Endereco enderecoLoja, 
                Data dataFundacao,
                int estoqueProdutos) {

        // inicializa variáveis de instância
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[estoqueProdutos];
        
    }

    //Construtor_2 para objetos Loja
    public Loja(String nome, 
                int quantidadeFuncionarios, 
                Endereco enderecoLoja, 
                Data dataFundacao,
                int estoqueProdutos) {

        // inicializa variáveis de instância
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[estoqueProdutos];
    }
    
    // métodos de acesso (getters e setters) 
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public int getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    
    public void setSalarioBaseFuncionario(int salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return enderecoLoja;
    }

    public void setEndereco(Endereco enderecoLoja) {
        this.enderecoLoja = enderecoLoja;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(int estoqueProdutos){
        this.estoqueProdutos = new Produto[estoqueProdutos];
    }
    
    // método que retorna as informações do objeto Loja
    @Override
    public String toString() {
        return System.lineSeparator() + " Nome da loja: " + getNome() + 
               System.lineSeparator() + " Quantidade de Funcionários: " + getQuantidadeFuncionarios() + 
               System.lineSeparator() + " Salário Base Funcionário: " + getSalarioBaseFuncionario() +
               System.lineSeparator() + " Endereço da loja: " + getEndereco() +
               System.lineSeparator() + " Data de fundação da loja: " + getDataFundacao() +
               System.lineSeparator() + " Estoque de produtos: " + getEstoqueProdutos();
    }
    
    // método que retorna gasto da empresa em salários de funcionários caso tenha
    public int gastosComSalario()
    {
        if (salarioBaseFuncionario != -1){
            return salarioBaseFuncionario * quantidadeFuncionarios;
        } 
        else {
            return -1;    
        }
    }
    
    // método que retorna o tamanho da Loja de acordo com o número de funcionários
    public char tamanhoDaLoja()
    {
        if(quantidadeFuncionarios >= 0 && quantidadeFuncionarios < 10){
            tamanho = 'P';
        }
        else if(quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30){
            tamanho = 'M';
        }
        else {
            tamanho = 'G';
        }
            return tamanho;
    }

    // método que e imprime a informação de todos os produtos da loja.
    public void imprimeProdutos() {
        if (estoqueProdutos != null)
            System.out.println(getEstoqueProdutos());
        else
            System.out.println("Não há produtos cadastrados.");
    }

    // método para inserir um novo produto, caso haja espaço retorna Verdadeiro, caso não retorna Falso.
    public boolean insereProduto(Produto produtoNovo) {
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (this.estoqueProdutos[i] == null) {
                this.estoqueProdutos[i] = produtoNovo;
                return true;
            }
        }
        return false;
    }

    // método que remove um produto da loja, caso o produto seja encontrado e removido retorna Verdadeiro, caso não retorna Falso
    public boolean removeProduto(String nomeProduto) {
        if (estoqueProdutos != null)
            for (int i = 0; i < estoqueProdutos.length; i++) {
                if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                    estoqueProdutos = null;
                    return true;
                }
            }
        return false;
    }
}
