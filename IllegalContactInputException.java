package lab.week.pkg9;

/**
 *
 * @author seunghwankim
 */
public class IllegalContactInputException extends Exception
{
    
    public IllegalContactInputException()
    {
        super("Please give me your first name, last name, and email address");
    }
    
    public IllegalContactInputException(String message)
    {
        super(message);
    }
    
    //constructor used for chaining exceptions
    public IllegalContactInputException(Throwable throwable)
    {
        super(throwable);
    }
    
    //constructor with a message and chaining exceptions
    public IllegalContactInputException(String message, Throwable throwable)    
    {
        super(message, throwable);
    } 
}