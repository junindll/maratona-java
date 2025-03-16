package academy.junindll.maratonajava.introducao;

public class Aula04Operadores {
    private static float valorPlay5;

    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 * numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte =  10 == 20;
        boolean isDezIgualDez =  10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        // && (AND) || (OR) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " +isDentroDaLeiMenorQueTrinta);

        double ValorTotalContaCorrente = 200;
        double ValorTotalContaPoupanca = 4800;
        float valorPlay = 5000F;
        boolean isPlay5Compravel = ValorTotalContaCorrente > valorPlay || ValorTotalContaPoupanca > valorPlay;
        System.out.println("isPlay5Compravel " +isPlay5Compravel);

        // = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus -= 1000; // 800
        bonus += 1000; // 2800
        bonus *= 2; // é o mesmo que (bonus = * 2;)
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);
    }
}
