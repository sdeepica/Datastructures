package Learn;
import java.util.*;
public class InsertionOfElement {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int pos,element;
		int[] arr=new int[10];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the position to insert element");
		pos=s.nextInt();
		System.out.println("Enter the element to insert");
		element=s.nextInt();
		for(int i=(n-1);i>=(pos-1);i--){
			arr[i+1]=arr[i];
		}
		arr[pos-1]=element;
		System.out.println("After inserting the element");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[n]);
		s.close();
	}

}
