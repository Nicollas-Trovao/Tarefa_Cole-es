import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alfabetica {

    public static void main(String args []){

        //Lista em Ordem Alfabetica:
        List<String> listaNome = new ArrayList<>();

        listaNome.add("Gabriela");
        listaNome.add("Lucas");
        listaNome.add("Rafael");
        listaNome.add("Beatriz");
        listaNome.add("Fernando");

        //Ordenando a Lista:
        System.out.println("Nomes desorganizados: " +listaNome);

        Collections.sort(listaNome);
        System.out.println("Nomes organizados em ordem alfabetica: " +listaNome);
    
        }
    }