import java.util.Scanner;

public class MainTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        Agenda agenda = new Agenda();


        do {
            System.out.println(" 1 - Adicionar contato");
            System.out.println(" 2 - Remover contato");
            System.out.println(" 3 - Buscar contato pelo nome");
            System.out.println(" 4 - Alterar contato");
            System.out.println(" 5 -- Sair");
            opcao = scanner.nextInt();
            Scanner scannerInterno = new Scanner(System.in);

            switch (opcao) {

                case 1:
                    Contato contato = new Contato();
                    System.out.println("Digite o Nome: ");
                    String novoNome = scannerInterno.nextLine();
                    contato.setNome(novoNome);

                    System.out.println("Digite o Telefone: ");
                    String novoTelefone = scannerInterno.nextLine();
                    contato.setTelefone(novoTelefone);

                    System.out.println("Digite o Email: ");
                    String novoEmail = scannerInterno.nextLine();
                    contato.setEmail(novoEmail);

                    agenda.adicionarContato(contato);
                    break;
                case 2:
                    System.out.println("Digite o nome do contato: ");
                    String nomeContato = scannerInterno.nextLine();
                    agenda.removeContato(nomeContato);
                    break;

                case 3:
                    System.out.println("Digite o Nome do contato: ");
                    nomeContato = scannerInterno.nextLine();
                    agenda.buscaContatoPeloNome(nomeContato);

                    break;
                case 4:
                    System.out.println("Digite o Nome do Contato: ");
                    nomeContato = scannerInterno.nextLine();
                    agenda.alterarContatoNome(nomeContato);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida...");
                    break;
            }


        } while (opcao != 5);


    }
}
