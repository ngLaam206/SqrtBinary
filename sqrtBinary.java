vpublic class sqrtBinary {

    public static double sqrt(double num) {
        if (num < 0) {                  // 1 so sánh => 1 op
            System.out.println("số vừa nhập không hợp lệ!"); // 1 gọi hàm => 1 op
            return -1;                  // 1 return => 1 op
        }
        double high = num;              // 1 gán => 1 op
        double low = 0;                 // 1 gán => 1 op
        double epsilon = (float) 0.01;  // ép kiểu (1) + gán (1) => 2 op

        while (high - low >= epsilon) { // phép trừ (1) + so sánh (1) → chạy k+1 lần
            double mid = (high + low) / 2;  // cộng (1) + chia (1) + gán (1) = 3 op

            if (mid * mid < num) {          // nhân (1) + so sánh (1) = 2 op
                low = mid;                  // gán = 1 op
            } else {
                high = mid;                 // gán = 1 op
            }
        }  // mỗi vòng while ≈ 3 + 2 + 1 = 6 op

        return (high + low) / 2;        // cộng (1) + chia (1) + return (1) = 3 op
    }

    public static void main(String[] args) {
        double num = 10.456;            // gán = 1 op
        double result = sqrt(num);      // gọi hàm (1) + gán (1) = 2 op

        if (result != -1) {             // so sánh = 1 op
            if (num == (int)num) {      // ép kiểu (1) + so sánh (1) = 2 op
                System.out.println("Căn bậc 2 của " + (int)num + " là: " + result); 
                // ép kiểu (1) + nối chuỗi (2) + gọi hàm (1) = 4 op
            } else {
                System.out.println("Căn bậc 2 của " + num + " là: " + result);
                // nối chuỗi (2) + gọi hàm (1) = 3 op
            }
        }
    }
}
Nếu num < 0 -> = ~10 op.

Nếu num >= 0 →  = ~ 8k + 17 op
