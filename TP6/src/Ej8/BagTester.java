package Ej8;

public class BagTester {

    public static void main(String[] args) {
        Bag<String> bag = new BagImpl<>();
        bag.add("Hola");
        bag.add("Hola");
        System.out.println(bag.count("Hola"));     // 2
        bag.add("Chau");
        System.out.println(bag.size());            // 3
        System.out.println(bag.sizeDistinct());    // 2
        System.out.println(bag.contains("Chau"));  // true
        bag.remove("Hola");
        System.out.println(bag.count("Hola"));     // 1
        bag.remove("Hola");
        System.out.println(bag.contains("Hola"));  // false
        bag.remove("Hola");                        // NoSuchElementException
    }

}

/*

Diseñar la interfaz Bag que define una colección de
elementos no ordenados que admite repeticiones.
Dado el siguiente programa de prueba,
deducir la definición de la interfaz Bag y realizar la implementación BagImpl.
 */