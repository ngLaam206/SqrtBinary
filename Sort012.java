import java.util.Arrays;

public class Sort012 {
    public static void arr(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        // gán low = 0 => 1 op
        // gán mid = 0 => 1 op
        // nums.length => 1 op
        // trừ -1 => 1 op
        // gán high => 1 op
        // → 5 ops

        while (mid <= high) {
            // so sánh mid <= high, lặp (n+1) lần → (n+1) ops

            if (nums[mid] == 0) {
                // nums[mid] => 1 op
                // so sánh == 0 => 1 op
                // → 2 ops

                int temp = nums[low]; 
                // nums[low] => 1 op
                // gán => 1 op
                // → 2 ops

                nums[low] = nums[mid];
                // nums[mid] => 1 op
                // gán => 1 op
                // → 2 ops

                nums[mid] = temp;
                // gán => 1 op

                low++; // tăng biến => 1 op
                mid++; // tăng biến => 1 op
                // Nhánh này tổng: 2 + 2 + 2 + 1 + 1 + 1 = 9 ops

            } else if (nums[mid] == 1) {
                // nums[mid] => 1 op
                // so sánh == 1 => 1 op
                // → 2 ops
                mid++; // 1 op
                // Nhánh này: 3 ops

            } else { // nums[mid] == 2
                // nums[mid] => 1 op
                int temp = nums[mid]; 
                // nums[mid] => 1 op
                // gán => 1 op
                // → 2 ops

                nums[mid] = nums[high];
                // nums[high] => 1 op
                // gán => 1 op
                // → 2 ops

                nums[high] = temp;
                // gán => 1 op

                high--; // 1 op
                // Nhánh này tổng: 1 + 2 + 2 + 1 + 1 = 7 ops
            }
        }   
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 0, 0, 1, 2, 2, 1}; 
        // gán mảng => 1 op

        arr(arr); 
        // gọi hàm arr => 1 op

        System.out.println(Arrays.toString(arr));
        // Arrays.toString(arr) => 1 op
        // gọi println => 1 op
        // → 2 ops
    }
}
