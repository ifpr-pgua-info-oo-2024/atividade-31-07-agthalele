import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner teclado = new Scanner(System.in);
      int resp;
      String nome;
      String endereco;
      String telefone;
      String nascimento;
      String genero;
      double altura;
      double peso;
      int a = 1;

      do{

      System.out.println("1 - Criar Academia\n2 - Adicionar Aluno\n3 - Ver Academia\n4 - Ver Alunos");
      resp = teclado.nextInt();

      if(resp == 1){

        System.out.println("Nome da Nova Academia:");
        nome = teclado.next();
        System.out.println("\nEndereço:");
        endereco = teclado.next();
        System.out.println("\nTelefone:");
        telefone = teclado.next();
        System.out.println("sajfbvsi");

        Academia academia1 = new Academia(nome, endereco, telefone);

        System.out.println("\nAcademia Cadrastada!!\n\n ->"+ academia1.getNome() + ":\n  Endereço: "+ academia1.getEndereco() + "\n  Telefone: "+ academia1.getTelefone());

      }
      else if(resp == 2){

        System.out.println("Nome do Novo Aluno: ");
        nome = teclado.next();
        System.out.println("Data de Nascimento: ");
        nascimento = teclado.next();
        System.out.println("Genero: ");
        genero = teclado.next();
        System.out.println("Altura: ");
        altura = teclado.nextDouble();
        System.out.println("Peso: ");
        peso = teclado.nextDouble();

        

      }

    }while(a != -1);


        //declarando objetos do tipo Academia e os instanciando (preenchendo)
        /*Academia obj1 = new Academia("Shrek", "Pântano", "12345678");
        Academia obj2 = new Academia("Lorax", "Thneendville","87654321");
        Academia obj3 = new Academia("Plankton", "Fenda do Biquíni", "12121212");
        
        //imprimindo os dados iniciais       
        System.out.println("Objeto1 -> \nNome: "+ obj1.getNome() +"\nEndereço: "+ obj1.getEndereco() +"\nTelefone: "+ obj1.getTelefone() + "\n");
        System.out.println("Objeto2 -> \nNome: "+ obj2.getNome() +"\nEndereço: "+ obj2.getEndereco() +"\nTelefone: "+ obj2.getTelefone() + "\n");
        System.out.println("Objeto3 -> \nNome: "+ obj3.getNome() +"\nEndereço: "+ obj3.getEndereco() +"\nTelefone: "+ obj3.getTelefone() + "\n");
        
        //auterando dados dos objetos       
        obj1.setNome("Plankton");
        obj1.setEndereco("Fenda do Biquíni");
        obj1.setTelefone("12121212");
        obj2.setNome("Shrek");
        obj2.setEndereco("Pântano");
        obj2.setTelefone("12345678");
        obj3.setNome("Lorax");
        obj3.setEndereco("Thneendville");
        obj3.setTelefone("87654321");
        
        //imprimindo os dados atualizados       
        System.out.println("DADOS ATUALIZADOS==================\nObjeto1 -> \nNome: "+ obj1.getNome() + "\nEndereço: "+ obj1.getEndereco() +"\nTelefone: "+ obj1.getTelefone() + "\n" );
        System.out.println("Objeto2 -> \nNome: "+ obj2.getNome() +"\nEndereço: "+ obj2.getEndereco() +"\nTelefone: "+ obj2.getTelefone() + "\n");
        System.out.println("Objeto3 -> \nNome: "+ obj3.getNome() +"\nEndereço: "+ obj3.getEndereco() +"\nTelefone: "+ obj3.getTelefone() + "\n");


        Aluno obj01 = new Aluno("Carlão", "Superior", "12/12/1996", "12/02/1998", "masculino");
        Aluno obj02 = new Aluno("Ricardão", "Intermediario", "15/03/2000", "masculino");
        Aluno obj03 = new Aluno("Victoria", "Senior", "04/06/2001", "feminino");
        Aluno obj04 = new Aluno("Divão", "Superior", "12/12/1996", "masculino");
        Aluno obj05 = new Aluno("Monica", "Intermediario", "15/03/2000", "feminino");
        Aluno obj06 = new Aluno("Jesica", "Senior", "04/06/2001", "feminino");
        Aluno obj07 = new Aluno("Marcelão", "Superior", "12/12/1996", "masculino");
        Aluno obj08 = new Aluno("Cristovao", "Intermediario", "15/03/2000", "masculino");
        Aluno obj09 = new Aluno("Carla", "Senior", "04/06/2001", "feminino");

         obj1.Alunos.add(obj01);
         obj1.Alunos.add(obj02);
         obj1.Alunos.add(obj03);
         obj2.Alunos.add(obj04);
         obj2.Alunos.add(obj05);
         obj2.Alunos.add(obj06);
         obj3.Alunos.add(obj07);
         obj3.Alunos.add(obj08);
         obj3.Alunos.add(obj09);*/


      }
    }