import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;


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

        Exiba a população PE;*/
