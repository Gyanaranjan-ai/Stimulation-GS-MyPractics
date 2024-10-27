package gs;

public class A {
	public static void main(String[] args) {
//	        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; // Example input for the array heights
		int[] height = { 3, 0, 2, 4 }; // Example input to represent heights of blocks

		System.out.println("Total water trapped: " + trap(height)); // Output the result of trapped water by calling the
																	// trap method
	}

	private static int trap(int[] height) { // Define a method to calculate the trapped water

		int n = height.length; // Get the length of the height array

		// Step 1: Create an array 'left' that stores the maximum height to the left of
		// each element
		int[] left = new int[n]; // Create an array to store maximum heights from the left side
		left[0] = height[0]; // Initialize the first element of 'left' array with the first height
		for (int i = 1; i < n; i++) { // Loop through the array from the second element
			left[i] = Math.max(height[i], left[i - 1]); // Store the maximum height seen from the left side
		}

		// Step 2: Create an array 'right' that stores the maximum height to the right
		// of each element
		int[] right = new int[n]; // Create an array to store maximum heights from the right side
		right[n - 1] = height[n - 1]; // Initialize the last element of 'right' array with the last height
		for (int i = n - 2; i >= 0; i--) { // Loop through the array from the second-last element to the first
			right[i] = Math.max(height[i], right[i + 1]); // Store the maximum height seen from the right side
		}

		// Step 3: Calculate the trapped water
		int water = 0; // Variable to accumulate the total trapped water
		for (int i = 0; i < n; i++) { // Loop through all elements of the height array
			water += (Math.min(left[i], right[i])) - height[i]; // Water trapped is determined by the difference between
																// the minimum of the left and right max heights and the
																// current height
		}

		return water; // Return the total amount of water trapped
	}
}
