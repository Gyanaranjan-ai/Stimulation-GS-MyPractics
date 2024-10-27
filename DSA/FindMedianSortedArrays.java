package DSA;

public class FindMedianSortedArrays {
	public static int findMedianSortedArrays(int[] arr1, int[] arr2) {
		if (arr1.length == 0 && arr2.length == 0) {
			throw new IllegalArgumentException("Both arrays are empty.");
		} else if (arr1.length == 0) {
			return findMedianSingleArray(arr2);
		} else if (arr2.length == 0) {
			return findMedianSingleArray(arr1);
		}
		if (arr1.length > arr2.length) {
			return findMedianSortedArrays(arr2, arr1);
		}
		int n1 = arr1.length;//3
		int n2 = arr2.length;//4
		int low = 0;
		int high = n1;//3
		while (low <= high) {
			//find the arry1 mid
			int partition1 = (low + high) / 2; // arr1=1
			//find the arry2 mid
			int partition2 = (n1 + n2 + 1) / 2 - partition1;// arr2=3
			int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : arr1[partition1 - 1];
			int minRight1 = (partition1 == n1) ? Integer.MAX_VALUE : arr1[partition1];
			int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : arr2[partition2 - 1];
			int minRight2 = (partition2 == n2) ? Integer.MAX_VALUE : arr2[partition2];
			if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
				// Check if total number of elements is odd
				if ((n1 + n2) % 2 == 1) {
					return Math.max(maxLeft1, maxLeft2);
				} else {
					// Even case: return the average of the two middle elements
					return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2;
				}
			} else if (maxLeft1 > minRight2) {
				high = partition1 - 1;
			} else {
				low = partition1 + 1;
			}
		}
		return -1;
	} // Handle case when only one array is present

	private static int findMedianSingleArray(int[] arr) {
		int n = arr.length;
		if (n % 2 == 1) {
			return arr[n / 2];
		} else {
			return (arr[n / 2 - 1] + arr[n / 2]) / 2;
		}
	}
	public static void main(String[] args) {
		int[] nums1 = { 1, 3 ,4 ,6};
		int[] nums2 = { 2 ,5,7};
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
}
