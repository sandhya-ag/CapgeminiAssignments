package packageArrays;
import java.util.Arrays;

//exercise 4

public class RemoveDuplicates {
	
	public static int[] removeDuplicate(int[] array) {
		int j=0;
		int[] result= new int[array.length];
		Arrays.sort(array);
		for(int i=0;i<array.length-1;i++) {
			if(array[i]!=array[i+1]) {
				array[j]=array[i];
				j++;
			}
		}
		array[j]=array[array.length-1];
		
		for(int i=j;i>=0;i--) {
			System.out.print(array[i]);
		}
	return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,3,2,3,4,2,4,9,6,7,6,8};
		removeDuplicate(array);

	}

}
