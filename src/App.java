import Exercice1.Exercice1;
import Exercice2.Exercice2;
import Exercice3.Exercice3;
import Exercice4.Exercice4;

public class App {

    public static void main(String[] args) throws Exception {
        Integer[] integerArray = { 3, 1, 5, 8, 4};
        String[] stringArray = { "bonjour","Bonsoir","aurevoir"};

        System.out.println("affichage du contenu de integerArray et ede StringArray");
        Exercice1.printArray(integerArray);
        Exercice1.printArray(stringArray);
        System.out.println();

        System.out.println("tri croissant du tableau ");
        Exercice2.selectionSort(integerArray);
        System.out.println();

        System.out.println("inverse un mot");
        String word ="HIPPOPOTAMUS";
        Exercice3.inverse( word);
        System.out.println();

        System.out.println("expression lambda");
        Exercice4 pi = () -> Math.PI;
        System.out.println("la valeur de pi est "+pi.findpi());


    }
}
