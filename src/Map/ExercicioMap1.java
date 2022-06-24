package Map;


import java.util.*;


public class ExercicioMap1 {
    public static void main(String[] args) {
        Map<String, Double> estadosNE = new HashMap<>(){{
            put("PE", 9.616621);
            put("AL", 3.351543);
            put("CE", 9.187103);
            put("RN", 3.534265);
        }};
        System.out.println("--------Substitua a população do RN por 3.534.165-------- ");
        estadosNE.put("RN", 3.534165);
        System.out.println(estadosNE);
        System.out.println("-------Confira se PB es´ta no dicionário-----------");
        if(!estadosNE.containsKey("PB")){
            estadosNE.put("PB", 4.039277);
        }
        System.out.println(estadosNE);
        System.out.println("-----------Exiba a população PE-------------");
        System.out.println(estadosNE.get("PE"));

        System.out.println("--Exiba todos os estados e suas populações na ordem que foi informado--");
        Map<String, Double> estadosNEOrdem = new LinkedHashMap<>(){{
            put("PE", 9.616621);
            put("AL", 3.351543);
            put("CE", 9.187103);
            put("RN", 3.534265);
        }};
        System.out.println(estadosNEOrdem);

        System.out.println("--Exiba os estados e suas populações em ordem alfabética--");
        Map<String, Double> estadosNEOrdemAlfa = new TreeMap<>(estadosNE) ;
        System.out.println(estadosNEOrdemAlfa);

        System.out.println("--Exiba o estado com o menor população e sua quantidade--");
        Double menorPopulação = Collections.min(estadosNE.values());
        String nomeMenorPopulacao = "";
        for (Map.Entry<String, Double> entry: estadosNE.entrySet()){
            if(entry.getValue().equals(menorPopulação)){
                nomeMenorPopulacao = entry.getKey();
                System.out.println(nomeMenorPopulacao + ", " + menorPopulação + " habitantes!");
            }
        }
        System.out.println("--Exiba o estado com a maior população e sua quantidade----");
        Double maiorPopulação = Collections.max(estadosNE.values());
        String nomeMaiorPopulacao = "";
        for (Map.Entry<String, Double> entry: estadosNE.entrySet()){
            if(entry.getValue().equals(maiorPopulação)){
                nomeMaiorPopulacao = entry.getKey();
                System.out.println(nomeMaiorPopulacao + ", " + maiorPopulação + " habitantes!");
            }
        }
        System.out.println("--Exiba a soma da população desses estados--");
        Iterator<Double> iterator = estadosNE.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);
        System.out.println("--Exiba a média da população deste dicionário de estados-- ");
        Double media = 0.0;
        media = soma / estadosNE.size();
        System.out.println(media);

        System.out.println("--Remova os estados com a população menor que 4.000.000--");
        Iterator<Double> iteratorRemove = estadosNE.values().iterator();
        while (iteratorRemove.hasNext()){
            if(iteratorRemove.next() < 4.000000) iteratorRemove.remove();
        }
        System.out.println(estadosNE);
        System.out.println("--Apague o dicionário de estados--");
        estadosNE.clear();
        System.out.println("--Confira se o dicionário está vazio--");
        System.out.println(estadosNE.isEmpty());
    }
    }

  /*  Dada a população estimada de alguns estados do NE brasileiro, faça:

        Estado = PE - População = 9.616.621

        Estado = AL - População = 3.351.543

        Estado = CE - População = 9.187.103

        Estado = RN - População = 3.534.265

        Crie um dicionário e relacione os estados e suas populações;

        Substitua a população do estado do RN por 3.534.165;

        Confira se o estado PB está no dicionário, caso não adicione: PB -
        4.039.277;

        Exiba a população PE;
        Exiba todos os estados e suas populações na ordem que foi
informado;

    Exiba os estados e suas populações em ordem alfabética;

    Exiba o estado com o menor população e sua quantidade;

    Exiba o estado com a maior população e sua quantidade;

    Exiba a soma da população desses estados;

    Exiba a média da população deste dicionário de estados;

    Remova os estados com a população menor que 4.000.000;

    Apague o dicionário de estados;

    Confira se o dicionário está vazio.*/
