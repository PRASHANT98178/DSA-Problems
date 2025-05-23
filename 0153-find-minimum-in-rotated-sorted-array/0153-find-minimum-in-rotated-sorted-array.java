class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int lo=0;
        int hi=n-1;

        while(lo<hi){
            int mid  = lo+(hi-lo)/2;
            if(arr[mid] > arr[n-1]) lo = mid+1;
            else  hi=mid;
        }
        return arr[lo];
    }
}