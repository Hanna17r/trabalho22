import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    Scanner scanner = new Scanner(System.in);
    BancoDeDados bancoDeDados = new BancoDeDados();
    Produtos produtos = new Produtos();
    Funcionarios funcionarios = new Funcionarios();


    void adicionarProduto(){
        bancoDeDados.connect();
        produtos.createTable();
        while(true) {
            String[] nome ={"", ""};
            System.out.println("Digite o nome do produto");
            nome[0] = scanner.nextLine();
            //saída do loop
            if (nome[0].equalsIgnoreCase("fim")) {
                break;
            }
            System.out.println("Digite a cor do produto ");
            nome[1] = scanner.nextLine();
            lista.add(nome);
        }
        clientes.insertClient(lista);

        bancoDeDados.close();
    }

    void lerProduto(){
        bancoDeDados.connect();
        bancoDeDados.queryProduto();
        bancoDeDados.close();
    }
    void deletarProduto(){
        bancoDeDados.connect();
        bancoDeDados.deleteProduto();
        bancoDeDados.close();
    }

    void adicionarFuncionario(){
        List<String[]> lista = new ArrayList<>();
        bancoDeDados.connect();
        funcionarios.createTable();

        //Insira seu código aqui

        bancoDeDados.close();
    }

    void lerFuncionario(){
        bancoDeDados.connect();

        //Insira seu código aqui

        bancoDeDados.close();
    }
    void deletarFuncionário(){
        bancoDeDados.connect();

        //Insira seu código aqui

        bancoDeDados.close();
    }

    void imprimirMenu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1- Inserir produto");
        System.out.println("2- Deletar produto");
        System.out.println("3- Consultar produto");
        System.out.println("4- Inserir funcionário");
        System.out.println("5- Consultar funcionário");
        System.out.println("6- Deletar funcionário");
        System.out.println("7- Sair");
    }
}