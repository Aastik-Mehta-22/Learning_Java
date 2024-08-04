package access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num,float gpa){
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
        // return this.num == ((ObjectDemo)obj).num; // we can modify this 
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34,56.8f);
        ObjectDemo obj2 = new ObjectDemo(12,78.9f);

        if (obj1 == obj2) {
            System.out.println("obj1 is equals to obj2");
        }
        if (obj1.equals(obj2)) {
            System.out.println("obj1 is equals to obj2");
        }

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }

    
    
    
}
