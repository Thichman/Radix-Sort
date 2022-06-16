
public class main2 {

	public static void main(String[] args) {
		Radix radix = new Radix();
		
	        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66, 500, 900,1000}; 
	        int n = arr.length; 
	        radix.radixsort(arr, n); 
	        radix.print(arr, n); 

	}

}
