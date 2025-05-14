package br.com.cadUser;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean(name = "pessoa")
@SessionScoped
public class Pessoa implements Serializable {

    private String nome;
    private ArrayList<String> nomes = new ArrayList<>();

    // Método chamado ao clicar em "Salvar"
    public String salvar() {
        if (nome != null && !nome.trim().isEmpty()) {
            nomes.add(nome.trim());
            nome = ""; // limpa o campo após salvar
        }
        return null; // permanece na mesma página
    }

    // Getter e Setter para 'nome'
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para 'nomes'
    public ArrayList<String> getNomes() {
        return nomes;
    }

    public void setNomes(ArrayList<String> nomes) {
        this.nomes = nomes;
    }
}
