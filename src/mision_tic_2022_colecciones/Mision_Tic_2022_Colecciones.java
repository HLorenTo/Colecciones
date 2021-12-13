package mision_tic_2022_colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Mision_Tic_2022_Colecciones {
    public static void main(String[] args) {
        /*
       System.out.println("ArrayList String y linkedlist");
       //ArrayList<String> cars = new ArrayList<>(); //inicio vacio
       LinkedList<String> cars = new LinkedList<>(); //inicio vacio
       cars.add("Mazda");
       cars.add("Volvo");
       cars.add("Renault");
       cars.add("Ferrari");
       System.out.println(cars);
       cars.add (2,"Toyota");
       System.out.println(cars);
       cars.set(3, "Ford");
       System.out.println(cars);
       //cada tipo primitivo tiene su valor
       LinkedList<Integer> cars1 = new LinkedList<>(); //inicio vacio
       cars1.add(3);
       cars1.add(4);
       cars1.add(5);
       cars1.add(7);
       System.out.println(cars1);
       cars1.add (2,9);
       System.out.println(cars1);
       cars1.set(3, 7);
       System.out.println(cars1);
        
       System.out.println("ArrayList Con clase:  "); 
       ArrayList<Animal> animales = new ArrayList<>(); 
       animales.add(new Animal("Mara", 2, 10)); //creacion de objetos
       animales.add(new Animal("Chiquita", 1, 6)); //creacion de objetos
       //recorrer array anamiles
       for(Animal i : animales){
           System.out.println("El nombre es: "+ i.getNombre() + " el peso es de: " +i.getPeso()+" La edad es de: "+i.getEdad());
       }
*/
        System.out.println("HashSet desordenado"); 
        HashSet<String> cars2 = new HashSet<>();
        cars2.add("volvo");
        cars2.add("bmw");
        cars2.add("mazda");
        cars2.add("volvo");
        System.out.println(cars2);
        System.out.println("TreeSet ordenado");
        TreeSet<String> cars3 = new TreeSet<>();
        cars3.add("volvo");
        cars3.add("bmw");
        cars3.add("mazda");
        cars3.add("volvo");
        System.out.println(cars3);
        System.out.println("TreeMap ordenado");
        TreeMap<String, String> cars4 = new TreeMap<>();
        cars4.put("Volvo" , "Bus");
        cars4.put("Bmw" , "Camioneta");
        cars4.put("Mazda", "Automovil");
        cars4.put("Toyota", "Deportivo");
        System.out.println(cars4);
        System.out.println("HashMap desordenado");
        HashMap<String, String> cars5 = new HashMap<>();
        cars5.put("Volvo" , "Bus");
        cars5.put("Bmw" , "Camioneta");
        cars5.put("Mazda", "Automovil");
        cars5.put("Toyota", "Deportivo");
        System.out.println(cars5);
    }
}