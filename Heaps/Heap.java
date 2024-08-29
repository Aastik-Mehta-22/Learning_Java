import  java.util.ArrayList;

public class Heap<T extends Comparable<T>>{

    private ArrayList<T> list;

    public Heap(){
        list = new ArrayList<>();

    }

    private void swap(int first,int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second,temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
      }
    
    private int left(int index) {
        return index * 2 + 1;
    }
      
    private int right(int index) {
        return index * 2 + 2;
    }
}
