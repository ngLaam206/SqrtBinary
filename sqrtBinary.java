
public class sqrtBinary {

	public static double sqrt(double num) {
		if (num < 0) {
			System.out.println("số vừa nhập không hợp lệ!");
			return -1;
		}
		double high = num;
		double low = 0;
		double epsilon = (float) 0.01;
		while (high - low >= epsilon) {
		double mid = (high + low) / 2;
		if (mid * mid < num) {
			 low = mid;
		}else {
			high = mid;
		}
		
	} 	
		return (high + low) / 2;
}
	
	public static void main(String[] args) {
		double num = 10.456;
		double result = sqrt(num);
		if (result != -1) {
			if (num == (int)num) {
			    System.out.println("Căn bậc 2 của " + (int)num + " là: " + result);
			} else {
			    System.out.println("Căn bậc 2 của " + num + " là: " + result);
			}
		}
	}
}
