public class HelloWorld1 {
    
    public static void main(String[] args) {
         String ambiente = args[0];
         if (ambiente.equals("DEV")) {
            System.out.print("Executando em DEV");
         } else if (ambiente.equals("TESTE")) {
            System.out.print("Executando em TESTE");
         } else {
            System.out.print("ERROR!");
         }
         
    }
}
