//WAP to know the grade of marks enetred by the student using if else.
import java.util.*;
class grade_mark{
    public static void main(String[] args)
    {
        float marks;
        System.out.println("Please enter your marks to know your grade");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextFloat();             // to take user input
        System.out.println("Your Marks: " + marks);
        if((90<=marks) && (marks<=100))
         System.out.println("O Grade");

        else if((80<=marks) && (marks<=90))
         System.out.println("E Grade");

        else if((70<=marks) && (marks<=80))
         System.out.println("A Grade");

        else if((60<=marks) && (marks<=70))
         System.out.println("B Grade");

        else if((50<=marks) && (marks<=60))
         System.out.println("C Grade");

        else if((40<=marks) && (marks<=50))
         System.out.println("D Grade");

        else
         System.out.print("You failed");
    }
}