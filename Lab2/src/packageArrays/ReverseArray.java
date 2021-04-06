package packageArrays;
import java.util.Arrays;

//exercise 3

public class ReverseArray {
	
	public static int getSorted(int[] array) {
		int[] result= new int[array.length];
		for(int i=array.length-1;i>=0;i--) {
			result[i]=array[i];
		}
		Arrays.sort(result);
		return result[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,3,2,3,4,2,4,9,6,7,6,8};
		System.out.println(getSorted(array));
	}

}
