import java.util.Scanner;
public class Sunrise {
        static Scanner sc = new Scanner(System.in);

        public static int[] arrInput(int n){
                int[] arr = new int[n];
                for(int i=0; i<n; i++){
                        arr[i] = sc.nextInt();
                }
                return arr;
        }

        public static int heights(int[] arr){
                int sum = 1;
                int large = arr[0];
                for(int i=1; i<arr.length; i++){
                        if(arr[i] > large){
                                sum++;
                                large = arr[i];
                        }
                }
                return sum;
        }
        // TODO: Read n
        // TODO: Read the array of heights
        // TODO: Iterate through the array and count how many buildings are taller than the current maximum height encountered so far.
        // TODO: Print the count
        public static void main(String[] args) {
                int n = sc.nextInt();
                int[] h = arrInput(n);
                System.out.println(heights(h));
        }
}
