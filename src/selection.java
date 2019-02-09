import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class selection {
	public void  selectionsort(List<String> lines, Double[] arr, String[] sortedlines, String filename, String trueorfalse, String firstrow)
    {
	    
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
           
            String temp2=sortedlines[min_idx];
            Double temp = arr[min_idx];
            sortedlines[min_idx]=sortedlines[i];
            arr[min_idx] = arr[i];
            sortedlines[i]=temp2;
            arr[i] = temp;

        }
        if(trueorfalse.equals("T")) {
		      FileWriter writer = null;
		      
		      try {
		    			
		          writer = new FileWriter(filename);
		          writer.append(firstrow);
		          writer.append("\n");
		          for(int y=0;y<sortedlines.length;y++) {
			          writer.append(sortedlines[y]);
			          writer.append("\n");
			          


		            }	          


		       } catch (IOException e) {
		          e.printStackTrace();
		       } finally {
		             try {
		           writer.flush();
		           writer.close();
		             } catch (IOException e) {
		           e.printStackTrace();
		             }
		       }	
    }
    }
}
