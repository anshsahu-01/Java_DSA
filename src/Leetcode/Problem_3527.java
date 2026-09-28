package LeetCode;

class Problem_3527 {
    public long[] resultArray(int[] arr, int k) {

        int n = arr.length;
        long[] result = new long[k];
        long[] count = new long[k];

        for(int i = 0; i < n; i++){
            long[] newCount = new long[k];
            int remainder = arr[i] % k;
            newCount[remainder]++;
            for(int j = 0; j < k; j++){
                if(count[j] > 0){
                    int newRemainder = (j * (arr[i] % k)) % k;
                    newCount[newRemainder] += count[j];
                }
            }
            for(int j = 0; j < k; j++){
                result[j] += newCount[j];
            }
            count = newCount;
        }
        return result;
    }
}