class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // here we just update the values in the same array 
        // Time : O(n)
        // Space: O(1)
        int n = image.length;
        // for every row in the image
        for(int row[]: image ){
            // we flip the digits i.e the 1st is last, then 2nd is second last and vice versa, uptill the middle one is flipped
            for(int i = 0; i < (n+1)/2; ++i){
                // in the temp , store the value of row
                int temp = row[i];
                // now row will update to flipped image
                row[i] = 1 -  row[n-1-i];
                // this will update 1 to 0 and 0 to 1
                row[n - 1 - i] = 1- temp;
            }
        }
        
        return image;
    }
}








// class Solutions {
//     public int[][] flipAndInvertImage(int[][] image) {
//         int n = image.length;
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n/2; j++){
//                 int temp = image[i][j];
//                 image[i][j] = image[i][n - j - 1];
//                 image[i][n - j - 1] = temp;
//             }
//         }
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 if(image[i][j] == 1)
//                     image[i][j] -= 1;
//                 else
//                     image[i][j] += 1;
//             }
//         }
//         return image;
//     }
// }
