public class ControleFluxo1 {
    public static void main(String[] args) {
        // Idade < 15 categoria Infantil
        // Idade >= 15 && idade < 18  Juvenil
        // idade >= 18 adulto
       int idade = 15;
       String categoria;
       if(idade < 15 ) {
            categoria = "Infantil";
       }else if(idade >= 15 && idade < 18) {
           categoria = "Juvenil";
       }else if(idade > 18) {
            categoria = "Adulto";
       }
       System.out.println(categoria);
    }
}
