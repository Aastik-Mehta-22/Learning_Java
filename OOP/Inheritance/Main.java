package Inheritance;

public class Main {
    public static void main(String[] args) {
        
        Box box = new Box(4.6,7.9,9.9);
        // Box box2 = new Box(box);

        // System.out.println(box.l + " " + box.w + " " + box.h);
        // System.out.println(box2.l + " " + box2.w + " " + box2.h);

        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight(2,3,4,8);

        // System.out.println(box3.h + " " + box3.weight);

        Box box5 = new BoxWeight(2,3,4,8);
        // System.out.println(box5.w);
        // System.out.println(box5.weight); // it can not acess weight because its not of class Box


        // there are many variables in both child and parent class
        // we are given acess to variables that are in refrence type i.e Boxweight
        // hence, we should have acess to weight variable
        // this also means, that ones you re trying to acess should be initalised
        // but here, when the object itself is of type parent class, how will you call the constructor of child class
        // thats why error

        // BoxWeight box6 = new Box();

        BoxPrice box6 = new BoxPrice(1,2,3,4,5);
        System.out.println(box6.h + " " + box6.w + " "+ box6.weight + " "+ box6.price);


        Box.greeting();
    }
}
