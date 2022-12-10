
class Solution {
	int volumeOfTrappedRainWater(int[] heights) {
		int left = 0; 
		int right = heights.length - 1;
		int volume = 0;
		int maxLeft = 0, maxRight = 0;
		while (left <= right) {
			if (heights[left] <= heights[right]) {
				if (heights[left] >= maxLeft) {
					maxLeft = heights[left];
				} else {
					volume += maxLeft - heights[left];
				}
				left++;
			} else {
				if (heights[right] >= maxRight) {
					maxRight = heights[right];
				} else {
					volume += maxRight - heights[right];
				}
				right--;
			}
		}
		return volume;
	}
}
