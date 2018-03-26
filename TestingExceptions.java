package lab.week.pkg9;

/**
 *
 * @author seunghwankim
 */
public class TestingExceptions
{
    public static void main(String[] args) 
    {
        try
        {
            firstMethod();
        } catch (IllegalContactInputException ex)
        {
            System.out.println(ex.getMessage());
        }
            secondMethod();
    }
    
    public static void firstMethod() throws IllegalContactInputException
    {
        throw new IllegalContactInputException();
    }
    
    public static void secondMethod() 
    {
        try{
            throw new IllegalContactInputException("My first name: Seunghwan, last name: Kim, and email address: joseph.seunghwan.kim@gmail.com");
        }
        catch (IllegalContactInputException e)
        {
            System.err.println(e.getMessage());
        }
        finally
        {
            System.out.println("This will always run-even without an exception");
        }
    }
}
