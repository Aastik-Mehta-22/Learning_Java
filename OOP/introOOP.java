
import java.util.Arrays;

public class introOOP {
    public static void main(String[] args) {
        
        // store 5 roll no
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        //data of 5 students : {rollno , name, marks}
        int[] rno= new int[5];
        String[] name = new String[5];
        float[] marks= new float[5];

        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students)); // by default if we are printing it give me null

        // declaring
        // Student kunal;  // this kunal is oof our own datatype that we create using class
        
        Student kunal = new Student(14,"Kunal Kushawa",88.5f);

        // kunal.rno = 13;
        // kunal.name = "Kunal Kushawa";
        // kunal.marks = 88.5f;
        
        // System.out.println(kunal); // give me random value
        // System.out.println(kunal.rno); // give me 0 by default
        // System.out.println(kunal.name); // give me null by default
        // System.out.println(kunal.marks); // give me 0.0 by default
        
        // kunal.greeting();

        // Student  random = new Student(kunal);
        // System.out.println(random.name);

        Student  random2 = new Student();
        System.out.println(random2.name);

        
    }

}

// create a class
//for every single student
class Student{
    int rno;
    String name;
    float marks = 90; // 90 here is default value 


    // we need a way to add the values of the above 
    // properties object by object

    
    void greeting(){
        System.out.println("Hello My name is " + this.name);
    }
    
    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    // Student(){
     
    //     this.rno = 13;
    //     this.name = "Kunal Kushawa";
    //     this.marks = 88.5f;
    
    // }
    Student(){
        // this is how you call another constructor from the constructor
        //internally : new Student()

        this(13,"default person",100.0f);
    }

    Student(int rno,String name,float marks){
     
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    
    }
    
    
}