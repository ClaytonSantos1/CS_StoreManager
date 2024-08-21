/**
 * A classe Enderco representa o endereço físico em que a Loja se encontra.
 * 
 * @author (Clayton Miranda dos Santos) 
 * @version (15/05/24)
 */

public class Endereco {

    // variáveis de instância
    private String nomeDaRua, cidade, estado, pais, cep, numero, complemento;

    // método construtor para objetos Endereco
    public Endereco(String nomeDaRua, 
                    String cidade, 
                    String estado, 
                    String pais, 
                    String cep, 
                    String numero, 
                    String complemento)
    {
        // inicializa variáveis de instância
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    // métodos de acesso (getters e setters)
    public String getNomeDaRua()
    {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua)
    {
        this.nomeDaRua = nomeDaRua;
    }

    public String getCidade()
    {
        return cidade;
    }

    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }

    public String getEstado()
    {
        return estado;
    }

    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    public String getPais()
    {
        return pais;
    }

    public void setPais(String pais)
    {
        this.pais = pais;
    }

    public String getCep()
    {
        return cep;
    }

    public void setCep(String cep)
    {
        this.cep = cep;
    }

    public String getNumero()
    {
        return numero;
    }

    public void setNumero(String numero)
    {
        this.numero = numero;
    }

    public String getComplemento()
    {
        return complemento;
    }

    public void setComplemento(String complemento)
    {
        this.complemento = complemento;
    }

    // método que retorna as informações do objeto Endereco
    @Override
    public String toString()
    {
        return System.lineSeparator() + " Nome da rua: " + nomeDaRua + 
               System.lineSeparator() + " Cidade: " + cidade +
               System.lineSeparator() + " Estado: " + estado +
               System.lineSeparator() + " País: " + pais +
               System.lineSeparator() + " CEP: " + cep +
               System.lineSeparator() + " Número: " + numero +
               System.lineSeparator() + " Complemento: " + complemento;
    }
}
