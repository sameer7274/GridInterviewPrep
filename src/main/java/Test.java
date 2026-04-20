public class Test {
    public static void main(String[] args) {
        String s = "1234Welcome567";
        System.out.println(display(s));
    }
    private static String display(String s){
        return s.replaceAll("[0-9]+","");
    }
}
