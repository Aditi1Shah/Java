//Find greatest number among three user entered numbers
import java.util.*;
public class greatest1{
public static void main(String args[])
{
    System.out.println("Enter three numbers");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a>b && a>c)
    System.out.println(a + " is the greatest among all");
    else if(b>c && b>a)
    System.out.println(b + " is the greatest among all");
    else 
    System.out.println(c + " is the greatest among all");
}
}
