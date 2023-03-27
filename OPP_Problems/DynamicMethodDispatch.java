class Phone{
    public void on(){
        System.out.println("Starting the phone....");
    }
    public void greetings(){
        System.out.println("Hello World....!!");
    }
}
class SmartPhone extends Phone{
    public void on(){
        System.out.println("Starting the Smart Phone...");
    }
    public void music(){
        System.out.println("Playing Music....");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //dynamic dispatch
        // runtime polymorphism
        Phone obj = new SmartPhone();

        obj.on();
        // obj.music();//It will show an error
    }
}
