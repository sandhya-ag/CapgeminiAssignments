package packageArray;

//exercise 6

public class CalculateDifference {
	
	public static int calculateDifference(int n) {
		int diff = 0;
		int squareSum = 0;
		int sumSq = 0;
		for (int i = 1; i <= n; i++) {
			squareSum += i * i;
			sumSq += i;
		}
//		System.out.println(squareSum);
//		System.out.println(sumSq);
		sumSq = sumSq * sumSq;
		diff = Math.abs(squareSum - sumSq);
		return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateDifference(4));
	}
}
