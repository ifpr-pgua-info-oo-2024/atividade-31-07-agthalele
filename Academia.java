import java.util.ArrayList;
import java.util.List;

public class Academia {

    //objetos da entidade Academia
    private String nomeacademia;
    private String endereco;
    private String telefone;

    List<Aluno> Alunos;

    //métodos da Academia:

    public Academia(String nomeacademia, String endereco, String telefone) {

        this.nomeacademia = nomeacademia;
        this.endereco = endereco;
        this.telefone = telefone;
        Alunos = new ArrayList<>();

    }

    public String getNomeAcademia() {
        return nomeacademia;
    }
    public void setNome(String nomeacademia) {
        this.nomeacademia = nomeacademia;
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