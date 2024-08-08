import java.util.Date;

public class Aluno {
    
    private String nome;
    private String nivel;
    private Date dtnascimento;
    private String genero;
    private double altura;
    private double peso;

    

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

    public Date getDtnascimento(){
        return dtnascimento;
    }
    public void setDtnascimento(Date dtnascimento){
        this.dtnascimento = dtnascimento;
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
