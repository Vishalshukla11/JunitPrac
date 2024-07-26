import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserRegistrationProblemTest {
    private UserRegistrationProblem user = new UserRegistrationProblem();

    @Test
    @DisplayName("ValidFirstName")
    public void ValidFirstName() {
        String[] ValidFirstname = { "Vishal", "Vikram", "Vipul", "Vinay", "Vivek" };
        for (String Names : ValidFirstname) {
            assertTrue(user.ValidFirstName(Names));
        }
    }

    @Test
    @DisplayName("InvalidFisrtName")
    public void InvalidFirstNameTest() {

        String[] inValidFirstname = { "vISHAL", "vIsHaL", "vipul", "vinay", "vivek" };
        for (String Names : inValidFirstname) {
            assertFalse(user.ValidFirstName(Names), "Expected valid Names:" + Names);
        }

    }

    @Test
    @DisplayName("ValidLastName")
    @Disabled
    public void ValidLastNameTest() {
        String[] ValidLastname = { "Shukla", "Pandey", "Tiwari", "Singh" };
        for (String Names : ValidLastname) {
            assertTrue(user.ValidLastName(Names), "Expected valid Names:" + Names);
        }

    }

    
    @Test
    public void InValidLastNameTest() {
        String[] InValidLastname = { "sHUKLA", "pandey", "tiwari", "sINGH" };
        for (String Names : InValidLastname) {
            assertFalse(user.ValidLastName(Names), "Expected valid Names:" + Names);
        }

    }

    @Test
    public void ValidEmailTest() {
        String[] validEmailsTest = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com",
                "shuklapankaj9993@gmail.com"
        };

        for (String email : validEmailsTest) {
            assertTrue(user.ValidEmail(email), "Expected Valid Email:" + email);
        }
    }

    @Test
    public void InValidEmailTest() {
        String[] InvalidEmailsTest = {
                "abc",
                "abc123@gmail.a",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a"
        };

        for (String email : InvalidEmailsTest) {
            assertFalse(user.ValidEmail(email), "Expected Valid Email:" + email);
        }
    }

    @Test
    public void ValidMobileNumberTest() {
        String[] mobileNuber = { "+917771860135", "+919993040795" };
        for (String Mnum : mobileNuber) {
            assertTrue(user.ValidMobileNumber(Mnum), "Expected Result " + Mnum);

        }
    }

    @Test
    public void InValidMobileNumberTest() {
        String[] mobileNuber = { "7771860135", "+91999" };
        for (String Mnum : mobileNuber) {
            assertFalse(user.ValidMobileNumber(Mnum), "Expected Result " + Mnum);

        }
    }

    @Test
    public void ValidPasswordTest() {
        String[] validPassword = { "Pankaj@123", "Vishal123@" };
        for (String password : validPassword) {
            assertTrue(user.ValidPassword(password), password);

        }
    }

    @Test
    public void InValidPasswordTest() {
        String[] InvalidPassword = { "123", "Vishal", "@#$%^" };
        for (String password : InvalidPassword) {
            assertFalse(user.ValidPassword(password), password);

        }
    }

}