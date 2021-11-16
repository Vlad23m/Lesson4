public class MinimumValue {
    public static void main(String[] args) {

        int [] arr = new int [] {5470, 1114, 736, 656, 987};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Minimum: " + min);
    }
}
