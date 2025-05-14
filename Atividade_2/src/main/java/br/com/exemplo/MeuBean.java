package br.com.exemplo;
import javax.faces.bean.ManagedBean; // Importa a anotação do JSF

@ManagedBean // Define o Bean gerenciado pelo JSF
public class MeuBean {

    // Atributos para armazenar os dados do formulário
    private String nome;
    private String sobrenome;
    private String fone;
    private String email;

    // Getters e Setters para o atributo 'nome'
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getters e Setters para o atributo 'sobrenome'
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    // Getters e Setters para o atributo 'fone'
    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    // Getters e Setters para o atributo 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String enviar() {
       
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Telefone: " + fone);
        System.out.println("Email: " + email);
        return null;  
    }
}

