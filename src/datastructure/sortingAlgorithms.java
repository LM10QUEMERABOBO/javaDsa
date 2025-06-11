package datastructure;

import java.util.Arrays;

public class sortingAlgorithms {
    public static void bubblesort(int[] array){
        int temp;
        for(int i = array.length-1 ; i > 0 ; i--){
            for (int j = 0 ; j < i ; j++){
                if (array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array){
        for(int i=0;i< array.length;i++){
            int minIndex=i;
            for(int j = i+1 ; j< array.length;j++){
                if (array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            if (i!=minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void insertionSort(int[] array){
        for (int i = 0;i< array.length;i++){
            int temp=array[i];
            int j=i-1;
            while (j>-1 && temp<array[j]){
                array[j+1]=array[j];
                array[j]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args){
        int[] a={4,6,21,1,3};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
