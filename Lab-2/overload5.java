import java.util.*;
class test{
    int a,b;
    float c,d;
    void multiplication(int r)
    {
        a=r;
        int v = a*10;
        System.out.println("Multiplication method with one argument");
        System.out.println(v);
    }
    void multiplication(int r, int k)
    {
        a=r;
        b=k;
        System.out.println("Multiplication method with two integer type arguments");
        System.out.println(a*b);
    }
    void multiplication(float y,int u)
    {
        c=y;
        a=u;
        System.out.println("Multiplication method with one integer type argument and one float type argument");
        System.out.println(a*c);
    }
}
public class overload5{
    public static void main(String args[]){
        System.out.println("Enter an integer to multiply with 10");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        test ob1 = new test();
        ob1.multiplication(num);
        System.out.println("Enter two integers to multiply");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        test ob2 = new test();
        ob2.multiplication(num2,num1);
        System.out.println("Enter a integer and a float number to multiply");
        int num3 = sc.nextInt();
        float num4 = sc.nextFloat();
        test ob3 = new test();
        ob1.multiplication(num4,num3);

    }
}