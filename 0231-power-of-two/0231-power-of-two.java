class Solution {
    public boolean isPowerOfTwo(int n) {
        
        // if (n == 0){
        //     return false;
        // }

        // while (n!=1){
            
        //     if (n % 2 != 0){
        //         return false;
        //     }
        //     else{
        //         n = n/2;
        //     }
        // }

        // if (n == 1){
        //     return true;
        // }

        // return false;
        // int count = 0;
        // while (n!=0){
        //     count++;
        //     n = (n-1)&n;
        // }
        // if (count == 1 && n>0){
        //     return true;
        // }

        // return false;

        if (n == 0){
            return false;
        }

        else if ((((n-1)&n) == 0) && n>0){
            return true;
        }
        return false;
    }

    
}