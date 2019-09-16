package app.allen.study.coding.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution{
    static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> complementMap = new HashMap<>();
        int result[] = new int[2];
        for(int i =0;i<nums.length;i++){
            if(complementMap.containsKey(nums[i])){
                result[0] = complementMap.get(nums[i]);
                result[1] = i;
            }else{
                complementMap.put(target-nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{1,2,3,4,8};
        int[] result = twoSum(nums, 9);
        System.out.println(Arrays.toString(result));
    }

}