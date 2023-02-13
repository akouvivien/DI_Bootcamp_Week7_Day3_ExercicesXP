package Exercice1;

public class Exercice1 {
    
    public static < E > void printArray( E[] Array ) {
        for(E entity : Array) {
            System.out.printf("%s ", entity);
        }
        System.out.println();
    }
}
