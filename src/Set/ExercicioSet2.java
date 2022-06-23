package Set;

import java.util.*;

public class ExercicioSet2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagens = new HashSet<>();
        minhasLinguagens.add(new LinguagemFavorita("Java", 1995, "Netbeans"));
        minhasLinguagens.add(new LinguagemFavorita("JavaScript", 1991, "VSCode"));
        minhasLinguagens.add(new LinguagemFavorita("Phyton", 1990, "Jupyter"));
//a) Ordem de inserção;
        Set<LinguagemFavorita> minhaLinguagemInsercao = new LinkedHashSet<>(
                Arrays.asList(
                        new LinguagemFavorita("Java", 1991, "Netbeans"),
                        new LinguagemFavorita("JavaScript", 1995, "VSCode"),
                        new LinguagemFavorita("Phyton", 1990, "Jupyter")
                )
        );
        System.out.println("---------------------Ordem de inserção-----------------------");
        for (LinguagemFavorita linguagem : minhaLinguagemInsercao) {
            System.out.println(linguagem.getNome() +
                    ", " + linguagem.getAnoDeCriacao() +
                    ", " + linguagem.getIde());
        }

//b) Ordem natural(nome);
        System.out.println("---------Ordem natural-----------------");
        Set<LinguagemFavorita> minhasLinguagemNatural = new TreeSet<>(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagemNatural) {
            System.out.println(linguagem.getNome() +
                    ", " + linguagem.getAnoDeCriacao() +
                    ", " + linguagem.getIde());
        }
        System.out.println("---------------Ordem IDE --------------- ");
        Set<LinguagemFavorita> minhasLinguamIde = new TreeSet<>(new ComparatorIde());
        minhasLinguamIde.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem:minhasLinguamIde) {
            System.out.println(linguagem.getNome() +
                    ", " + linguagem.getAnoDeCriacao() +
                    ", " + linguagem.getIde());
        }
        System.out.println("-----------Ordem de criação e nome---------------");
        Set<LinguagemFavorita> minhasLinguagensCriacaoNome = new TreeSet<>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensCriacaoNome.addAll(minhasLinguagens);
        for(LinguagemFavorita linguagem : minhasLinguagensCriacaoNome){
            System.out.println(linguagem.getNome() +
                    ", " + linguagem.getAnoDeCriacao() +
                    ", " + linguagem.getIde());
        }
        System.out.println("---------Nome ,ano de criação e IDE----------------");
        Set<LinguagemFavorita> minhasLinguagensNomeAnoIDE = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagensNomeAnoIDE.addAll(minhasLinguagens);
        for(LinguagemFavorita linguagem : minhasLinguagensNomeAnoIDE){
            System.out.println(linguagem.getNome()+
                    ", " + linguagem.getAnoDeCriacao() +
                    ", " + linguagem.getIde());
        }
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
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

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareToIgnoreCase(linguagemFavorita.nome);

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinguagemFavorita)) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }
}
class ComparatorIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}
class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}
class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}
/*
Crie uma classe Set.LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/