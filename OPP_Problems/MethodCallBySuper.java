class A{
    void display(){
        System.out.println("Inside the A class");
    }
}
class B extends A{
    void display(){
        super.display();
        System.out.println("Inside Class B");
    }
}
public class MethodCallBySuper {
   public static void main(String[] args) {
        B ob = new B();
        ob.display();
   } 
}
