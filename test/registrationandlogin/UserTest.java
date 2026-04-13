package registrationandlogin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    // Username Tests
    @Test
    public void testValidUsername() {
        User user = new User("ab_cd", "Password1!", "+27912345678");
        assertTrue(user.checkUsername());
    }

    @Test
    public void testInvalidUsername_NoUnderscore() {
        User user = new User("abcde", "Password1!", "+27912345678");
        assertFalse(user.checkUsername());
    }

    @Test
    public void testInvalidUsername_TooLong() {
        User user = new User("abcdef_", "Password1!", "+27912345678");
        assertFalse(user.checkUsername());
    }

    // Password Tests
    @Test
    public void testValidPassword() {
        User user = new User("ab_cd", "Password1!", "+27912345678");
        assertTrue(user.checkPassword());
    }

    @Test
    public void testInvalidPassword_NoCapital() {
        User user = new User("ab_cd", "password1!", "+27912345678");
        assertFalse(user.checkPassword());
    }

    @Test
    public void testInvalidPassword_TooShort() {
        User user = new User("ab_cd", "Pass1!", "+27912345678");
        assertFalse(user.checkPassword());
    }

    // Cellphone Tests
    @Test
    public void testValidCellphone() {
        User user = new User("ab_cd", "Password1!", "+27912345678");
        assertTrue(user.checkcellPhonenumber());
    }

    @Test
    public void testInvalidCellphone_NoCode() {
        User user = new User("ab_cd", "Password1!", "0912345678");
        assertFalse(user.checkcellPhonenumber());
    }

    @Test
    public void testInvalidCellphone_WrongLength() {
        User user = new User("ab_cd", "Password1!", "+279123");
        assertFalse(user.checkcellPhonenumber());
    }

    // Login Tests
    @Test
    public void testLoginSuccess() {
        User user = new User("ab_cd", "Password1!", "+27912345678");
        assertTrue(user.loginUser("ab_cd", "Password1!", "+27912345678"));
    }

    @Test
    public void testLoginFail_WrongUsername() {
        User user = new User("ab_cd", "Password1!", "+27912345678");
        assertFalse(user.loginUser("wrong", "Password1!", "+27912345678"));
    }

    @Test
    public void testLoginFail_WrongPassword() {
        User user = new User("ab_cd", "Password1!", "+27912345678");
        assertFalse(user.loginUser("ab_cd", "WrongPass1!", "+27912345678"));
    }
}