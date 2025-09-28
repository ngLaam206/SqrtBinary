public class BinarySearch {
    // Hàm tìm kiếm nhị phân
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1; 
        // left=0 → 1 op
        // arr.length → 1 op, trừ -1 → 1 op, gán → 1 op
        // => 4 op

        while (left <= right) { 
            // So sánh left <= right → chạy 4 lần (3 true + 1 false) → 4 op

            int mid = (left + right) / 2; 
            // cộng (1) + chia (1) + gán (1) = 3 op

            if (arr[mid] == target) { 
                // arr[mid] truy cập (1) + so sánh (1) = 2 op
                return mid; 
                // return (1 op, chỉ chạy khi tìm thấy target vòng 3)
            } else if (arr[mid] < target) { 
                // arr[mid] (1) + so sánh (1) = 2 op
                left = mid + 1; 
                // cộng (1) + gán (1) = 2 op
            } else {
                right = mid - 1; 
                // trừ (1) + gán (1) = 2 op
            }
        }

        return -1; // 1 op nếu không tìm thấy (trường hợp này không chạy)
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13}; 
        // khởi tạo mảng: 7 gán phần tử + 1 gán tham chiếu = 8 op
        int target = 13; 
        // gán = 1 op

        int result = binarySearch(arr, target); 
        // gọi hàm (1) + gán (1) = 2 op

        if (result != -1) { 
            // so sánh != → 1 op
            System.out.println("Tìm thấy " + target + " tại vị trí: " + result); 
            // nối chuỗi target (1) + nối result (1) + println (1) = 3 op
        } else {
            System.out.println("Không tìm thấy " + target); 
            // trường hợp này không chạy
        }
    }
}
