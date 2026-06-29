class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
            for(int e : nums){
                int element = e;
                int count = 0;
                while(element > 0){
                    count++;
                    element = element / 10;
                }
                if(count % 2 == 0){
                    ans++;
                }
            }
            return ans;
    }
}