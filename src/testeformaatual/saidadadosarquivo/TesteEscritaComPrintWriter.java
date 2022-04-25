package testeformaatual.saidadadosarquivo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TesteEscritaComPrintWriter {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("arquivoEscritaComPrintWriter.txt");
        pw.println("Hello, World");
        pw.println();
        pw.println(System.currentTimeMillis());
        pw.println();
        pw.println("Java 2022");
        pw.close();
    }
}
