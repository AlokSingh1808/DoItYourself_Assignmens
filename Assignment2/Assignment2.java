//1.Calculate the average of given array.

/*import java.util.*;

public class Assignment2{
	public static void main(String[] args) {
	    int[] a={30,40,34,46,65};
	    int Sum=0;
	    for(int i =0;i< a.length;i++){
	        Sum=Sum+ a[i];
	    }
	    System.out.println("Sum is "+ Sum);
	    System.out.println("No of element is "+a.length);
	    System.out.println("Average is "+(Sum/(a.length)));
	}
}*/


//2.Find the second largest number in the given array.

/*import java.util.*;

public class Assignment2{   
	public static void  Secondlargest(int arrlst[],int arraylength){
    
    int i; int a; int b;
    if(arraylength<2){
        System.out.println("increase no. of element");
    }
    a=b=0;
    for(i=0;i<arraylength;i++){
        if(arrlst[i]>a){
        b=a;
        a=arrlst[i];
    }
        else if(arrlst[i]>b && arrlst[i]!=a)
        b=arrlst[i];
    }
    System.out.println("Second largest No. is "+b);
}
	public static void main(String[] args) {
	    
	    int[] array={69,143,244,465,679,664,154};
	    int l=array.length;
	    Secondlargest(array,l);
	}
}*/

//3.Find the second minimum number in the given array.

/*import java.util.*;

public class Assignment2{ 
	public static void  SecondSmallest(int arrlst[],int arraylength){
    int i; int a; int b;
    if(arraylength<2){
        System.out.println("inncrease no. of element");
    }
    
    
    a=b=Integer.MAX_VALUE;;
    for(i=0;i<arraylength;i++){
        if(arrlst[i]<a){
        b=a;
        a=arrlst[i];
    }
        else if(arrlst[i]<b && arrlst[i]!=a)
        b=arrlst[i];
    }
    System.out.println("Second largest No. is "+b);
}
	public static void main(String[] args) {  
	    int[] array={69,143,244,465,679,664,154};
	    int l=array.length;
	    SecondSmallest(array,l);
	}
}*/

//4.Find the missing Number in the given array of 1 to N.

/*import java.util.*;

public class Assignment2
{
	public static void main(String[] args) {
		
		int[] arr={1, 2, 4, 5, 6};
		int n=arr.length+1;
		int sum = n * (n + 1) / 2;
		
		for(int i=0;i<arr.length;i++){
		    sum=sum-arr[i];
		    }
		System.out.println("Misssing element is "+sum);
	}
}*/

//5.Write a Java Program to find the Intersection of two arrays.

/*import java.util.*;

public class Assignment2{
	public static void main(String[] args) {	
		int[] a={1, 2, 4, 5, 6};
		int[] b={7, 8, 9,6,2};
		for(int i=0;i<arr1.length;i++){
		    for(int j=0;j<b.length;j++){
		        if(a[i]==b[j])
		        System.out.print(a[i]+",");
		    }
		}
	}
}*/

//6.Write a Java Program to find the Intersection of Two Sorted arrays.

/*import java.util.*;

public class Assignment2{
	public static void main(String[] args) {	
		int[] a={1,3,4,6,7,8};
		int[] b={1,2,3,4,5,6,7};
		int i=0; int j=0;
		while(i<a.length && j<b.length){
		    if(a[i]<b[j])
		    i++;
		    else if(a[i]>b[j])
		    j++;
		    else{
		    System.out.print(b[j++]+" ");
		    i++;
		    }
		}
	}	
}*/

//8.Write a Java Program to find the Union of Two Arrays (Sorted Arrays). 

/*import java.util.*;

public class Assignment2{
	public static void main(String[] args) {	
		int[] a={1,3,4,6,7,8};
		int[] b={1,2,3,4,5,6,7};
		int i=0,j=0;
		while(i<a.length && j<b.length){
		    if(a[i]<b[j])
		    System.out.print(a[i++]+" ");
		    
		    else if(a[i]>b[j])
		
		    System.out.print(b[j++]+" ");
		    else{
		    System.out.print(b[j++]+" ");
		    i++;
		    }
		}
		while(i<a.length)
		System.out.print(a[i++]+" ");
		while(j<b.length)
		System.out.print(b[j++]+" ");
	}
}*/

//10.Write a Java Program to Move all Zero to End of the Array. 

