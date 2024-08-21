import java.text.ParseException;
import java.util.Date;

public class Aluno extends Pessoa{
    
    private String nivel;
   
    //metodo para cadrastar aluno com todos os atribitos
    public Aluno(String nome, String nivel, String nascimento, String genero, double altura, double peso) throws ParseException {
        super(nome, nascimento, genero, altura, peso);
        this.nivel = nivel;
    }

    //metodo para cadrastar aluno com atribitos obrigatorios
    public Aluno(String nome, String nivel, String nascimento) throws ParseException {
        this(nome, nivel, nascimento, "", 0, 0);
    }

    public String toString() {
        return super.toString() + ", nivel=" + nivel;
    }

    public String getNivel(){
        return nivel;
    }
    public void setNivel(String nivel){
        this.nome = nivel;
    }




}
