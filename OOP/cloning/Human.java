package cloning;

public class Human implements Cloneable{
    
    int age;
    String name;
    int[] arr;

    public Human(int age,String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,7,9};

        
    }

    public Human(Human other){
        this.age  = other.age;
        this.name = other.name;

    }

    public Object clone() throws CloneNotSupportedException{
        // this is shallow copy 
        return super.clone();
    }
}
