public class ReverseOrder {
    public static void main(String[] args) {

        String[] arr = {"one", "two", "three", "four"};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
