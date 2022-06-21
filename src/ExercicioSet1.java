import java.util.*;

public class ExercicioSet1 {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");

//a.Exiba todas as cores uma abaixo da outra
        for (String cor: coresArcoIris)  System.out.println(cor);
        System.out.println("-------------------------------------");
//b. A quantidade de cores que o arco-íris tem
        System.out.println("O arco iris tem " + coresArcoIris.size() + " cores.");
        System.out.println("-------------------------------------");
//c. Exiba as cores em ordem alfabética
        Set<String> ordemAlfaBeta = new TreeSet<>(coresArcoIris);
        for (String cor: ordemAlfaBeta) System.out.println(cor);
        System.out.println("-------------------------------------");
//d. Exiba as cores na ordem inversa da que foi informada
        Set<String> ordemInversaCores = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));

        List<String> ordemInversaCoresList = new ArrayList<>(ordemInversaCores);//Eu preciso adicionar o meu LinkedHashSet Array a um List Para poder usar o método .reverse do collections.
        Collections.reverse(ordemInversaCoresList);
        System.out.println(ordemInversaCoresList);
        System.out.println("-------------------------------------");
//e. Exiba todas as cores que começam com a letra ”v”
        for (String cor: coresArcoIris) {
            if(cor.startsWith("v")) System.out.println(cor);
        }
        System.out.println("-------------------------------------");
//f. Remova todas as cores que não começam com a letra “v”
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris);
//g. Limpe o conjunto
        coresArcoIris.clear();

//h. Confira se o conjunto está vazio
        System.out.println("o conjunto esta limpo: " + coresArcoIris.isEmpty() );
    }

}
/*Crie um conjunto contendo as cores do arco-íris e:

a.Exiba todas as cores uma abaixo da outra

b. A quantidade de cores que o arco-íris tem

c. Exiba as cores em ordem alfabética

d. Exiba as cores na ordem inversa da que foi informada

e. Exiba todas as cores que começam com a letra ”v”

f. Remova todas as cores que não começam com a letra “v”

g. Limpe o conjunto

h. Confira se o conjunto está vazio*/
