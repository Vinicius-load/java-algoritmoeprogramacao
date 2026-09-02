public class aula3{
    public static void main (String [] args) {

        System.out.println("Olá Mundo");
        System.out.println("Minha idade é: "+ 19 + " anos.");
        System.out.println("O resultado é: " + (3+5 <= 22));
    Exercicio1();
    Exercicio2();
    Exercicio3();
}

    private static void Exercicio1() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Meu nome é: Vinicius");
        System.out.println("O meu registro acadêmico é: " + 06263335+" RA.");
        System.out.println("O meu curso é: Analise e desenvolvimento de sistemas");
    }

    private static void Exercicio2() {
       System.out.println("-------------------------------------------------------");
       System.out.println("Minha idade é: "+ 19 + " anos.");
       System.out.println("Minha altura é: "+ 1.83 + ".");
       System.out.println("Meu status em aula hoje é: Presente");
    }

    private static void Exercicio3() {
        System.out.println("-------------------------------------------------------");
        int numero = 5;
        for (int i = 1; i <= 10; i++) {

         System.out.printf("%d X %d = %d%n", numero, i, numero * i);
        }

    }
}
