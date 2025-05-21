class Solution {
    public int bs(int[] arr, int lo, int hi, int target){
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                lo=mid+1;
            }
            else if(arr[mid]>target){
                hi=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] arr, int target) {
        int n = arr.length;
        int idx = -1;

        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                idx = i;
                break;
            }
        }

        int left = bs(arr, 0, idx, target);
        int right = bs(arr, idx+1, n-1, target);

        if(left != -1) return left;
        if(right != -1) return right;

        return -1;
    }
}