package teste.outrasentradasesaidas;

import java.io.*;

public class EntradaPorTecladoSaidaNoArquivo {
    public static void main(String[] args) throws IOException {
        System.out.println("Digite o texto: ");
        InputStream fis = System.in; //entrada de dados pelo teclado
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream("entradaTeclado.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();
        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
