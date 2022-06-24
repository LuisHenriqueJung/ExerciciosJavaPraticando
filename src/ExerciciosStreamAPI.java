import java.util.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(numerosAleatorios5Primeiros);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        List<Integer> numerosAleatoriosInt = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        List<Integer> numerosAleatorioMaiorDois = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        System.out.println(numerosAleatorioMaiorDois);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average().ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares: ");
        //numerosAleatoriosInt.removeIf( i -> i % 2 != 0 );
        System.out.println(numerosAleatoriosInt);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("Retire os números repetidos da lista e conte quantos números ficam");
        long countNumerosUnicos = numerosAleatoriosInt.stream()
                .distinct()
                .count();
        System.out.println(countNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatoriosInt.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatoriosInt.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        System.out.println("Pegue apenas os números ímpares e some: ");
        int somaPares = numerosAleatoriosInt.stream()
                .filter(i -> i % 2 == 0 )
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(somaPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> ordemNatural = numerosAleatoriosInt.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(ordemNatural);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        Map<Boolean, List<Integer>> multiplos3e5 = numerosAleatoriosInt.stream()
                .collect(Collectors.groupingBy(i -> i % 3 == 0 || i % 5 == 0 ));
        System.out.println(multiplos3e5);
        System.out.println(numerosAleatoriosInt);
    }
}
