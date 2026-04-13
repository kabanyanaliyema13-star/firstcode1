package registrationandlogin;

public class User {

    // global variables   
    private String username;
    private String password;
    private String cellPhonenumber;

    public User(String username, String password, String cellPhonenumber) {
        this.username = username;
        this.password = password;
        this.cellPhonenumber = cellPhonenumber;
    }

    public boolean checkUsername() {
        boolean correctlength = username.length() <= 5;
        boolean contain_ = username.contains("_");

        if (correctlength && contain_) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPassword() {
        // FIX: must be 8 or more characters
        boolean char8 = password.length() >= 8;

        boolean capital = password.matches(".*[A-Z].*");
        boolean number = password.matches(".*[0-9].*");

        // FIX: correct regex (you had typo a-z-z0-9)
        boolean specialchar = password.matches(".*[^a-zA-Z0-9].*");

        if (char8 && capital && number && specialchar) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkcellPhonenumber() {
        // FIX: must START with +27
        boolean hasinternationalcode = cellPhonenumber.startsWith("+27");

        // FIX: correct SA number length (+27 + 9 digits = 12)
        boolean correctlength = cellPhonenumber.length() == 12;

        // FIX: correct regex (9 digits after +27)
        boolean matchesRegex = cellPhonenumber.matches("^\\+27\\d{9}$");

        if (hasinternationalcode && correctlength && matchesRegex) {
            return true;
        } else {
            return false;
        }
    }

    public boolean loginUser(String enteredUsername, String enteredPassword, String enteredcellPhonenumber) {
        return this.username.equals(enteredUsername)
                && this.password.equals(enteredPassword)
                && this.cellPhonenumber.equals(enteredcellPhonenumber);
    }
}