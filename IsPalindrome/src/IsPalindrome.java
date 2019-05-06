import java.util.Scanner;
public class IsPalindrome 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if palindrome: \n");
         int num = input.nextInt();
        System.out.println(reverse(num));
        System.out.println(isPalindrome(num));
        
    }
    public static int reverse(int number)
    {
        int i = 0; 
          while (number > 0)
           {
             int remainder = number % 10;
             i = i * 10 + remainder;
             number /= 10;
           }
         return i;
    }
    public static boolean isPalindrome(int number)
    {
        return (number == reverse(number));
    }
    
}
