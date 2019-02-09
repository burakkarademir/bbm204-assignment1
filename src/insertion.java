import java.util.List;
import java.util.Map;

public class insertion {
	 void insertionsort(List<String> lines, Double[] arr, String[] sortedlines)
	    {
		
	        int n = arr.length;
	        for (int i=1; i<n; ++i)
	        {
	            Double key = arr[i];
	            int j = i-1;
	 
	    
	            while (j>=0 && arr[j] > key)
	            {
	            	sortedlines[j+1]=sortedlines[j];
	                arr[j+1] = arr[j];
	                j = j-1;
	            }
	            arr[j+1] = key;
	        }
	        
	    }
	 
}
