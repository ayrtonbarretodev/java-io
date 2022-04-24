package teste.escrita;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo
        FileInputStream fis = new FileInputStream("lorem.txt"); //retorna bytes

        InputStreamReader isr = new InputStreamReader(fis);  //bytes -> char

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
