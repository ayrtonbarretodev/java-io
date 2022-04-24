package teste.leitura;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo
        InputStream fis = new FileInputStream("lorem.txt"); //retorna bytes

        Reader isr = new InputStreamReader(fis);  //bytes -> char

        BufferedReader br = new BufferedReader(isr);
        //br.readLine(); char -> linha

        String linha = br.readLine();
        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();

    }
}
