import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RegexGmailTest {

    private RegexGmail regexGmail = new RegexGmail();

    @Test
    public void validGmailTest() {
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
        };

        for (String email : validEmailsTest) {
            assertTrue(regexGmail.validGmail(email), "Expected Valid Email:" + email);
        }

    }

    @Test
    public void testInvalidEmails() {
        String[] invalidEmails = {
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"

        };

        for (String gmail : invalidEmails) {
            assertFalse(regexGmail.validGmail(gmail), "Expected Invalid Emails:" + gmail);
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a"})
    public void testInvalidEmails(String email) {
            assertFalse(regexGmail.validGmail(email), "Expected Invalid Emails:" + email);

    }

}