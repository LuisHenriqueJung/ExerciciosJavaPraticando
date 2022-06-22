import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExercicioSet2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagens = new HashSet<>();
        minhasLinguagens.add(new LinguagemFavorita("Java", 1991, "Netbeans"));
        minhasLinguagens.add(new LinguagemFavorita("Java", 1991, "Netbeans"));
        minhasLinguagens.add(new LinguagemFavorita("Phyton", 1990, "Jupyter"));

        Set<LinguagemFavorita> minhaLinguagemInserção = new LinkedHashSet<>(
                Arrays.asList(
                    new LinguagemFavorita("Java", 1991, "Netbeans"),
                    new LinguagemFavorita("Java", 1991, "Netbeans"),
                    new LinguagemFavorita("Phyton", 1990, "Jupyter")
                )
        );
        for (LinguagemFavorita linguagem:minhaLinguagemInserção) System.out.println(linguagem);

    }
}
class LinguagemFavorita {
    String nome;
    int anoDeCriacao;
    String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }
}