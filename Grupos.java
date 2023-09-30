import java.util.ArrayList;
import java.util.List;

public class Grupos {
    
    public static void main(String[] args){

    //Lista de Nomes:
    List<String> homemNomes = new ArrayList<>();
    List<String> mulherNomes = new ArrayList<>();

    mulherNomes.add("Pamela");
    homemNomes.add("Kaio");
    homemNomes.add("Roberto");
    mulherNomes.add("Larissa");
    mulherNomes.add("Suelen");
    homemNomes.add("Juan");

    //Nomes:
    System.out.println("Pamela-F, Kaio-M, Roberto-M, Larissa-F, Suelen-F, Juan-M");

    //Listas:
    System.out.println("Agora, os Nomes separados em grupos:");
    System.out.println("Nomes Femininos: " +mulherNomes);
    System.out.println("Nomes Masculinos: " +homemNomes);
    }
}
