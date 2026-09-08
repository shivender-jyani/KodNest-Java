public class StringMethods {
    public static void main(String[] args) {
        String s = "KodNest Technologies";
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(3));
        System.out.println(s.contains("Nest"));
        System.out.println(s.contains("nest"));
        System.out.println(s.startsWith("Kod"));
        System.out.println(s.startsWith("nest"));
        System.out.println(s.endsWith("ies"));
        System.out.println(s.endsWith("kod"));
        System.out.println(s.indexOf("K"));
        System.out.println(s.replace('e', 'A'));
        System.out.println(s.substring(5));
        System.out.println(s.substring(5,14));

    }
}
