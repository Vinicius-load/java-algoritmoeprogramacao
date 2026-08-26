import java.util.Scanner;
class ComparandoNumero{
    public static void main (String [] args){
        Scanner scanner = nwe Scanner(System.in);
 
System.out.println("Informe o primeiro numero");
int numero1 = scanner.nextint();

System.out.println("Informe o segundo numero");
int numero2 = scanner.nextint();

if (numero1 > numero2){
    System.out.println("O numero 1 é maior que o segundo o numero");
    
} else if (numero1 < numero2) {
    System.out.println("O segundo numero é maior que o primeiro");  
} else{
    System.out.println("Os dois numeros são iguais");
}
scanner.close;
    }
}
