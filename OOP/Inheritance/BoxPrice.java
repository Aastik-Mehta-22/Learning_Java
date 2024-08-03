package Inheritance;

public class BoxPrice extends BoxWeight{
    double price;

    public BoxPrice(){
        this.price = -1;
        
    }

    public BoxPrice(double l ,double h,double w,double weight,double price){

        super(l,h,w,weight);// what is this? call the parent class constructor
        // used to iniatlise the values present in parent class
        this.price = price;
    }
}
