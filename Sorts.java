//Javier Estuardo Hernández 19202
//Para esta hoja de trabajo me apoyé de la págnina web de geeks
//Del documento SoS-CheatSheet.pdf "recurso de la clase"

import java.util.*;

public class Sorts{

//SELECTION SORT
    public void selectionSort(int[] arr){
        for(int i = 0; i < arr.length- 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

//IMPRIMIR EL ARRAY SORTED
    public void showSelection(int[] arr){
        for(int i = 0; i < arr.length- 1; i++){
            System.out.println(arr[i]);
        }
    }

//MERGE SORTED
    public void mergeSort(int[] arr, int low, int high){
        if(high <= low) return;
        int half = (low + high)/2;
        mergeSort(arr, low, half);
        mergeSort(arr, half + 1, high);
        merge(arr, low, half, high);
    }

//MERGE SORTED (SUBARRAYS)
    public static void merge(int[] arr, int low, int half, int high){
        int leftArray[] = new int[half - low + 1];
        int rightArray[] = new int[high - half];

        for(int i = 0; i < leftArray.length; i++){
            leftArray[i] = arr[low + i];
        }

        for(int i = 0; i < rightArray.length; i++){
            rightArray[i] = arr[half + i + 1];;
        }

        int leftIndex = 0;
        int rightIndex = 0;
        for(int i = low; i < high + 1; i++){
            if(leftIndex < leftArray.length && rightIndex < rightArray.length){
                if(leftArray[leftIndex] < rightArray[rightIndex]){
                    arr[i] = leftArray[leftIndex];
                    leftIndex++;
                } else{
                    arr[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if(leftIndex < leftArray.length){
                arr[i] = leftArray[leftIndex];
                leftIndex++;
            } else if(rightIndex < rightArray.length){
                arr[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
