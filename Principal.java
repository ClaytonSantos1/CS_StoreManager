/**
 * A classe Principal.
 * 
 * @author (Clayton Miranda dos Santos) 
 * @version (15/06/24)
 */

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        Loja loja = null;
        Produto produto = null;

        while (opcao != 3) {
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite nome da loja: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a quantidade de funcionários: ");
                    int quantidadeFuncionarios = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Salário base de funcionário: ");
                    int salarioBaseFuncionario = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite a quantidade de produtos no estoque: ");
                    int estoqueProdutos = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("\n*** Endereço da Loja ***\r\n");
                    System.out.println("Digite nome da rua da loja:");
                    String nomeDaRua = scanner.nextLine();
                    System.out.println("Digite a cidade:");
                    String cidade = scanner.nextLine();
                    System.out.println("Digite o estado: ");
                    String estado = scanner.nextLine();
                    System.out.println("Digite o país: ");
                    String pais = scanner.nextLine();
                    System.out.println("Digite o CEP: ");
                    String cep = scanner.nextLine();
                    System.out.println("Digite o número: ");
                    String numero = scanner.nextLine();
                    System.out.println("Digite um complemento: ");
                    String complemento = scanner.nextLine();
                    System.out.println("\n*** Data de fundação da Loja ***\r\n");
                    System.out.println("Digite o dia(xx): ");
                    int dia = scanner.nextInt();
                    System.out.println("Digite o mês(xx): ");
                    int mes = scanner.nextInt();
                    System.out.println("Digite o ano(xxxx): ");
                    int ano = scanner.nextInt();

                    Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                    Data dataFundacao = new Data(dia, mes, ano);

                    loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);

                    System.out.println("\nLoja " + nome + " criada com sucesso.\r\n");

                    break;
                }
                
                case 2 -> {
                    System.out.println("Digite nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digete o preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.println("\n*** Data de validade do produto ***\r\n");
                    System.out.println("Digite o dia(xx): ");
                    int dia = scanner.nextInt();
                    System.out.println("Digite o mês(xx): ");
                    int mes = scanner.nextInt();
                    System.out.println("Digite o ano(xxxx): ");
                    int ano = scanner.nextInt();

                    Data dataValidade = new Data(dia, mes, ano);

                    produto = new Produto(nome, preco, dataValidade);

                    System.out.println("\nProduto " + nome + " criado com sucesso.\r\n");

                    break;

                }

                case 3 -> {
                    if (loja != null && produto != null){
                        Data dataConsulta = new Data(20, 10, 2023);
                                if (produto.estaVencido(dataConsulta)) {
                                    System.out.println("\nPRODUTO VENCIDO.\r\n");
                                } else {
                                    System.out.println("\nPRODUTO NÃO VENCIDO\r\n");
                                }
                    }
                    System.out.println("\nSaindo...\r\n");
                    scanner.close();
                    break;
                }

                default -> {
                    System.out.println("\nOpção inválida\r\n");
                    break;
                }
            }
        }
    }
}
