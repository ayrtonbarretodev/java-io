package testeformaatual.escrita;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TesteEscritaComPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("arquivoEscritaComPrintStream.txt");

        ps.println("Olá, meu nome é Ayrton da Silva Barreto");
        ps.println("Tenho 27 anos de idade");
        ps.close();
    }
}
