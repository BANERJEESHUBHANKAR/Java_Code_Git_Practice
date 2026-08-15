package javaSessionMay24;
import java.util.Arrays;
import java.util.HashMap;


class Main {
 public static void main(String[] args) {
     System.out.println("Start small. Ship something.");
     
     int arr[]={10,20,80,30,40,-50};
     System.out.println(Arrays.toString(revArray(arr)));
     maxMin(arr);
     
     System.out.println(Arrays.toString(bubbleSort(arr)));
     
     System.out.println(Arrays.toString(selectionShort(arr)));
     
     System.out.println(binarySearch(arr,40));
 }
 
 public static int[] revArray(int a[])
 {
     if(a.length==0)
     {
         return a;
     }
     int l=0;
     int r=a.length-1;
     int temp;
     while(l<r)
     {
         temp=a[l];
         a[l]=a[r];
         a[r]=temp;
         l++;
         r--;
     }
     return a;
 }
 
 public static void maxMin(int a[])
 {
     if(a==null || a.length==0)
     {
         throw new IllegalArgumentException("Array sent is NULL");
     }
     int max=a[0];
     int min=a[0];
     for(int i=0;i<a.length;i++)
     {
         if(a[i]>max)
         {
             max=a[i];
         }
         if(a[i]<min)
         {
             min=a[i];
         }
     }
     System.out.println("Max Number:- " + max);
     System.out.println("Min Number:- " + min);
 }
 
 public static int[] bubbleSort(int a[])
 {
     if(a==null || a.length==0)
     {
         throw new IllegalArgumentException("Array is Null");
     }
     
     int temp;
     for(int i=0;i<a.length;i++)
     {
    	 boolean swap=false;
         for(int j=0;j<(a.length-1)-i;j++)
         {
             if(a[j]>a[j+1])
             {
                 temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
                 swap=true;
             }
         }
         if(!swap)
         {
        	 break;
         }
     }
     return a;
 }
 
 public static int[] selectionShort(int a[])
 {
	 if(a==null || a.length==0)
	 {
		 throw new IllegalArgumentException("NULL or Empty Array");
	 }
	 
	 int maxindex=0;
	 int temp;
	 for(int i=0;i<a.length;i++)
	 {
		 maxindex=i;
		 
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[maxindex]>a[j])
			 {
				 maxindex=j;
			 }
		 }
		 if(maxindex!=i)
		 {
             temp=a[i];
             a[i]=a[maxindex];
             a[maxindex]=temp;
		 }
	 }
	 
	 return a;
 }
 
 public static int binarySearch(int a[],int target)
 {
	 int l=0;
	 int h=(a.length)-1;
	 
	 Arrays.sort(a);
	 
	 if(a==null || a.length==0)
	 {
		 throw new IllegalArgumentException("NULL or Empty Array");
	 }	 
	 while(l<=h)
	 {
		 int mid=(l+h)/2;
		 if(a[mid]==target)
		 {
			 return mid;
		 }
		 else if(a[mid]>target)
		 {
			 h=mid-1;
		 }
		 else
		 {
			 l=mid+1;
		 }
	 }
	 return -1;
 }
 
 public static boolean stringAnigram(String s, String s2)
 {
	 if(s==null || s.isEmpty())
	 {
		 throw new IllegalArgumentException();
	 }
	 
	 if(s.trim().toLowerCase().length()!=s2.trim().toLowerCase().length())
	 {
		 return false;
	 }
	 
	 HashMap<Character,Integer> hm=new HashMap<>();
	 
	 for(int i=0;i<s.length();i++)
	 {
		 char ch=s.charAt(i);
		 hm.put(ch, hm.getOrDefault(ch, 0)+1);
	 }
	 
	 for(int j=0;j<s2.length();j++)
	 {
		 char ch=s2.charAt(j);
		 if(!hm.containsKey(ch))
		 {
			 return false;
		 }
		 
		 hm.put(ch,hm.get(ch)-1);
		 
		 if(hm.get(ch)==0)
		 {
			 hm.remove(ch);
		 }
	 }
	 
	 return hm.isEmpty();
	 
 }

}