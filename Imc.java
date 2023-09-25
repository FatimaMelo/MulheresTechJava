
package mediaescolar;
import java.util.Scanner;
public class Imc {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double peso,altura,imc;
        String nome,classi;
        int idade;
        
        
        for(int i=1;i<=3;i++){
        System.out.println("Digite Nome:");
        nome = sc.next();
        
        System.out.println("Digite Idade:");
        idade = sc.nextInt();
        
        System.out.println("Digite Peso: ");
        peso = sc.nextDouble();
        
        System.out.println("Digite Altura: ");
        altura = sc.nextDouble();
        
        imc = peso/(altura * altura);
        
        if(imc<18.5){
            classi="Abaixo do peso normal";
        }
        else if(imc<=24.9){
            classi="Peso normal";
        }
        else if(imc<=29.9){
            classi="Excesso de Peso";
        }
        else if(imc<=34.9){
            classi="Obesidade classe 1";
        }
        else if(imc<=39.9){
            classi = "Obesidade classe 2";
        }
        else{
            classi = "Obesidade classe 3";
        }       
        
        System.out.println("Nome = "+nome+" Idade = "+idade);
        System.out.println("Peso = "+peso+" Altura = "+altura);
        System.out.println("Seu IMC é = "+imc);
        System.out.println("sua Classificação foi = "+classi);
        
        }
        
    }    
}
