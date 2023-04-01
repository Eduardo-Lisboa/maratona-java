import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    private ArrayList<Contato> listaContatos;

    public Agenda() {
        listaContatos = new ArrayList<Contato>();
    }


    public ArrayList<Contato> getListaContatos() {
        return listaContatos;
    }

    public void setListaContatos(ArrayList<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }


    public void adicionarContato(Contato contato) {
        listaContatos.add(contato);
    }

    public void removeContato(String contatoNome) {
        for (Contato contatoBusca : listaContatos) {
            if (contatoBusca.getNome().equals(contatoNome)) {
                listaContatos.remove(contatoBusca);
                break;
            }
        }
    }

    public void buscaContatoPeloNome(String contatoNome) {
        for (Contato contatoBusca : listaContatos) {
            if (contatoBusca.getNome().contains(contatoNome)) {
                System.out.println(contatoBusca.toString());
            }
        }

    }

    public void alterarContatoNome(String contatoNome) {
        Scanner scanner = new Scanner(System.in);
        for (Contato contatoBusca : listaContatos) {
            if (contatoBusca.getNome().equals(contatoNome)) {
                System.out.println("Novo nome");
                String novoNome = scanner.nextLine();
                contatoBusca.setNome(novoNome);
                System.out.println("Novo Telefone");
                String novoTelefone = scanner.nextLine();
                contatoBusca.setTelefone(novoTelefone);
                System.out.println("Novo Email");
                String novoEmail = scanner.nextLine();
                contatoBusca.setEmail(novoEmail);
            }
            break;
        }
    }


}
