import java.util.ArrayList;
import java.util.List;

public class Grupos {
    
    public static void main(String[] args){

    //Lista de Nomes:
    List<String> Nomes = new ArrayList<>();

    Nomes.add("Pamela-F");
    Nomes.add("Kaio-M");
    Nomes.add("Roberto-M");
    Nomes.add("Larissa-F");
    Nomes.add("Suelen-F");
    Nomes.add("Juan-M");

    //Nomes:
    System.out.println(Nomes);

    //Listas:
    List<String> nomesFemininos = new ArrayList<>();
    List<String> nomesMasculinos = new ArrayList<>();

    //Organizando
    for (String nome : Nomes) {
        //Se possuir F:
        if (nome.endsWith("-F"))
        nomesFemininos.add(nome);

         else if (nome.endsWith("-M"))
        nomesMasculinos.add(nome);
    }

    //Listas:
    System.out.println("Agora, os Nomes separados em grupos:");
    System.out.println("Nomes Femininos: " +nomesFemininos);
    System.out.println("Nomes Masculinos: " +nomesMasculinos);
    }
}
