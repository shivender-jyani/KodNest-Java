class Parent{
    Parent(){
        System.out.println("Inside 0 par parent const");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Inside 0 par child const");
    }
}

public class Pgm1 {
    public static void main(String[] args) {
        Child c1 = new Child();
    }
}
