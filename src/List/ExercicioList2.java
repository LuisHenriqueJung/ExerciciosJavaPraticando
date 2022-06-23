package List;

import java.util.*;

public class ExercicioList2 {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        respostas.add(sc.next().toLowerCase());
        System.out.println("Esteve no local do crime?");
        respostas.add(sc.next().toLowerCase());
        System.out.println("Mora perto da vítima?");
        respostas.add(sc.next().toLowerCase());
        System.out.println("Devia para a vítima?");
        respostas.add(sc.next().toLowerCase());
        System.out.println("Já trabalhou com a vítima?");
        respostas.add(sc.next().toLowerCase());

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while (contador.hasNext()){
            String resposta = contador.next();
            if (resposta.equals("sim")){
                count++;
            }
        }
        switch (count){
            case 2:
                System.out.println(" VOCÊ FOI CLASSIFICADO COMO SUSPEITO "); break;
            case 3:
            case 4:
                System.out.println("VOCÊ FOI CLASSIFICADO COMO CÚMPLICE "); break;
            case 5:
                System.out.println("VOCÊ FOI CLASSIFICADO COMO ASSASSINO "); break;
            default:
                System.out.println("VOCÊ FOI CLASSIFICADO COMO INOCENTE "); break;
        }

    }
}
/*Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"

"Esteve no local do crime?"

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".*/