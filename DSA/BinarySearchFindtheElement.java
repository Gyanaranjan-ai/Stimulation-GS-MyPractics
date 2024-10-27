package DSA;

public class BinarySearchFindtheElement {
	public static void main(String[] args) {
		Integer x[]= {1,2,3,4,5,6,7,8,9,10};
		int target=8;
		int result = binarySeracch(x,target);
		if(result==-1) {
			System.out.println("elemntbn not found");
		}else {
			System.out.println("elment found="+ result);
		}
	}
	private static int binarySeracch(Integer[] x, int target) {
		int left=0;
		int right=x.length-1;
		while(left<=right) {
//		int mid=left+(right-left)/2;
		int mid=(left+right)/2;
		//check if the target present in the mid
		if(x[mid]==target) {
			return mid;
		}
		// if target is greater ignore the lefthalf
		if(x[mid]<target) {
			left=mid+1;
			//if smalerr then ignore the right side
		}else {
			right=mid-1;
		}
		
		}
		return -1;
	}

}
