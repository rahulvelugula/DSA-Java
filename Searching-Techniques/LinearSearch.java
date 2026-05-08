import java.util.*;
public class LinearSearch{
	static int linearSearch(int arr[],int n,int key,int index){
	
		if(index>=n){
			return -1;
		}
		
		if(arr[index]==key){
			return index;
		}
	
		return linearSearch(arr,n,key,index+1);
	}
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the length of the array:");
		int n=in.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		
		System.out.println("Enter the element we want to search:");
		int key=in.nextInt();
		
		int result=linearSearch(arr,n,key,0);
		
		if(result!=-1){
			System.out.println("The element is found at index:"+result);
		}else{
			System.out.println("Element not found!!");
		}
		
		in.close();
		
	}
}
	
