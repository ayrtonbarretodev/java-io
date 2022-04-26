import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String letra = "ç";

        //recebe como parâmetro a posição da letra na String
        System.out.println(letra.codePointAt(0)); //saída 67

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = letra.getBytes(StandardCharsets.UTF_16);
        System.out.print(bytes.length + ", UTF-16, ");
        String sNovo = new String(bytes, "UTF-16");
        System.out.println(sNovo);

        bytes = letra.getBytes(StandardCharsets.US_ASCII);
        System.out.print(bytes.length + ", US-ASCII ");
        sNovo = new String(bytes,"US-ASCII");
        System.out.println(sNovo);

        bytes = letra.getBytes("windows-1252");
        System.out.print(bytes.length + ", windows-1252 ");
        sNovo = new String(bytes,"windows-1252");
        System.out.println(sNovo);
    }
}
