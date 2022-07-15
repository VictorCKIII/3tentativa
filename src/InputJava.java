import java.util.Scanner;

public class InputJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double base, altura, areaRetangulo;
        
        System.out.println("Informe o valor da base ");
        base = input.nextDouble();

        System.out.println("Informe o valor da altura");
        altura = input.nextDouble();

        areaRetangulo = base * altura;

        System.out.println("A área de um rentângulo de base "+ base);
        System.out.println("e altura " + altura);
        System.out.println(" é " + areaRetangulo);
    }




}
