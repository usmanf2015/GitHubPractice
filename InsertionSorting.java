//Insertion Sort(Ascending order)
public class InsertionSorting{
	public static void main(String[]args){
		int[] Array= {2,5,1,3,9,4,8,7,10,6};//User's Array
		int Size=Array.length;
		System.out.println("UnSorted Array");
		for(int i=0;i<Size;i++){
			System.out.println(Array[i]);
		}
		//if size is 1, then list is sorted
		if(Size>1){
			for(int i=1;i<Size;i++){
				int temp=Array[i];
				for(int j=i-1;j>=0;j--){
					if(temp<Array[j]){
						Array[j+1]=Array[j];
						if(j==0){
							Array[j]=temp;
							break;
						}
					}
					else{
						Array[j+1]=temp;
						break;
					}
				}
			}
		}
		System.out.println("Sorted Array");
		for(int i=0;i<Size;i++){
			System.out.println(Array[i]);
		}
	}
}
 