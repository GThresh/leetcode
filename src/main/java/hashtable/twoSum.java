package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ClassName: twoSum
 * Description: 两数之和
 * @author G-thresh
 * Date: 2019/11/4 19:01
 * Version: v1.0
 */
public class twoSum {

    public static void main(String[] args) {
        System.out.println("Please set array size:");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Please set value for array:");
            nums[i] = in.nextInt();
        }
        System.out.println("Now, set target value:");
        int target = in.nextInt();
        System.out.println("You got result:");
        System.out.println("1.gently: " + Arrays.toString(twoSum(nums,target)));
        System.out.println("2.violent: "+ Arrays.toString(violentCracking(nums,target)));
    }

    //暴力破解
    public static int[] violentCracking(int[] nums, int target){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]==target-nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No solution!");
    }
    // 🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎🐎
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No solutiton!");
    }

}
