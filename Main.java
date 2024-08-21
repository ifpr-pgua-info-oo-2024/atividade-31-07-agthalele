import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = teclado.nextLine( );

        System.out.println("Cpf: ");
        String cpf = teclado.nextLine( );

        ClientePF clientepf = new ClientePF(nome, cpf);

        //fariamos a mesma coisa para juridica
        System.out.println("Empresa: ");
        String empresa = teclado.nextLine( );

        System.out.println("Cnpj: ");
        String cnpj = teclado.nextLine( );

        ClientePJ clientecnpj = new ClientePJ(empresa, cnpj);

    }
}
