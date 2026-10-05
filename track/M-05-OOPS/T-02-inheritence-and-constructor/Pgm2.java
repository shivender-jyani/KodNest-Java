class Parent{
    Parent(){
        System.out.println("Inside 0 par parent const");
    }
}
class Child extends Parent{
    Child(){
        this(10);
        System.out.println("Inside 0 par child const");
    }
    Child(int a){
        this(10,20);
        System.out.println("Inside 1 par child const");
    }
    Child(int a,int b){
        System.out.println("Inside 2 par child const");
    }

}

public class Pgm2 {
    public static void main(String[] args) {
        Child c1 = new Child();
    }
}