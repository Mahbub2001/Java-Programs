class A{
    int x = 10;
}
class B extends A{
    int x = 5;
    void display(){
        System.out.println(x);
        System.out.println(super.x);
    }
}
class SuperVariableCall{
    public static void main(String[] args) {
        B ob = new B();
        ob.display();
    }
}