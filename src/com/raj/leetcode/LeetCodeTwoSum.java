package com.raj.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeTwoSum {
	public static void main(String[] args) {
		int arr[] = {3,2,5,4,5,8};
		int target = 6;
		int[] finalAnswer=twoSum(arr, target);
		System.out.println("Brute Force:" + finalAnswer[0]+","+finalAnswer[1]);
		int[] finalAnswerNew=twoSum1(arr, target);
		System.out.println("Usingh Map:" + finalAnswerNew[0]+","+finalAnswer[1]);
	}
	//Brute Force Way
	public static int[] twoSum(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {0,0};
	}
	public static int[] twoSum1(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int nextPair = target-nums[i];	
			if(map.containsKey(nextPair)) {
				return new int[] {map.get(nextPair),i};
			}
			map.put(nums[i],i);
		}
		return new int[] {0,0};
	}
}


/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109

 */
