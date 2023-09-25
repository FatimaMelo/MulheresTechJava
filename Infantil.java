
package mediaescolar;
import java.util.Scanner;

public class Infantil {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int idade;
       
        System.out.println("Digite nome da criança: ");
        nome = sc.next();
        
        System.out.println("Digite a idade da criança");
        idade = sc.nextInt();
        
        if(idade<=2){
            System.out.println("Criança ="+nome+ "Encaminhar ao Berçário");
        }else if(idade<=4){
            System.out.println("Criança ="+nome+"Encaminhar ao Infantil A");  
        }else if(idade<=5){
            System.out.println("Criança ="+nome+"Encaminhar ao Infantil B");
        }else if(idade <=6){
            System.out.println("Criança ="+nome+"encaminhar ao Infantil C");
        }else{
            System.out.println("Criança ="+nome+"Criança fora da Tabela");
        }    
        
    }    
}
