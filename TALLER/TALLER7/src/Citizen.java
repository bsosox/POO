public class Citizen {
    private int DNI;
    private String name, apellido;

    public Citizen(int DNI, String name, String apellido){
        this.DNI = DNI;
        this.name = name;
        this.apellido = apellido;
    }

    public int getDNI(){
        return this.DNI;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof Citizen)){
            return false;
        }
        Citizen aux = o (Citizen) o;
        if(Integer.compare(DNI,aux.DNI) == 0){
            if(this.name.compareTo(aux.name)==0 && this.apellido.compareTo(aux.apellido)==0){
                return true;
            }
            return false;
        }
        return false;
    }
}


//Crear la clase Citizen que modela a un ciudadano con las propiedades: DNI, nombre y apellido.
//Implementar un programa que utilice las colecciones de Java para almacenar instancias de Citizen y luego accederlas por:
//DNI
//Nombre
//Nombre y Apellido
//¿Y si se desea que la colección donde se busca por DNI esté ordenada por este campo?