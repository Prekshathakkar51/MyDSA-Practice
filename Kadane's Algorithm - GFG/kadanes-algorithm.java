//{ Driver Code Starts
import java.io.*;

import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        
        long sum = 0;
        long maxi =  Integer.MIN_VALUE;
        
        for (int i = 0; i<n; i++){
            sum = sum + arr[i];
            maxi = Math.max(maxi,sum);
            if(sum<0){
                sum = 0;
            }
            
        }
        
        return maxi;
        
        // int sum = arr[0];
        // int maxi = arr[0];
        
        // for (int i = 1; i<n; i++){
        //     sum = Math.max(arr[i], sum + arr[i]);
        //     maxi = Math.max(maxi,sum);
        // }
        
        // return maxi;
        
        // int max_so_far = arr[0];
        // int curr_max = arr[0];
        
        // for (int i = 1; i < n; i++){
        //     curr_max = Math.max(arr[i], curr_max + arr[i]);
        //     max_so_far = Math.max(max_so_far, curr_max);
        // }
        
        // return max_so_far;
    }
    
}

