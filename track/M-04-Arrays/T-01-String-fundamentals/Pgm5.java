public class Pgm5{
    public static void main(String[] args){
         String s1 = "Java";
        String s2 = "JavA";
        if(s1==s2){
            System.out.println("Ref are same");
        }else{
            System.out.println("Ref not same");
        }
        if(s1.equals(s2)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}