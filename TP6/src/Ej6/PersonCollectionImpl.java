package Ej6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonCollectionImpl implements PersonCollection{

    private Map<String, Map<String, Person>> mapa = new HashMap<>();

    /*
    @Override
    public void addPerson(Person aPerson) {
        if(!(mapa.containsKey(aPerson.getLastName()))){
            mapa.put(aPerson.getLastName(), new HashMap<>());
        }
        if(!(mapa.get(aPerson.getLastName()).containsKey(aPerson.getFirstName()))) {
            mapa.get(aPerson.getLastName()).put(aPerson.getFirstName(), aPerson);
        }
        //no agrego nada porque el HashMap no tiene repetidos
    }
    */

    @Override
    public void addPerson(Person aPerson){
        mapa.putIfAbsent(aPerson.getLastName(), new HashMap<>());
        mapa.get(aPerson.getLastName()).put(aPerson.getFirstName(), aPerson);
    }


    @Override
    public List<Person> findByLastName(String lastName) {
        if(!(mapa.containsKey(lastName))){
            return new ArrayList<>();
        }
        return new ArrayList<>(mapa.get(lastName).values());
    }

    @Override
    public Person findByName(String firstName, String lastName) {
        if(!(mapa.containsKey(lastName))){
            return null;
        }
        return mapa.get(lastName).get(firstName);
    }
}
