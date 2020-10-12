package practice6.var1;

public class Sorting {

    public static void insertionSort(Comparable[] list){
        int j;
        for(int i = 0;i < list.length; i++){
            j = i;
            Comparable key = list[i];
            while(j > 0 && key.compareTo(list[j-1]) > 0){
                list[j] = list[j-1];
                j--;
            }
            list[j] = key;
        }
    }
}
