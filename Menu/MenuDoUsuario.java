package Menu;

import java.util.Scanner;

public class MenuDoUsuario {

    public static InformacoesPersonagem.Personagem personagem = new InformacoesPersonagem.Personagem();
    CadastroDeUsuario menu = new CadastroDeUsuario();

    public void menuDoJogador() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo " + menu.name);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n1. Criar personagem");
            System.out.println("2. Ver Histórias dos personagem");
            System.out.println("3. Jogar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // limpa a quebra de linha

            switch (opcao) {
                case 1:
                    personagem.criarPersonagem();
                    break;

                case 2:
                    if (personagem.dados.personagem == null) {
                        System.out.println("Nenhum personagem criado ainda!");
                    } else {
                        personagem.exibirInformacoes();
                    }
                    break;

                case 3:
                    System.out.println("Jogar");
                    break;

                case 4:
                    System.out.println("Saindo do jogo...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}