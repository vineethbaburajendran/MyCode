package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int nums1[]= {3,2,11,4,6,7};
		int nums2[]= {1,2,8,4,9,7};
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i]==nums2[j]) {
					System.out.println(+nums1[i]);
					
				}
			}
		}

	}

}
