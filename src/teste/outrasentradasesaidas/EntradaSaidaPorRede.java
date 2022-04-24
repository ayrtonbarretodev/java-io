package teste.outrasentradasesaidas;

import java.io.*;
import java.net.Socket;

public class EntradaSaidaPorRede {
    public static void main(String[] args) throws IOException{


        InputStream fis = new Socket().getInputStream(); //entrada por Rede
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new Socket().getOutputStream(); //saida por Rede
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();
        while (linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush(); //força que a cada escrita, seja mostrado no console a mensagem imediatamente, ou seja, limpa o buffer a cada escrita
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}
