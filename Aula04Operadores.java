public class Aula04Operadores {
    public static void main(String[] args) {
        // +, -, /, *

        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        int resultado2 = numero01 - numero02;
        int resultado3 = numero01 * numero02;
        int resultado4 = numero02 / numero01;


        System.out.println("A soma dos valores são: "+resultado);
        System.out.println("A subtração dos valores são: "+resultado2);
        System.out.println("A multiplicação dos valores são: "+resultado3);
        System.out.println("A divisão dos valores são: "+resultado4);

        System.out.println("--------------------------------------------");


        // % operador resto

        int resto = 21 % 7;
        System.out.println(resto);

        // (< ) menor q))  (> ) maior q)) (<=)Menor igual))  (>=)maior igual (==) igual)) (!=)diferente))

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualOuMaiorQueVinte = 10 >= 20;
        boolean isDezIgualOuMenorQueVinte = 10 <= 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;

        System.out.println("10 é maior que 20: "+isDezMaiorQueVinte );
        System.out.println("10 é menor que 20: "+isDezMenorQueVinte );
        System.out.println("10 é maior ou igual a 20: "+isDezIgualOuMaiorQueVinte );
        System.out.println("10 é menor ou igual a 20: "+isDezIgualOuMenorQueVinte );
        System.out.println("10 é igual a 20: "+isDezIgualQueVinte );
        System.out.println("10 é diferente de 20: "+isDezDiferenteQueVinte );

        System.out.println("-------------------------------------------");

        // && (And) || (or) !

        int idade = 35;
        float salario =5500;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario  >=4612;
        boolean isDentroDaLeiMenorQueTrinTa = idade < 30 && salario >= 3381;
        System.out.println("Estou correto perante a maior que trinta? "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("Estou correto perante a menor que trinta? "+isDentroDaLeiMenorQueTrinTa);




    }
}
