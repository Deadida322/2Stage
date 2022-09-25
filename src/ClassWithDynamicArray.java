import java.util.ArrayList;
import java.util.Collections;

public class ClassWithDynamicArray {
    private int size = 0;
    private ArrayList<Integer> arr;
    ClassWithDynamicArray(int n){
        size = n;
        arr = new ArrayList<>(n);
    }
    public void printArray(){
        System.out.println(arr.toString());
    }
    private int getRandomInt(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    public void randomFillArray(){
        for (int i = 0; i < this.size; i++){
            arr.add(getRandomInt(0, 10));
        }
    }

    public void shakeArray(){
        Collections.shuffle(this.arr);
    }

    public Integer countElems(int elem){
        int counter = 0;
        for (int el : arr){
            if (el == elem){
                counter++;
            }
        }
        return counter;
    }
}
