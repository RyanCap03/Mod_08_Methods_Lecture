import java.util.Scanner;
public class Main
{
    // class variables go here and ar visible to the methods below main

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //int favNum = SafeInput.getRangedInt(in, "Enter your fav num ", 1, 100);
        //int anyInt = getInt(in,"Enter an int");
        //double salary = getDouble(in, "Enter your salary");
        //System.out.println("You said your salary was: " + salary);

        //double tax = getRangedDouble(in,"Enter your tax ", 100, 10000);
        //System.out.println("You said your tax was: " + tax);

        //String msg = getNonZeroLength(in, "Enter any string other than zero length: ");
        //System.out.println("Your message is: " + msg);

        //String ssn = SafeInput.getRegExString(in, "enter your SSN ###-##-####", "\\d{3}-\\d{2}-\\d{4}");

        boolean isRaining = SafeInput.getYNConfirm(in,"Is it raining [y/n]: " );
        System.out.println("It is raining");

      /* sayHello();
        System.out.println(" \n spacer \n");
        sayHello(10);
        sayMsg("Life sucks!", 35);

        int myFav = getRangedInt(console, "enter your fav int ", 1, 100 );
        int myFavDoubled = doubleIt(myFav);
        System.out.println("Doubled is: " + myFavDoubled);

        int year = getInt(console, "Enter an int");
        System.out.println("You daid your birth year is: " + year);
        */


    }
    //user defined mehods go here and are static
/*
    public static void sayHello()
    {
        System.out.println("Hello");
    } //static of it doesn't belong to an object

    public static void sayHello(int times)
    {
        for(int rep=0; rep < times; rep++)
            System.out.println("Hello");

    }

    public static void sayMsg(String Msg, int times)
    {
        for(int rep=0; rep < times; rep++)
            System.out.println(Msg);

    }

    public static int doubleIt(int toBeDoubled)
    {
        int doubledVal = toBeDoubled * 2;

        return doubledVal;
    }
*/
    /**
     * Get an integer value within a specified range of low-high
     *
     * @param pipe Scanner to use for console input
     * @param prompt String that tells user what to input
     * @param low low value for the range [low to high]
     * @param high high value if the range
     * @return an int value within the low - high range
     */
        public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = low - 1;
        String trash = "";
        boolean done = false;

        do
        {
            //prompt num [1-10]
            System.out.print(prompt + "[ " + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    System.out.println("\nYour Fav Num is: " + retVal);
                    done = true;
                } else {
                    System.out.println("You said your fav num is " + retVal + " but that is out of range! [" + low + " - " + high + "]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println(trash + " Is not a valid number");
            }

        }
        while(!done);

        return retVal;
    }
//=============================================================================================================

    /**
     * Use scanner to get an int from the console with no constraints
     *
     * @param pipe Scanner to ue fir cinsile input
     * @param prompt String prompt to tell the user what to input
     * @return an Int value
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            //prompt num [1-10]
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println(trash + " Is not a valid number");
            }

        }
        while(!done);

        return retVal;
    }
//=======================================================================================

    /**
     * Use scanner to get a double from the console with no constraints
     *
     * @param pipe Scanner to ue fir cinsile input
     * @param prompt String prompt to tell the user what to input
     * @return a double value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            //prompt num [1-10]
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println(trash + "You must enter a double not: " + trash);
            }

        }
        while(!done);

        return retVal;
    }
//======================================================================================================================
    /**
     * Get a double value within a specified range of low-high
     *
     * @param in Scanner to use for console input
     * @param prompt String that tells user what to input
     * @param low low value for the range [low to high]
     * @param high high value if the range
     * @return a double value within the low - high range
     */
    public static int getRangedDouble(Scanner in, String prompt, double low, double high)
    {
        double retVal = low - 1;
        String trash = "";
        boolean done = false;

        do
        {
            //prompt num [1-10]
            System.out.print(prompt + "[ " + low + " - " + high + "]: ");
            if (in.hasNextDouble())
            {
                retVal = in.nextDouble();
                in.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    //System.out.println("\nYour Fav Num is: " + retVal);
                    done = true;
                }
                else
                {
                    System.out.println("You said your fav num is " + retVal + " but that is out of range! [" + low + " - " + high + "]");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " Is not a valid number");
            }

        }
        while(!done);

        return (int) retVal;
    }
//======================================================================================================================

    /**
     * get an arbitrary String of at least one character in length
     *
     * @param pipe Scanner to use for input
     * @param prompt Prompt msg for use about what to input
     * @return a String entered with at least 1 character
     */
    public static String getNonZeroLength(Scanner pipe, String prompt)
    {

        String retVal = "";
        boolean done = false;

            do
            {
                //prompt num [1-10]
                System.out.print(prompt + ": ");
                retVal = pipe.nextLine();
                if(retVal.length() > 0) // if the string has at least 1 character in it
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter at least 1 character: ");
                }

            }
            while(!done);

            return retVal;

    }

//======================================================================================================================
//final one in class thurs



}