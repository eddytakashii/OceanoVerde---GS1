package view;

import java.util.List;
import java.util.Scanner;

import dao.*;
import model.*;
public class MenuConsole {

    private final UsuarioDAO usuarioDAO;

    private final TempAguaOceanoDAO tempAguaOceanoDAO;

    private final QuantLixoOceanoDAO quantLixoOceanoDAO;

    private final PoluicaoMarinhaDAO poluicaoMarinhaDAO;

    private final MelhorasOceanoDAO melhorasOceanoDAO;

    public MenuConsole() {
        this.usuarioDAO = new UsuarioDAO();
        this.tempAguaOceanoDAO = new TempAguaOceanoDAO();
        this.quantLixoOceanoDAO = new QuantLixoOceanoDAO();
        this.poluicaoMarinhaDAO = new PoluicaoMarinhaDAO();
        this.melhorasOceanoDAO = new MelhorasOceanoDAO();

    }
    private void verDadosMelhoras(Scanner scanner){
        System.out.println("\n=== Dados de Melhoras no Oceano ===");
        List<MelhorasOceano>lista=melhorasOceanoDAO.listarTodos();
        for(MelhorasOceano melhorasOceano:lista){
            System.out.println("Quantidade de ongs:" + melhorasOceano.getQuantOngs());
            System.out.println("Quantidade de residuos tirados" + melhorasOceano.getQuantResiduosTirados());
            System.out.println("Diminuicao da temperatura" + melhorasOceano.getDiminuicaoTemperatura());
        }

    }

    private void verPoluicaoMarinha(Scanner scanner){
        System.out.println("\n === Poluição Marinha ===");
        List<PoluicaoMarinha>lista=poluicaoMarinhaDAO.listarTodos();
        for(PoluicaoMarinha poluicaoMarinha:lista){
            System.out.println("Quantidade de lixo no oceano" + poluicaoMarinha.getQuantLixo());
            System.out.println(("Quantidade de petroleo no oceano" + poluicaoMarinha.getQuantPetroleo()));
        }

    }

    private void verQuantLixo(Scanner scanner){
        System.out.println("\n === Quantidade de Lixo no Oceano ===");
        List<QuantLixo>lista=quantLixoOceanoDAO.listarTodos();
        for(PoluicaoMarinha poluicaoMarinha:lista){
            System.out.println("Quantidade de lixo no oceano" + quantLixoOceano.getLixosOceano());
            System.out.println(("Quantidade de petroleo no oceano" + quantLixoOceano.getLixosOceanoMensal()));
        }

    }
    
    private void cadastrarUsuario(Scanner scanner) {
        System.out.println("\n=== Cadastro de Usuário ===");

        System.out.println("Nome do usuario: ");
        String nome=scanner.nextLine();

        System.out.println("Senha do usuario:");
        String senha=scanner.nextLine();

        Usuario usuario=new Usuario(nome,senha);
        boolean criado=usuarioDAO.criarUsuario(usuario);

        if(criado){
            System.out.println("Cadastrado com sucesso!");
        }else{
            System.out.println("Falha ao cadastrar.");
        }
    }
    
    private void verQuantLixo(Scanner scanner){
        System.out.println("\n === Quantidade de Lixo no Oceano");
        //System.out.println("Quantidade de Lixos no Oceano" + quantLixoOceano.getLixosOceano());
        //System.out.println("Quantidade de Lixos no Oceano por mês" + quantLixoOceano.getLixosOceanoMensal())
    }
    
    private void usuarioMenu(Scanner scanner){
        int opcao;
        do{
            System.out.println("\n=== Menu Usuario ===");
            System.out.println("1- Melhoras no oceano");
            System.out.println("2-Poluição Marinha");
            System.out.println("3-Quantidade Lixo Oceano");
            System.out.println("4-Temperatura da agua no oceano");

            opcao=scanner.nextInt();

            switch(opcao){
                case 1:
                    verDadosMelhoras(scanner);
                    break;

                case 2:
                   verPoluicaoMarinha(scanner);
                    break;

                case 3:
                   verQuantLixo(scanner);
                    break;

                case 4:
                    System.out.println("Voltar ao menu anterior");
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");

            }
        }while(opcao!=5);
    }
    public void inciarSistema() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Bem vindo ao sistema do Oceano Verde ===");

            Usuario usuarioLogado = null;
            while (usuarioLogado == null) {
                System.out.println("1-Login");
                System.out.println("2-Cadastro");
                System.out.println("3-Sair");
                System.out.print("Escolha uma das opções: ");
                String input = scanner.nextLine();
                int escolha;

                try {
                    escolha = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Opção inválida. Insira uma opção válida");
                    continue;
                }

                if (escolha == 1) {
                    System.out.print("Digite seu nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite sua senha: ");
                    String senha = scanner.nextLine();

                    usuarioLogado = usuarioDAO.login(nome, senha);
                    if (usuarioLogado == null) {
                        System.out.println("Credenciais inválidas.");
                    } else {
                        System.out.println("Login realizado com sucesso!");
                    }
                } else if (escolha == 2) {
                    cadastrarUsuario(scanner);
                }else if(escolha==3){
                    System.out.println("Encerrando o sistema.");
                    return;
                }else{
                    System.out.println("Opção inválida.");
                }
            }
        }
    }
}