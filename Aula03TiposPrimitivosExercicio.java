package academy.junindll.maratonajava.introducao;
/*
    Crie variáveis para os campos descritos abaixos entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario> na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Júnior";
        String endereco = "João Pessoa";
        double salario = 2000;
        String dataRecebimentoSalario = "05 de março de 2025";
        String relatorioSalario = ("Eu, " +nome+ ", morando no endereço " +endereco+ ", confirmo que recebi o salário "
                +salario+ " na data "+dataRecebimentoSalario+ ".");
        System.out.println(relatorioSalario);
    }
}
