public class Main {
    public static void main(String[] args) {
        //declarando objetos do tipo Academia e os instanciando (preenchendo)
        Academia obj1 = new Academia("Shrek", "Pântano", "12345678");
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
        System.out.println("Objeto1 -> \nNome: "+ obj1.getNome() + "\nEndereço: "+ obj1.getEndereco() +"\nTelefone: "+ obj1.getTelefone() + "\n" );
        System.out.println("Objeto2 -> \nNome: "+ obj2.getNome() +"\nEndereço: "+ obj2.getEndereco() +"\nTelefone: "+ obj2.getTelefone() + "\n");
        System.out.println("Objeto3 -> \nNome: "+ obj3.getNome() +"\nEndereço: "+ obj3.getEndereco() +"\nTelefone: "+ obj3.getTelefone() + "\n");

      }
    }