package ex001;
//import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a array with randomly order.
		int arr[] ={63,12,34,5,123,3,1,15};
		
		//bubble sort
		//create the object of BubbleSort Class.
		BubbleSort sorter = new BubbleSort();
		
		//call the bubblesort to sort array.
		sorter.sort(arr);
		sorter.showArray(arr);
	}
	/*
	 *bubble sort function
	 */
	public void sort(int[] array){
		for(int i = 1;i< array.length;i++){
			for(int j = 0;j< array.length-i;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}
			}
		}
	}
	
	/*
	 * display the elements of array.
	 */
	public void showArray(int[] array){
		for(int i = 0; i< array.length; i++){
			System.out.println("The array"+array[i]);
		}
	}
}