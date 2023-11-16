public class tiposVariaveis {
    public static void main(String[] args)  {

        //Variáveis de numeros inteiros !!
        byte salarioMinimo = 1; // Esse tipo de variável só vai -127 até 127 de valor
        short salarioMaximo = 30000; // vai de -32768 até 32768
        int salarioMedio = 5000; // vai de -2147483648 até -2147483648 (Usada na maioria dos cenários)
        long cpf = 5769821456L; // ultrapassa 9 * 10^18, maior tipo de valor em variável

        // Variáveis de valores fracionádos
        float salarioQuebrado1 = 3.86F;
        // Mais comum a double pois o float mantem a precisão decimal entre 6 e 7 digitos
        double salarioQuebrado2 = 4.97;

        // O ponto mais relevante em compreender a definição dos tipos é o momento da definição do tipo para uma variável
        // Declarar uma variável curta e depois retornar em uma variável maior causa erro no código
        // Exemplo

        int teste1 = 45;
        // short teste2 = teste1; <- Exemplo errado, corrigido logo abaixo

        short teste2 = (short) teste1;

        // Constantes são declaradas com o comando "final" ao lado e são descritas com CAIXA ALTA !!!

        final int CONTA_FORTE = 45;
        //int CONTA_FORTE = 34





    }
}
