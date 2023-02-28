public class BirthMonth {
    public static void main(String[] args)
    {
        System.out.println("Enter your birth month number: ");
        //Simulate user input
        int birthMonth = 69;

        if (birthMonth > 0 && birthMonth <=12)
        {
            System.out.println(" Your birth month is : " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorret month value : " + birthMonth);
        }

    }
}