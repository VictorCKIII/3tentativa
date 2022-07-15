public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
         // =, -=, +=, /=, %= 
         int salario = 1800;
         // Ambas as linhas 6 e 7 estão fazendo a mesma coisa!
        //salario = salario + 1000;
        // salario += 1000;
        //Receber salario +10%
        //salario *= 0.1; 
        salario = salario + (int)(salario * 0.1);
        System.out.println(salario);
    }
    
}
