package teste.escrita;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("Ayrton da Silva Barreto");
        bw.newLine();
        bw.newLine();
        bw.write("Ana Maria da Silva Hilario");

        bw.close();

    }
}
