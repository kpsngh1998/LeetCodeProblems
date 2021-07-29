class Solution {
public:
    void sortColors(vector<int>& nums) {
    
        int start = 0, end = nums.size()-1, it = 0;
        
        while(it<=end){
            
            switch(nums[it]){
                case 0:
                    swap(nums[it], nums[start]);
                    it++; start++;
                    break;
                case 1:
                    it++;
                    break;
                case 2:
                    swap(nums[it], nums[end]);
                    end--;
                    break;
            }
        }
        
    }
};