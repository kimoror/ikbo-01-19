package lab1.var4.Zheludkov;
import java.lang.Math;

public class Main {
    public static int rnd (int max){
        return (int) (Math.random() * ++max);
    }

    public static void outArray(int[] array){
        for(int i = 0; i < 10; i++)
        {
            if(i < 9)
                System.out.print(array[i] + " ");
            else
                System.out.print(array[i]);
        }
    }

    public static void quickSort(int[] array, int low, int high){
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int indxMiddle = low + (high - low) / 2;
        int middle = array[indxMiddle];
        int i = low;
        int j = high;
        while(i <= j)
        {
            while (array[i] < middle)
            {
                i++;
            }
            while(array[j] > middle)
            {
                j--;
            }
            if (i <= j) // maybe <=
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if(j > low)
            quickSort(array, low, j);
        if( i < high)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        int[] arr = new int [10];
        short max = 1000;
        for(int i = 0; i < 10; i++) {
            arr[i] = rnd(max);
        }
        System.out.println("The original array:");
        outArray(arr);
        quickSort(arr, 0, 9);
        System.out.println();
        System.out.println("The sort array:");
        outArray(arr);
    }
}
