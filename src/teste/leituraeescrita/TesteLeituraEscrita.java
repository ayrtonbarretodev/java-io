package teste.leituraeescrita;

import java.io.*;

public class TesteLeituraEscrita {
    public static void main(String[] args) throws IOException {
        /* Realizando a leitura do arquivo lorem.txt e copiando os dados desse aqruivo para um novoArquivo.txt */

        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream("novoArquivo.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();
        while (linha != null) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
