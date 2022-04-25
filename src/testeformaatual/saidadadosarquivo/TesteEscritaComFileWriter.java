package testeformaatual.saidadadosarquivo;

import java.io.*;

public class TesteEscritaComFileWriter {
    public static void main(String[] args) throws IOException {

        //modo 1
        FileWriter fw = new FileWriter("arquivoSaidaFileWriter.txt");
        fw.write("Ayrton da Silva Barreto");
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        fw.write("Ana Maria da Silva Hilario");
        fw.close();

        //modo 2
        BufferedWriter bw = new BufferedWriter(new FileWriter("arquivoSaidaFileWriterComBufferedWriter.txt"));
        bw.write("São Paulo Futebol Clube");
        bw.newLine();
        bw.newLine();
        bw.write("América Futebol Clube");
        bw.close();

    }
}
