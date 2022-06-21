import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ExercicioList1 {
    public static void main(String[] args) {
        ArrayList<mesTemp> temperaturas = new ArrayList<>();
        temperaturas.add(new mesTemp("janeiro", 18.9));
        temperaturas.add(new mesTemp("Fevereiro", 20.1));
        temperaturas.add(new mesTemp("Marco", 21.8));
        temperaturas.add(new mesTemp("Abril", 15.0));
        temperaturas.add(new mesTemp("maio", 26.7));
        temperaturas.add(new mesTemp("Junho", 22.5));
        double soma = 0.0;
        for (mesTemp mes:temperaturas) {
           soma += mes.getMediaTemp();
        }
        double mediTemperaturaSemestre = soma / temperaturas.size();

        System.out.println("Messes com temperatura acima da média de :" + mediTemperaturaSemestre + " ºC");
        for (mesTemp mesMaiorMedia:temperaturas) {
            if(mesMaiorMedia.getMediaTemp() > mediTemperaturaSemestre){
                System.out.println("Mes: " + mesMaiorMedia.getName() + ", Temperatura média: " + mesMaiorMedia.getMediaTemp() + "ºC");
            }
        }
    }
}
class mesTemp{
    String name;
    double mediaTemp;

    public mesTemp(String name, double mediaTemp) {
        this.name = name;
        this.mediaTemp = mediaTemp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMediaTemp() {
        return mediaTemp;
    }

    public void setMediaTemp(double mediaTemp) {
        this.mediaTemp = mediaTemp;
    }
}
/*Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista. (OK)

Após isto, calcule a média semestral das temperaturas (OK) e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).*/