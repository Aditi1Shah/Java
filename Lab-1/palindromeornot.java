//WAP a program to check the given number is palindrome or not
import java.util.*;
class palindromeornot{
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter a number to check palindrome or not");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int temp = num;
        int rem=0,sum=0;
        while(num > 0)
        {
           rem = num%10;        //taking remainder
           sum = (sum*10)+rem;  //storing reverse of the number in sum
           num = num/10;        //decreasing number of bits in number.
        }
        if(temp == sum)
        System.out.println("Palindrome number");
        else
        System.out.println("Not a Palindrome number");
    }  
}