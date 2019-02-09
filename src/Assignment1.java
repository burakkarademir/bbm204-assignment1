import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.nio.file.Files;
import java.io.*;
import java.util.List;
import java.util.Map;


public class Assignment1 extends selection{
	public static void main(String[] args) throws IOException {
	        
		int featureindex=Integer.parseInt(args[1]);
		String trueorfalse=args[2];
		BufferedReader reader = new BufferedReader(new FileReader(args[0]));
		List<String> lines = new ArrayList<>();
		String line = null;

		while ((line = reader.readLine()) != null) {
		    lines.add(line);
		}
		String firstrow=lines.get(0);
		lines.remove(lines.get(0));
		int lenght=lines.size();
		
		String sortedlines[] = new String[lenght];

		Double[] arr =new Double[lenght];
		int index=Integer.parseInt(args[1]);
		
		for(int i=0;i<lenght;i++) {	
			sortedlines[i]=lines.get(i);
			 arr[i]=Double.parseDouble(lines.get(i).split(",")[index-1]);

		}
		String filename=args[0];
		
		
	 	int low=0;
	 	int high=arr.length-1;
		selection sel=new selection();
		insertion ins=new insertion();
		mergesort merge=new mergesort();
		sel.selectionsort(lines, arr, sortedlines, filename, trueorfalse, firstrow);
		ins.insertionsort(lines, arr,sortedlines);
		merge.sort(arr, low, high);
	   
		
		
	}
}




















































