package 搜索插入位置0407;

//我的方法
// class Solution {
// public int search(int[] nums, int target) {
	
// 	int left = 0;
// 	int right = nums.length-1;
// 	int position= 0;
// 	while(left<=right) {
// 		int mid = left + ((right - left) >> 1);
// 		if(target<nums[mid]) {
// 			right=mid-1;
// 		}
// 		else if(target>nums[mid]) {
// 			left=mid+1;
// 		}
// 		else {
// 			return mid;
// 		}
// 		if(left>right) {
// 			if(nums[mid]>target) {
// 			position = mid;
// 			}
// 			else if(nums[mid]<target) {
// 				position = mid+1;
// 				}
// 		}
// 	}
// 	return position;
// }
// }

//简单方法
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;

        // 定义target在左闭右闭的区间，[low, high]
        int low = 0;
        int high = n - 1;

        while (low <= high) { // 当low==high，区间[low, high]依然有效
            int mid = low + (high - low) / 2; // 防止溢出
            if (nums[mid] > target) {
                high = mid - 1; // target 在左区间，所以[low, mid - 1]
            } else if (nums[mid] < target) {
                low = mid + 1; // target 在右区间，所以[mid + 1, high]
            } else {
                // 1. 目标值等于数组中某一个元素  return mid;
                return mid;
            }
        }
        // 2.目标值在数组所有元素之前 3.目标值插入数组中 4.目标值在数组所有元素之后 return right + 1;（通过画图理解right+1）
        return high + 1;
    }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= new int[] {10,14,19,26};
		int target = 8;
		Solution s = new Solution();
		int n = s.search(nums,target);
		System.out.println(n);
	}

}
