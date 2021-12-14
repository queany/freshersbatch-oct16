package assig1.co;

public class BubbleSortMain {
	static void bubbleSort(int[]arr) {
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,7,4,0,7,14,26,25,56,11,23,15,78,47};
System.out.println("Array before sorting:");
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+ " ");
	
}
System.out.println();	
bubbleSort(arr);
System.out.println("Array after sorting:");
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+ " ");
	
}

}
}