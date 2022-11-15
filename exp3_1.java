import java.util.Scanner;

public class exp3_1{
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.println("Size of Arr1 : ");
		n = input.nextInt();
		int[] arr1 = getArr(n);
		printArr(arr1);
		
		System.out.println("Size of Arr2 : ");
		n = input.nextInt();
		int[] arr2 = getArr(n);
		printArr(arr2);
		
		
		System.out.println("Merged Arr : ");
		int[] mergedArr = getMergedArr(arr1, arr2);
		printArr(mergedArr);
		
		sortArr(mergedArr);
		System.out.println("After Sorintg Merged Arr : ");
		printArr(mergedArr);
	}
	
	public static int[] getArr(int n){
		Scanner input = new Scanner(System.in);
		int[] a = new int[n];
		
		System.out.println("Enter "+n+" elements one by one :");
		for(int i=0; i<n; i++)
			a[i] = input.nextInt();
		
		return a;
	}
	
	public static int[] getMergedArr(int[] a1, int[] a2){
		int n = a1.length;
		int m = a2.length;
		int[] mergedArr = new int[n + m];
		
		int i=0;
		while(i<n){
			mergedArr[i] = a1[i];
			i++;
		}
		
		i=0;
		while(i<m){
			mergedArr[i+n] = a2[i];
			i++;
		}
		
		return mergedArr;
	}
	
	public static void sortArr(int[] a){
		int n = a.length;
		for(int i=0; i<n; i++)
			for(int j=i+1; j<n; j++)
				if(a[i] > a[j]){
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
	}
	
	public static void printArr(int[] a){
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
};