import java.util.Arrays;
import java.util.Comparator;

public class main {

	public static void main(String[] args) {
		
		Integer[] myArray = {null, 1};
		
		Arrays.sort(myArray, new Comparator<Integer>() {
	        @Override
	        public int compare(Integer o1, Integer o2) {
	            if (o1 == null && o2 == null) {
	                return 0;
	            }
	            if (o1 == null) {
	                return 1;
	            }
	            if (o2 == null) {
	                return -1;
	            }
	            return o1.compareTo(o2);
	        }});

		for(int i = 0; i < myArray.length; i++)
			System.out.println(myArray[i]);
	}

}
