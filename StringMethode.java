

public class StringMethode {

	public static void main(String[] args) {
		int [] arr= {12,33,44,4,88,1244,5577};
		int l=arr.length;
		int a= Math.floorDiv(arr.length, 2);
		int temp;
		for(int i=0;i<=a;i++) {
			temp=arr[i];
			arr[i]=arr[l-1-i];
			arr[l-1-i]=temp;
		}
		for(int element:arr) {
			System.out.print(element+"  ");
		}
		
		
}
}