//WAP a program in java to print the result of  Bitwise AND,OR and XOR operation on two integers.
import java.util.*;
class andorxor{
    public static void main(String[] args)
    {
    int num1=12;
    int num2=25;
    
    System.out.println("AND operation :" +(num1 & num2));  // 12:- 01100, 25:- 11001, 
                                                    //if 1 and 0 = 0(false), if 1&1 =1(true),if  0&0 = 0 
                                                                        //       11001
                                                                        //       01100
                                                                       //       01000= 8 in decimal
    System.out.println("OR operation :" +(num1 | num2));//if (0|0=0) else 1 in all cases
                                                                        //       11001
                                                                        //       01100
                                                                        //       11101= 29 in decimal
    System.out.println("XOR operation :" +(num1 ^ num2)); // if 1^1 or 0^0 = 0, if 1^0 or 0^1=1
                                                                         // 11001
                                                                        //  01100
                                                                        //  10101 = 21 in decimal
    }
}
