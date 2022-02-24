
//1.Check the given number is EVEN or ODD.

/*import java.util.*;

class Assignment1{
	public static void main (String args[]){
		//System.out.println("Hello");
		int i;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		
		if (i%2 == 0){
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
}*/

//2.Write a Java Program to find the Factorial of given number.

/*import java.util.*;

class Assignment1{
	public static void main (String args[]){
		int n; int i ; int m = 1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i =1; i<= n; i++){
			m=m*i;
		}
		System.out.println("Factorial is" +m);
	}
}*/

//3.Find the Factorial of a number using Recursion.

/*import java.util.*;

class Assignment1{
	public static void main (String args[]){
		int n;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = fun(n);
		System.out.println("Factorial is :" +m);
	}
	static int fun(int n){
		if(n==1){
			return (1);
		}
		else
			return (n*fun(n-1));
	}
}*/

//4.Swap two numbers without using third variable approach 1.

/*import java.util.*;

class Assignment1{
	public static void main (String args[]){
		int x;
		int y;
		System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);    
         x = sc.nextInt();  
         y = sc.nextInt();  
        System.out.println("before swapping"+x+" & "+ y);  
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After Swapping"+x+" & "+y);
	}
}*/

//5.Swap two numbers without using third variable approach 2. 

/*import java.util.*;

public class Assignment1 {
    
    public static void main(String[] args){
		int a; int b;
		System.out.println("Emter Two Numbers: ");
        Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
         b = sc.nextInt();
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After Swapping " +a + " & " +b );

    }
} */

//6.Swap two numbers without using third variable approach 3. 

/*import java.util.*;

public class Assignment1 {
    public static void main(String[] args){
		int a; int b;
		System.out.println("Emter Two Numbers: ");
        Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
         b = sc.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping a = " +a+ " & b = " +b);
    }
}*/

//7.How to check the given number is Positive or Negative in Java? 

/*import java.util.*;

class Assignment1 {
    public static void main(String[] args) {
        int a;
		 System.out.println("enter the number:"); 
        Scanner sc = new Scanner(System.in);
		    a = sc.nextInt();
       
    if(a>0){
    System.out.println("Number  is positive");
    }
    else{
    System.out.println("Number is negative");
    }
    }
}*/

//8.Write a Java Program to find whether given number is Leap year or NOT? 

/*import java.util.*;

class Assignment1 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:"); 
    a = sc.nextInt();
    
    if(a%4==0){
    System.out.println("Number is a LEAP year");
    }
    else{
    System.out.println("Number is not a LEAP year");
    }
    }
}/*

//9.Write a Java Program to Print 1 To 10 Without Using Loop. 

/*public class Assignment1 {
	public static void print(int n) {
		if (n <= 10) {
			System.out.println(n);
			print(n + 1);
		}
	}
	public static void main(String[] args) {
		print(1);

	}

}*/

//10.Write a Java Program to print the digits of a Given Number. 

/*import java.util.*;

public class Assignment1{
    public static void main(String[] args)
    {
		int n; int rem = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n >0) {
            rem = n % 10;
            System.out.println(rem);
            n = n / 10;
        }
    }
}*/

//11.Write a Java Program to print all the Factors of the Given number. 

/*import java.util.*;

class Assignment1 {
    public static void main(String[] args) {
       int n;
	Scanner sc = new Scanner(System.in);
	 n = sc.nextInt();
	System.out.print("Enter your no: ");
		System.out.print("Factors of " + n + " are: ");

	 
		for (int i = 1; i <= n; ++i) {
			
		  if (n % i == 0) {
			System.out.print(i + " ");
		  }
		}
	}
}*/


//12.Write a Java Program to find sum of the digits of a given number. 

/*import java.util.*;

class Assignment1 {
    public static void main(String[] args) {
       int i , rem , sum=0;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the no: ");
      i = sc.nextInt();
      while(i>0){
          rem=i%10;
          sum=sum+rem;
          i=i/10;
      }
        System.out.println("sum of digits is :"+ sum); 
    }
}*/

//13.Write a Java Program to find the smallest of 3 numbers (a,b,c) without using < or > symbol? 

/*import java.util.*;
  
public class Assignment1  
{  
public static void main(String[] args){ 
	int a, b, c, smallest, temp; 
	Scanner sc = new Scanner(System.in);  
	System.out.println("Enter the first number:");  
	a = sc.nextInt();  
	System.out.println("Enter the second number:");  
	b = sc.nextInt();  
	System.out.println("Enter the third number:");  
	c = sc.nextInt();  
	temp=a<b?a:b; 
	smallest=c<temp?c:temp;  
	System.out.println("Smallest number is: "+smallest);  
}  
} */

//15.Write a java program to Reverse a given number. 

/*import java.util.*;
class Assignment1
{
  public static void main(String args[]){
    int n; int rev = 0;

    System.out.println("Enter an integer to reverse:");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    while(n != 0)
    {
      rev = rev * 10;
      rev = rev + n%10;
      n = n/10;
    }

    System.out.println("Reverse of the number is " + rev);
  }
}*/


//16.Write a Java Program to find GCD of two given numbers.

/*import java.util.*;

public class Assignment1 {
        public static void main(String[] args){
			int a; int b;
            Scanner sc = new Scanner(System.in);
             a = sc.nextInt();
             b = sc.nextInt();
            int gcd = 1;

        for(int i = 1;i<=a && i<=b;i++)
        {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }

        }
        System.out.print("GCD of "+a+ " & "+b+" is "+gcd);
        }
}*/
 
//17.Write a java program to LCM of TWO given number. 

/*import java.util.*;

public class Assignment1 {
    public static void main(String[] args){
			int a; int b;
            Scanner sc = new Scanner(System.in);
             a = sc.nextInt();
             b = sc.nextInt();
            int c = 1;
        for(int i = 1;i<=a && i<=b;i++)
        {
            if (a % i == 0 && b % i == 0) {
                c = i;
            }
        }
        int LCM = (a * b) / c;
        System.out.println("LCM of "+a+" & "+b+ " is "+LCM);
        }
}*/

//19.Check whether the Given Number is a Palindrome or NOT. 

/*import java.util.*;

class Assignment1 {
    public static void main(String[] args) {
        int r,sum=0,temp;   
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
      int n = sc.nextInt();
  temp=n;    
  while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("Number is Palindrome ");    
  else    
   System.out.println(" Number is not Palindrome");    
    }
}*/

//20.Write a Java Program to print all the Prime Factors of the Given Number.

/*import java.util.*;

public class Assignment1 {
   public static void main(String args[]){
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      n = sc.nextInt();
     
      for(int i = 2; i< n; i++) {
         while(n%i == 0) {
            System.out.println(i+" ");
            n = n/i;
         }
      }
      if(n >2) {
         System.out.println(n);
      }
   }
}*/













