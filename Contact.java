package lab.week.pkg9;

/**
 *
 * @author seunghwankim
 */
public class Contact {

    private String firstName, lastName, email;

    public Contact(String FirstName, String LastName, String Email)
    {
        this.firstName = FirstName;
        this.lastName = LastName;
        this.email = Email;
    }
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
