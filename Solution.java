
// Scanner package is imported
import java.util.*;

// class name
public class Solution {
	
   // Main method
   public static void main(String[] args) {
	  //Scanner function to Scan input values
	  Scanner scan = new Scanner(System.in);
	  // Reading Number of Rows and Cols
	  // Reading Row
	  int m = scan.nextInt();
	  // Reading Col
	  int n = scan.nextInt();
	  
	  // Initilaizing 2D array to read values
	  int[][] matrix = new int[m][n];
	  for(int i = 0; i < m; i++) {
		  for(int j = 0; j < n; j++) {
			  // Reading matrix
			  matrix[i][j] = scan.nextInt();
		  }
	  }
	   
	  // Main logic
	  // here we are incrementing i and j 2 times because we want to find 2 x 2
	  // we dont want overlapped 2 x 2 matrix 
	  // so we are skipping 2 indexes
	   
 	  for(int i = 0; i < m; i+=2) {
		  for(int j = 0; j < n; j+=2) {
			  
			  // we are init min to Integer.MAX_VALUE because we can have a value
			  // which is less than Integer.MAX_VALUE in matrix ex : 2147483646
			  // init min to Integer.MAX_VALUE(2147483647) is best practice
			  // when we want to find min in any problem
			  int min = Integer.MAX_VALUE;
			  int indexI = -1;
			  int indexJ = -1;
			 // from the starting index we are init to k and l,
			 // and iterate the 2 x 2 matrix
			 // and find the min in that 2 x 2
			  for(int k = i; k < i+2; k++) {
				  for(int l = j; l < j+2; l++) {
					  
					  // we are finding min
					  // equals because we want to find the last occurence of min element in the matrix
					  // Eg : 1 2
				          //      1 2
					  // here last occurence will be (1 0) index
					  // so equals
 					  if(min >= matrix[k][l]) {
						  min = matrix[k][l];
						  indexI = k;
						  indexJ = l;
					  }
				  }
			  }
			  // Printing row and col of min index in 8 x 8 matrix;
			  System.out.print("["+"Row "+indexI+" "+"Col "+indexJ+"]");
			  
		  }
		  System.out.println();
	  }
   }
  
}
