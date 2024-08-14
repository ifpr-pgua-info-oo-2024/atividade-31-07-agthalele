import java.util.ArrayList;
import java.util.List;

public class Academia {

    //objetos da entidade Academia
    private String nome;
    private String endereco;
    private String telefone;

    List<Aluno> Alunos;

    //métodos da Academia:

    public Academia(String nome, String endereco, String telefone) {

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        Alunos = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}