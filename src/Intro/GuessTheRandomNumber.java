public class GuessTheRandomNumber
{
    public static void main(String[] args)
    {
        //Between 0 and 1 non-inclusive
        double randomNumber = Math.random();

        //Pick a number between 1 and 10
        int randomInt = (int) Math.random()*10+1;//The +1 changes the result ranging from 0 to 9 to 1 to 10.

        //The rest of the program is left for us to work on in class!
    }
}
