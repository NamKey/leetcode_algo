import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
			Map<Integer, Integer> numMap = new HashMap<>();

			for (int i = 0; i < nums1.length; i++) {
				numMap.putIfAbsent(nums1[i], 0);
				numMap.computeIfPresent(nums1[i], (k,v) -> v + 1);
			}

			List<Integer> list = new ArrayList<>();
			for (int i : nums2) {
				numMap.computeIfPresent(i, (k, v) -> v - 1);
				if (numMap.get(i) != null && numMap.get(i) >= 0) {
					list.add(i);
				}
			}

			return list.stream().mapToInt(i -> i).toArray();
		}
}