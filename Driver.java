//Javier Estuardo Hernández 19202
//Para esta hoja de trabajo me apoyé de la págnina web de geeks
//Del documento SoS-CheatSheet.pdf "recurso de la clase"

import java.util.*;


public class Driver{

    public static void main(String[] args) {

        //INSTANCIA DE SORTS E INICIALIZACION DEL ARRAY DE 20 ENTEROS
        Sorts s = new Sorts();
        int numbers[] = new int[]{7, 1024, 33, 556, 89, 428, 134, 15, 378, 721, 1424, 245, 29, 888, 46, 679, 1181, 51, 923, 1348};
        
        //LISTA ORIGINAL (DESORDENADA)
        System.out.println("\nlista original:");
        s.showSelection(numbers);

        //PRUEBA DEL SELECTION SORT
        s.selectionSort(numbers);
        System.out.println("\nSelection Sort");
        s.showSelection(numbers);

        //PRUEBA DEL MERGE SORT
        System.out.println("\nMerge Sort");
        s.mergeSort(numbers, 0, 19);
        System.out.println(Arrays.toString(numbers));

        //RUNTIME MERGE SORT
        Collections.shuffle(Arrays.asList(numbers));
        System.out.println();
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        long startTime = System.nanoTime();
        s.mergeSort(numbers, 0, numbers.length - 1);
        long endTime = System.nanoTime();
        
        System.out.println();
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println();
        System.out.println("Merge Sort Runtime: " + (endTime - startTime));
    }
}
