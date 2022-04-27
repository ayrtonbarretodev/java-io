package serializacao.devdojo;

import java.io.*;

/* https://www.youtube.com/watch?v=5Rq6n-q471Q&t=458s */

/* De modo bem resumindo, serialização é "pegar" um objeto e passar ele por um fluxo de dados */
public class SerializacaoTest {
    public static void main(String[] args) {
        //gravadorObjeto();
        leitorObjeto();
    }


    //Serialização - A transformação do objeto em um fluxo binário é chamada de serialização.
    private static void gravadorObjeto() {
        Aluno aluno = new Aluno(1L, "Ayrton Barreto", "123456");
        Turma t = new Turma("Galero do B");
        aluno.setTurma(t);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"));) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Desserialização - A transformação de um fluxo binário em um objeto é chamada de desserialização.
    private static void leitorObjeto() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"));) {
            Aluno a = (Aluno) ois.readObject();
            System.out.println(a);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
