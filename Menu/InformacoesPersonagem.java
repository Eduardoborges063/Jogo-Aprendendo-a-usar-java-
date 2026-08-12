package Menu;

import java.util.Scanner;

public class InformacoesPersonagem {

    public static class Caracteristicas {
        String nome;
        String status;
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

     public Descricao(String personagem) {
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

    public static class Jogador {

        public Caracteristicas dados = new Caracteristicas();

        public Jogador() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o nome do personagem: ");
            dados.nome = sc.nextLine();
            System.out.print("Digite o tipo do personagem (Cavaleiro, Arqueiro, Mago): ");
            dados.personagem = sc.nextLine();

            switch (dados.personagem.toLowerCase()) {
                case "cavaleiro":
                    dados.vidaMaxima = 100;
                    dados.experiencia = 0;
                    dados.forca = 80;
                    dados.agilidade = 50;
                    dados.inteligencia = 30;
                    dados.mana = 20;
                    break;
                case "arqueiro":
                    dados.vidaMaxima = 100;
                    dados.experiencia = 0;
                    dados.forca = 50;
                    dados.agilidade = 80;
                    dados.inteligencia = 40;
                    dados.mana = 30;
                    break;
                case "mago":
                    dados.vidaMaxima = 100;
                    dados.experiencia = 0;
                    dados.forca = 30;
                    dados.agilidade = 40;
                    dados.inteligencia = 80;
                    dados.mana = 60;
                    break;

                default:
                    break;
            }
            System.out.println("Personagem criado com sucesso!");
        }
    }
}
