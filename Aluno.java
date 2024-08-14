import java.util.Date;

public class Aluno {
    
    private String nome;
    private String nivel;
    private String nascimento;
    private Date dtnascimento;
    private String genero;
    private double altura;
    private double peso;

    public Aluno(String nome, String nivel, String nascimento, String genero, double altura, double peso){

        this.nome = nome;
        this.nivel = nivel;
        this.nascimento = nascimento;
        this.genero = genero;
        this.altura= altura;
        this.peso = peso;

    }

    public Aluno(String nome, String nivel, String nascimento, String genero){

        this.nome = nome;
        this.nivel = nivel;
        this.nascimento = nascimento;
        this.genero = genero;

    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNivel(){
        return nivel;
    }
    public void setNivel(String nivel){
        this.nome = nivel;
    }

    public String getDtnascimento(){
        return nascimento;
    }
    public void setDtnascimento(String nascimento){
        this.nascimento = nascimento;
    }
    
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public double getAltura(){
        return altura;
    }
    public void setAltura(Double altura){
        this.altura = altura;
    }
    
    public double getPeso(){
        return peso;
    }
    public void setPeso(Double peso){
        this.peso = peso;
    }



}
