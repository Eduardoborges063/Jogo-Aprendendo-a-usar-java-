package Menu;
import java.util.Scanner;

public class CadastroDeUsuario {
   protected String name;
    public String nickname;
    protected int age;

    public CadastroDeUsuario() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ola querido usuario, seja bem-vindo ao nosso menu!");

        while (true) {
            System.out.print("Por favor, digite seu nome: ");
            this.name = sc.nextLine();

            if (this.name.length() < 3  || this.name.matches(".*\\d+.*")) {
                System.out.println("O nome deve ter no minimo 3 caracteres e não pode conter números. Tente novamente.");
                continue;
            }

            System.out.print("Por favor, digite seu apelido: ");
            this.nickname = sc.nextLine();

            if (this.nickname.length() < 3) {
                System.out.println("O apelido deve ter no minimo 3 caracteres. Tente novamente.");
                continue;
            }

            System.out.print("Por favor, digite sua idade: ");
            this.age = sc.nextInt();
            sc.nextLine(); // limpa a quebra de linha deixada pelo nextInt()

            if (this.age < 18 || this.age > 120) {
                System.out.println("A idade deve ser um numero entre 18 e 120. Tente novamente.");
                continue;
            }

            System.out.println("Cadastro realizado com sucesso!");

            break; // tudo válido, sai do loop
        }
    }

}
