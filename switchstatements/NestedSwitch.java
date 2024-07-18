
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();
        String dept = in.next();

        switch (empId) {
            case 1:
                System.out.println("Kunal Kushwaha");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                System.out.println("Emp no 3");
                switch (dept) {
                    case "IT":
                        System.out.println("IT Dept");
                        break;
                    case "Management":
                        System.out.println("Management Dept");
                        break;
                    default:
                        System.out.println("No department matches");;
                }
                break;
     
        
            default:
                System.out.println("Enter correct EmpId");
                break;
        }

    }
}
