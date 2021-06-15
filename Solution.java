
import java.util.*;


public class Solution {
   public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  int m = scan.nextInt();
	  int n = scan.nextInt();
	  int[][] matrix = new int[m][n];
	  for(int i = 0; i < m; i++) {
		  for(int j = 0; j < n; j++) {
			  matrix[i][j] = scan.nextInt();
		  }
	  }
	  for(int i = 0; i < m; i+=2) {
		  for(int j = 0; j < n; j+=2) {
			  int min = Integer.MAX_VALUE;
			  int indexI = -1;
			  int indexJ = -1;
			  //System.out.println(i+" "+j);
			  for(int k = i; k < i+2; k++) {
				  for(int l = j; l < j+2; l++) {
					  if(min >= matrix[k][l]) {
						  min = matrix[k][l];
						  indexI = k;
						  indexJ = l;
					  }
				  }
			  }
			  System.out.print("["+"Row "+indexI+" "+"Col "+indexJ+"]");
			  
		  }
		  System.out.println();
	  }
   }
  
}
