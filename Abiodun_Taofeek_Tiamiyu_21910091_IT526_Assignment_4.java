
//STUDENT’S NUMBER:ABIODUN TAOFEEK TIAMIYU
//STUDENT’S NUMBER:21910091
//COURSE CODE:IT526

//COURSE TITLE:OPERATING SYSTEM &NETWORK SECURITY
//

import java.util.Scanner;

public class PrimeCheck
{
   public static void main(String args[])
   {		
	int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("ABIODUN TAOFEEK TIAMIYU:");
	System.out.println("21910091:");
	System.out.println("CMPE526:");
	System.out.println("OPERATING SYSTEM AND NETWORK SECURITY:");
	System.out.println("ASSIGNMENT IV:");
	System.out.println("Enter any number:");
	//capture the input in an integer
	int num=scan.nextInt();
        scan.close();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is a Prime Number and the factors are:" + num);
	else
	   System.out.println(num + " is a composite factor and the factors are:" + num);
   }
}