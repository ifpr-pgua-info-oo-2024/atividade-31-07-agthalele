import java.util.ArrayList;

public class Banco {
    private String nome;

    private ArrayList <ClientePF> clientesPF;
    private ArrayList <ClientePJ> clientesPJ;

    public Banco(String nome){
        this.nome = nome;
        this.clientesPF = new ArrayList<>();
        this.clientesPJ = new ArrayList<>();
    }
    
}
