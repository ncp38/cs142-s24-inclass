public class Program2Math
{
    public static void main(String [] args) //We will discuss this more in later classes...but this is the part that Actually Runs in Java.
    {
        //Here we're declaring and initializing each of our variables
        int i = 10;
        int j = 5;
        int l = 13;

        int k = i * j;//50
        System.out.println(k);
        int n = i^2;//100

        int quotient = i / j;//2
        int remainder = i % j;//0
        System.out.println("The dividend of " + i + " and " + j + " is " + quotient + ", and the remainder is " + remainder + ".");

        quotient = l/j;//integer division!!!
        remainder = l%j;

        System.out.println("The dividend of " + l + " divided by " + j + " is " + quotient + ", and the remainder is " + remainder + ".");
        System.out.println("Integer division can yield some...unexpected results.  Exercise care!!");
    }
}
