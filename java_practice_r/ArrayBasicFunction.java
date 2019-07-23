import java.util.Arrays;


public class ArrayBasicFunction{
	public static void swap(int[]a,int i,int j)  //可以找到与实参同一个的数组，可以对数组的值进行修改
	{
		int  tmp;
		tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
	public static int indexOf(int[] a,int v){
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==v)
			{
				return i;
			}
		}
		return -1;
		
	}
	public static void fillArray(int[] a,int val)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=val;
		}
	}
	
	public static int[] copyOf(int[] orignal,int newlength){
	int[] newarray=new int [newlength];
	for(int i=0;i<orignal.length&&i<newlength;i++)
	{
		newarray[i]=orignal[i];
	}
	return newarray;
	}
	//数组必须是有序的
	public static int binarySearch(int[] arr,int value)
	{
		int left=0,right=arr.length-1;
		int mid;
		while(left<=right)
		{ 
	        mid=(left+right)/2;
			if(arr[mid]==value)
			{
				return mid;
			}
			else if(arr[mid]<value)
			{
				left=mid+1;
			}
			else if(arr[mid]>value)
			{
				right=mid-1;
			}
		}
		return -1;
	}
	
	
	
	
	
	
	public static void main(String[] args){
	int[] a={1,2,3,4,5};
    
    
	
	//一个函数找到一个值在数组里出现的第一个位置，返回下标，找不到返回-1
	int pos=indexOf(a,3);
	System.out.println("找数函数测试："+pos);
	
	// 二分查找某个值
	int pos1=binarySearch(a,5);
	System.out.println("二分找数函数测试："+pos1);
	
		//交换数组下标为0,3的数据
	swap(a,0,3);
	//传swap（a[0],a[3]）; 传值，是不可能对值进行改动的
	System.out.println("交换函数测试："+Arrays.toString(a));
	
	System.out.println("copyOf函数测试："+Arrays.toString(copyOf(a,10)));
	
	fillArray(a,8);
	System.out.println("填充函数测试："+Arrays.toString(a));
	
	
	
	
	}
}