/**
 * A classe Data.
 * 
 * @author (Clayton Miranda dos Santos) 
 * @version (15/05/24)
 */

public class Data 
{
    // variáveis de instância
    private int dia;
    private int mes;
    private int ano;

    // método construtor para o objeto Data
    public Data(int dia, int mes, int ano)
    {
        //inicializa variáveis de instância
        this.dia = dia; this.mes = mes; this.ano = ano;
        
        //validação da data informada;
        if (dia == 29 && mes == 2 && verificaAnoBissexto() == true)
        {
            System.out.println("Erro: Data informada não é válida para ano Bissexto!");
            this.dia = 1; this.mes = 1; this.ano = 2000;
        }
    }

    // método de acesso (getters e setters)
    public int getDia()
    {
        return dia;
    }

    public void setDia(int dia)
    {
        if (dia == 29 && mes == 2 && verificaAnoBissexto() == true)
        {
            System.out.println("Erro: Data informada não é válida para ano Bissexto!");
            this.dia = 1;
        }
        else
        {
            this.dia = dia;
        }
    }

    public int getMes()
    {
        return mes;
    }

    public void setMes(int mes)
    {
        if (dia == 29 && mes == 2 && verificaAnoBissexto() == true)
        {
            System.out.println("Erro: Data informada não é válida para ano Bissexto!");
            this.mes = 1;
        }
        else
        {
            this.mes = mes;
        }
    }

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        this.ano = ano;

        if (dia == 29 && mes == 2 && verificaAnoBissexto() == true)
        {
            System.out.println("Erro: Data informada não é válida para ano Bissexto!");
            this.ano = 2000;
        }
    }

    // método que retorna as informações do objeto Data.
    @Override
    public String toString()
    {
        return System.lineSeparator() + dia +"/"+ mes +"/" + ano;
    }

    // método que verifica se o ano informado é bissexto ou não.
    public boolean verificaAnoBissexto()
    {
        if (ano % 4 == 0 && ano % 100 != 0)
        {
            return true;
        }
        else if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
