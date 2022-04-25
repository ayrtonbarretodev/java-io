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
            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt();
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble();

            System.out.println("Elementos separados");
            System.out.println(valor1 + " " + valor2 + " " + valor3 + " " + valor4 + " " + valor5);

            System.out.println();

            linhaScanner.close();
        }

        scanner.close();
    }
}
