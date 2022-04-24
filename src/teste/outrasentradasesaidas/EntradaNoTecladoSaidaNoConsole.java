package teste.outrasentradasesaidas;

import java.io.*;

public class EntradaNoTecladoSaidaNoConsole {
    public static void main(String[] args) throws IOException {
        System.out.println("Digite o texto: ");
        InputStream fis = System.in; //entrada de dados pelo teclado
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        FilterOutputStream fos = System.out; //saida no console
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
