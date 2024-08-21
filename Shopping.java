/**
 * A classe Shopping, representa um conjunto de Lojas.
 * 
 * @author (Clayton Miranda dos Santos) 
 * @version (16/06/24)
 */
public class Shopping {
    
    // variáveis de instância
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    //Construtor para objetos Shopping
    public Shopping(String nome, Endereco endereco, int numeroMaxLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[numeroMaxLojas];
    }

        // métodos de acesso (getters e setters)
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public Endereco getEndereco() {
            return endereco;
        }
    
        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }
    
        public Loja[] getLojas() {
            return lojas;
        }
    
        public void setLojas(int numeroMaxLojas) {
            this.lojas = new Loja[numeroMaxLojas];
        }

    // método que retorna as informações do objeto Shopping
    @Override
    public String toString() {
        return System.lineSeparator() + " Nome do shopping: " + getNome() + 
               System.lineSeparator() + " Endereço do shopping: " + getEndereco() +
               System.lineSeparator() + " Número máximo de lojas: " + getLojas();
    }

    // método que insere uma loja nova, coso haja espaço retorna Verdadeiro, caso não retorna Falso.
    public boolean insereLoja(Loja novaLoja){
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] == null) {
                this.lojas[i] = novaLoja;
                return true;
            }
        }
        return false;
    }

    // método que remove uma loja, caso encontre a loja indicada retorna Verdadeiro, caso não retorna Falso.
    public boolean removeLoja(String nomeLoja){
        if (lojas != null)
            for (int i = 0; i < lojas.length; i++) {
                if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                    lojas[i] = null;
                    return true;
                }
            }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja){
        int contaLoja = 0;
        if (lojas != null) {
            for (Loja loja : lojas) {
                if (loja.getClass().getSimpleName().equalsIgnoreCase(tipoLoja)){
                    contaLoja ++;
                }
            }
        return contaLoja;
        } else {
            return -1;
        }
    }

    public Informatica lojaSeguroMaisCaro(){
        double valorSeguro = -1;
        Informatica seguroMaisCaro = null;
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] instanceof Informatica){
                if(((Informatica) lojas[i]).getSeguroEletronicos() > valorSeguro){
                    valorSeguro = ((Informatica) lojas[i]).getSeguroEletronicos();
                    seguroMaisCaro = (Informatica) lojas[i];
                }
            }
        }
        return seguroMaisCaro;
    }
}
