import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        Banco banco = new Banco("Banco do Brasil");

        System.out.println("Nome: ");
        String nome = teclado.nextLine( );

        System.out.println("Cpf: ");
        String cpf = teclado.nextLine( );

        ClientePF clientepf = new ClientePF(nome, cpf);
        banco.adicionaCliente(clientepf);

        //fariamos a mesma coisa para juridica
        System.out.println("Empresa: ");
        String empresa = teclado.nextLine( );

        System.out.println("Cnpj: ");
        String cnpj = teclado.nextLine( );

        ClientePJ clientecnpj = new ClientePJ(empresa, cnpj);
        banco.adicionaCliente(clientecnpj);

       ArrayList<Cliente> listaDeClientes = banco.getClientes();

       for(int i = 0; i< listaDeClientes.size(); i++){
  
        System.out.println("-------------------------------");
        
        Cliente item = cliente.get(i);
        System.out.println(item.getNome());

        System.out.println("-------------------------------");
       }

       for(Cliente item : listaDeCliente){
        System.out.println("-------------------------------");
        System.out.println(item.getNome());
        System.out.println("-------------------------------");
       }
    }
}
