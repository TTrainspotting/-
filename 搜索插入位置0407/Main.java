package 搜索插入位置0407;

class Solution {
public int search(int[] nums, int target) {
	
	int left = 0;
	int right = nums.length-1;
	int position= 0;
	while(left<=right) {
		int mid = left + ((right - left) >> 1);
		if(target<nums[mid]) {
			right=mid-1;
		}
		else if(target>nums[mid]) {
			left=mid+1;
		}
		else {
			return mid;
		}
		if(left>right) {
			if(nums[mid]>target) {
			position = mid;
			}
			else if(nums[mid]<target) {
				position = mid+1;
				}
		}
	}
	return position;
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
