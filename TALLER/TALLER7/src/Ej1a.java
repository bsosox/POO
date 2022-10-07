import java.util.HashMap;
import java.util.HashSet;

public class Ej1a {

    private static void main(String[] args){

        Citizen uno = new Citizen(1234,"Juan","Perez");
        Citizen dos = new Citizen(5678, "Maria", "Lopez");

        Map<Integer, Citizen> porDNI = new HashMap<>();
        porDNI.put(uno.getDNI(), uno);
        porDNI.put(dos.getDNI(), dos);

        Citizen copia = porDNI.get(1234);

        Map<String, List<Citizen>> porNombre = new HashMap<>();

        porNombre.put("Juan", newArrayList<>());
        porNombre.get("Juan").add

    }

}
