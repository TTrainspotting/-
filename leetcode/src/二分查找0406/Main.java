package 二分查找0406;
//法一：左闭右闭区间
//class Solution {
//    public int search(int[] nums, int target) {
//    	if (target < nums[0] || target > nums[nums.length - 1]) {
//            return -1;
//        }
//    	int left = 0;
//    	int right = nums.length-1;
//    	while(left<=right) {
//    		int mid = left + ((right - left) >> 1);
//    		if(target<nums[mid]) {
//    			right=mid-1;
//    		}
//    		else if(target>nums[mid]) {
//    			left=mid+1;
//    		}
//    		else {
//    			return mid;
//    		}
//    	}
//    	return -1;
//    }
//}

//法二：左闭右开区间
class Solution {
    public int search(int[] nums, int target) {
    	int left = 0;
    	int right = nums.length;
    	while(left<right) {
    		int mid = left + ((right - left) >> 1);
    		if(nums[mid]>target) {
    			right = mid;
    		}
    		else if(nums[mid]<target) {
    			left = mid+1;
    		}
    		else {
    			return mid;
    		}
    		
    	}
    	return -1;
    }
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= new int[] {5};
		int target = 5;
		Solution s = new Solution();
		int n = s.search(nums,target);
		System.out.println(n);
	}

}
