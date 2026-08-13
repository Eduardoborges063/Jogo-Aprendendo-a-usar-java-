package Menu;

import java.util.Scanner;

public class InformacoesPersonagem {

    public static class Caracteristicas {
        String nome;
        String personagem; // tipo escolhido: cavaleiro, arqueiro ou mago
        int nivel;
        int vidaMaxima;
        int armadura;
        int experiencia;
        int forca;
        int agilidade;
        int inteligencia;
        int mana;
    }

    public static class Descricao {
        String historia;
        String habilidades;
        String equipamentos;
        String personagem;

        public void inicializarDescricao(String personagem) {
            this.personagem = personagem;

            switch (personagem.toLowerCase()) {
                case "cavaleiro":
                    historia = "Nascido em uma família de guerreiros, o Cavaleiro jurou proteger o reino com sua espada e escudo. Treinado desde criança para o combate corpo a corpo, tornou-se um símbolo de força e honra.";
                    habilidades = "Golpe Poderoso, Defesa Total, Investida";
                    equipamentos = "Espada Longa, Escudo de Ferro, Armadura Pesada";
                    break;

                case "arqueiro":
                    historia = "Criado nas florestas distantes, o Arqueiro aprendeu a caçar antes mesmo de aprender a falar. Sua pontaria certeira e reflexos rápidos o tornaram um caçador temido e um aliado valioso em batalha.";
                    habilidades = "Tiro Certeiro, Chuva de Flechas, Passo Silencioso";
                    equipamentos = "Arco Longo, Aljava de Flechas, Armadura de Couro";
                    break;

                case "mago":
                    historia = "Após anos de estudo nas antigas bibliotecas arcanas, o Mago dominou os segredos da magia elemental. Prefere manter distância do combate direto, controlando a batalha com feitiços devastadores.";
                    habilidades = "Bola de Fogo, Escudo Arcano, Teleporte";
                    equipamentos = "Cajado Élfico, Grimório Antigo, Manto Encantado";
                    break;

                default:
                    historia = "Um aventureiro sem classe definida, ainda em busca de seu caminho.";
                    habilidades = "Nenhuma habilidade especial";
                    equipamentos = "Roupas simples";
                    break;
            }
        }
    }

    public static class Personagem {

        public Caracteristicas dados = new Caracteristicas();
        public Descricao descricao = new Descricao(); // guarda a descrição do personagem

        public void criarPersonagem() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o nome do personagem: ");
            dados.nome = sc.nextLine();

            System.out.print("Escolha o personagem (1 - Cavaleiro, 2 - Arqueiro, 3 - Mago): ");
            int escolha = sc.nextInt();
            sc.nextLine(); // limpa a quebra de linha

            switch (escolha) {
                case 1:
                    dados.personagem = "Cavaleiro";
                    dados.vidaMaxima = 100;
                    dados.forca = 80;
                    dados.agilidade = 50;
                    dados.inteligencia = 30;
                    dados.mana = 20;
                    break;

                case 2:
                    dados.personagem = "Arqueiro";
                    dados.vidaMaxima = 100;
                    dados.forca = 50;
                    dados.agilidade = 80;
                    dados.inteligencia = 40;
                    dados.mana = 30;
                    break;

                case 3:
                    dados.personagem = "Mago";
                    dados.vidaMaxima = 100;
                    dados.forca = 30;
                    dados.agilidade = 40;
                    dados.inteligencia = 80;
                    dados.mana = 60;
                    break;

                default:
                    System.out.println("Opção inválida.");
                    return; // encerra aqui, sem chamar a descrição
            }

            // É AQUI que "chamamos" a Descricao, passando o tipo escolhido
            descricao.inicializarDescricao(dados.personagem);

            System.out.println("Personagem criado com sucesso!");
        }

        // Método que imprime Caracteristicas + Descricao juntos
        public void exibirInformacoes() {
            System.out.println("\n=== Informações do Personagem ===");
            System.out.println("Nome: " + dados.nome);
            System.out.println("Classe: " + dados.personagem);
            System.out.println("Vida Máxima: " + dados.vidaMaxima);
            System.out.println("Força: " + dados.forca);
            System.out.println("Agilidade: " + dados.agilidade);
            System.out.println("Inteligência: " + dados.inteligencia);
            System.out.println("Mana: " + dados.mana);

            System.out.println("\n=== Descrição ===");
            System.out.println("História: " + descricao.historia);
            System.out.println("Habilidades: " + descricao.habilidades);
            System.out.println("Equipamentos: " + descricao.equipamentos);
        }
    }

    public static void main(String[] args) {
        Personagem jogador = new Personagem();
        jogador.criarPersonagem();
        jogador.exibirInformacoes();
    }
}