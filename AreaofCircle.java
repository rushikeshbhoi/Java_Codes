import java.util.*;

public class AreaofCircle {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Radius of Circle ");
    float rad = sc.nextFloat();   
    float Area = 3.14f * rad * rad;
    System.out.println("Area of a Circle is " + Area);
    }
}
