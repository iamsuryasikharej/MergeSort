package dsa.mergesort;

public class MergeSort {
	public static int[] sort(int[]a, int low,int high)
	{
		if(low==high) {
			return a;
		}
		int mid=(low+high)/2;
		sort(a,low,mid);//50 low=1
		sort(a,mid+1,high);//20 high=2
		int answer[]=merge(a,low,mid,high);
		for(int i=0;i<answer.length;i++)
		{
			if(low<=high)
			{
				a[low]=answer[i];
				low++;
			}
		}
		return a;
		
		
	}
	public static void main(String[] args) {
		int arr[]=new int[] {100,99,98,50,49};
		int arr1[]=sort(arr,0,arr.length-1);//start mid high  
		System.out.println(arr1);
		for(int temp:arr1)
			System.err.println(temp);
	}
	private static int[] merge(int[] a, int low, int mid, int high) {
		System.out.println("low"+low+"mid"+mid+"high"+high);
		int pos=0;
		int i=low;
		int j=mid+1;
		int solution[]=new int[low+high+1];
		while(i<=mid && j<=high )
		{
			if(a[i]>a[j])
			{
				System.out.println("----");
				System.out.println(j+"j");
				System.out.println(i+"i");
				System.out.println("----");
				solution[pos]=a[j];
				pos++;
				j++;
				

//				if(j>high && i<=mid)
//				{
//					for(int l=i;l<=mid;l++)
//					{
//						solution[pos]=a[l];
//						pos++;
//					}
//				}
				
			}
			else
			{System.out.println("--2--");
			System.out.println(j+"j");
			System.out.println(i+"i");
			System.out.println("--2--");
				solution[pos]=a[i];
				i++;
				pos++;
				
//				if(i>=mid)
//				{
//					for(int l=j;l<=high;l++)
//					{
//						solution[pos]=a[l];
//						pos++;
//					}
//				}
			}
		}
		System.out.println("final"+i);
		System.out.println("final"+j);
		System.out.println(pos+"pos");
		for(;i<=mid;i++)
		{
			solution[pos]=a[i];
			pos++;
		}
		for(;j<=high;j++)
		{
			solution[pos]=a[j];
			pos++;
		}
		return solution;
		
	}

}
