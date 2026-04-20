public class Array1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int l = arr.length;
        int n = 21;

        int cycle = n / l;
        int rem = n % l;

        System.out.println("cycle = " + cycle);

        for(int j = 1; j <= cycle; j++){
            // odd cycle → forward
            if(j % 2 == 1){
                for (int i = 0; i < l; i++) {
                    System.out.println(arr[i]);
                }
            }
            // even cycle → reverse
            else{
                for(int k = l-1; k >= 0; k--) {
                    System.out.println(arr[k]);
                }
            }
        }

        // print remaining elements in forward direction
        for (int m = 0; m < rem; m++){
            System.out.print(arr[m] + " ");
        }
    }
}