/*import java.util.*;

public class Assignment2{
	public static void main(String[] args) {	
		int[] a={11,32,14,0,17,28,96,0,12,0,22,65};
		int n=a.length;
		int c=0;
		 for(int i=0;i<n;i++){
		    if( a[i]!=0)
		     a[c++]=a[i];
		 }
		 while(c<n){
		 a[c]=0;
		 c++;
		 }
		 for(int i =0;i<n;i++){
		     System.out.print(a[i]+" ,");
        }
	}
}*/

//11.Write a Java Program to Move all Zeros to Start of the Array.

/*import java.util.*;

public class Assignment2{
	public static void main(String[] args) {
		int[] a={11,32,14,0,17,28,96,0,12,0,22,655};
		int n=a.length-1;
		 for(int i=a.length-1;i>=0;i--){
		    if( a[i]!=0){
		        a[n]=a[i];
		        n--;
		    }  
		 }
		 while(n>=0){
		 a[n]=0;
		 n--;
		 }
		 for(int i =0;i<a.length;i++){
		     System.out.print(a[i]+" ,");
        }
	}
}*/

//12.Write a Java Program to Reverse the given array without using additional Array.

/*import java.util.*;

public class Assignment2{
    static void reverse_arr(int a[],int n){
        int i; int x; int y;
        for(i=0;i<n/2;i++){
            y=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]= y;
        }
        System.out.print("REsverse array is ");
        for(x=0;x<n;x++){
            System.out.print(a[x]+" ");
        } 
    }
    public static void main (String[] args) {
        int[] arr={23,45,65,78,65,12,46};
        reverse_arr(arr,arr.length);
    }
}*/


//14.Write a program to find the Most Frequent Element using Sorting.

/*import java.util.*;
 
class Assignment2 { 
    static int Frequent(int arr[], int n)
    {
        Arrays.sort(arr);
        int max= 1;
        int res = arr[0];
        int curr = 1;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                curr++;
            else
            {
                if (curr > max)
                {
                    max = curr;
                    res = arr[i - 1];
                }
                curr = 1;
            }
        }
        if (curr > max)
        {
            max = curr;
            res = arr[n - 1];
        }
        return res;
    }
    public static void main (String[] args) {
        int arr[] = {10,44,45,33,22,11,75,44,64,44,32,18};
        int n = arr.length;
        System.out.println("Most frequent element is "+Frequent(arr,n));
    }
}*/

//16.Write a java program to Rotate the Given Array d times.

/*import java.util.*;

class Assignment2{    
 public static void main(String[] args) {
        int [] a = new int [] {11, 12, 13, 14, 15, 16, 17};
        int n = 3;  
        System.out.println("Given Original array: ");    
        for (int i = 0; i < a.length; i++) {     
            System.out.println(a[i] + " ");     
        }      
        for(int i = 0; i < n; i++){    
            int j;
            int lst;
            lst = a[a.length-1];    
            
            for(j = a.length-1; j > 0; j--){    
                a[j] = a[j-1];    
            }    
            a[0] = lst;    
        }   
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< a.length; i++){    
            System.out.print(a[i] + " ");    
        }    
    }    
}*/

//17.Find the pair of elements(X+Y) in the array whose sum is equal to given number Z.

/*import java.util.*;

class Assignment2{
  static boolean findpair(int a[], int size, int x) {
      for (int i = 0; i < (size - 1); i++) {
          for (int j = (i + 1); j < size; j++) {
              if (a[i] + a[j] == x) {
                  System.out.println("Pair with a given sum " + x +
                                     " is (" + a[i] + ", " + a[j] + ")"); 
                                     return true;
              }
          }
      }
      return false;
  }
  public static void main(String [] args) {
     
      int a[] = {1,2,3,-5,-7};
      int x = -2;
      int size = a.length;
      if (findpair(a, size, x)) {
          System.out.println("exists");
      }
      else {
          System.out.println("No pair exists for " + x );
      }
  }
}*/

//18.Write a java program to check Given String is Palindrome or NOT.

/*import java.util.*;

public class Assignment2{
    static boolean isPalindrome(String str)
    {
        int i = 0; int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
		String str;
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();  
        str = str.toLowerCase();
        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}*/

//20.Write a java program to Reverse a String without using in-build function.

/*import java.util.*;

public class Assignment2 {
    public int[] rev(int [] a){
        if(a == null || a.length <= 1){
            System.out.println("Invalid array.");
        }
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        return a;
    }
    public static void main(String[] args){
        Assignment2 reverse = new Assignment2();
        int[] b = {11,12,54,85,96,76,35,19,46};
        System.out.println("Array before Reversing" + Arrays.toString(b));
        System.out.println("Array after Reversing" + Arrays.toString(reverse.rev(b)));
    }
}*/



