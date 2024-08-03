package Inheritance;

public class Box {
    private double l; // if we make it private we can use it only in this file
    double w;
    double h;

    public Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box(double side){

        super(); // object class
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l,double h,double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){

        System.out.println("Running the Box");
    }
}
