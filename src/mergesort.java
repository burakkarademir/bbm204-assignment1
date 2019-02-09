import java.io.FileWriter;
import java.io.IOException;

public class mergesort {
	
    void merge(Double[] arr, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        Double[] L = new Double [n1];
        Double R[] = new Double [n2];
 
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = (double) L[i];
                i++;
            }
            else
            {
                arr[k] = (double) R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1)
        {
            arr[k] = (double) L[i];
            i++;
            k++;
        }
 
        while (j < n2)
        {
            arr[k] = (double) R[j];
            j++;
            k++;
        }
        
    }
 
    void sort(Double[] arr, int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
 
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            merge(arr, l, m, r);
        }
        
       
		
  
    }
}
