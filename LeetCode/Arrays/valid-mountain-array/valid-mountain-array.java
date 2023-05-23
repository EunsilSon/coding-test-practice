class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean check = false;
        int idx = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]) {
                check = true;
            } else {
                idx = i;
                break;
            }
        }

        for (int i = idx; i < arr.length-1; i++) {
            if (idx != 0 && arr[i] > arr[i+1]) {
                check =  true;
            } else {
                check = false;
                break;
            }
        }

        return check;
    }
}