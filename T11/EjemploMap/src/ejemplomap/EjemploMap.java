package ejemplomap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * Ejemplo de mapas
 * 
 * @author Usuario
 */
public class EjemploMap {

    public static void mostrarMap(Map<Integer, String> mapa) {
        Iterator<Integer> it = mapa.keySet().iterator();
        
        Integer claveAux;
        while(it.hasNext()) {
            claveAux = it.next();
            System.out.println("Clave: " + claveAux + " .Valor: " + mapa.get(claveAux));
        }   
    }
    
    public static void rellenarMap(Map<Integer, String> mapa) {
        mapa.put(1, "Juan");
        mapa.put(3, "Pedro");
        mapa.put(5, "María");
        mapa.put(2, "Ana");
        mapa.put(6, "Daniel");
        mapa.put(4, "Sonia");
    }
    
    /**
     * Método main
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //HASH_MAP
        Map<Integer,String> hashMap = new HashMap<>();
        rellenarMap(hashMap);
        
        System.out.println("*** HASH_MAP ***");
        mostrarMap(hashMap);
        System.out.println("");
        
        //LINKED_HASH_MAP
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        rellenarMap(linkedHashMap);
        
        System.out.println("*** LINKED_HASH_MAP ***");
        mostrarMap(linkedHashMap);
        System.out.println("");
        
        //TREE_MAP
        Map<Integer,String> treeMap = new TreeMap<>();
        rellenarMap(treeMap);
        
        System.out.println("*** TREE_MAP ***");
        mostrarMap(treeMap);
        System.out.println("");
    }
    
}
