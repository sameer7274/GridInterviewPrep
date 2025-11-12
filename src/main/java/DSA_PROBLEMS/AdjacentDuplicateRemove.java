package DSA_PROBLEMS;

public class AdjacentDuplicateRemove {

    public static void main(String[] args) {
        String s="abbaca";

        StringBuilder sb=new StringBuilder();

        for(char c:s.toCharArray()){
            int size=sb.length();
            if(size>0 && sb.charAt(size-1)==c){
                sb.deleteCharAt(size-1);
            }
            else {
                sb.append(c);
            }
        }
        System.out.println("the final string is "+sb);
    }
}
