package testeformaatual.leitura;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("contas.csv")); //objeto scanner receber o arquivo

        while (scanner.hasNextLine()){ //verifica se há linha no arquivo
            System.out.println("Linha completa");
            String linha = scanner.nextLine(); //recebe o conteúdo da linha
            System.out.println(linha); //mostra o conteúdo da linha

            /* Dividindo cada elemento da linha através do método split, que separa cada elemento
             em um array de String após encontrar uma vírgula */
            //String[] valores = linha.split(",");
            //System.out.println(Arrays.toString(valores));
            //System.out.println("Tipo: " + valores[0]);
            //System.out.println("Número: " + valores[1]);
            //System.out.println("Agência: " + valores[2]);
            //System.out.println("Nome: " + valores[3]);
            //System.out.println("Saldo: " + valores[4]);

            //Separando os elementos da linha ao encontrar uma vírgula
            Scanner linhaScanner = new Scanner(linha); //esse scanner verifica o conteúdo de uma única linha
            linhaScanner.useLocale(Locale.US); //usa as regras americanas
            linhaScanner.useDelimiter(",");
            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            System.out.println("Elementos separados");
            String valorFormatado = String.format("%s - %04d, %08d, %s, %05.2f", tipoConta,agencia,numero,titular,saldo);
            System.out.println(valorFormatado);

            System.out.println();

            linhaScanner.close();
        }

        scanner.close();
    }
}
