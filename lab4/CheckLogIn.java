package lab4;

public class CheckLogIn {

    public CheckLogIn() throws IllegalCheckException {
        String loginName = "Login_123";
        String loginPassword = "login_123";
        String confirmPassword = "login_123";
        SignIn signIn = new SignIn(loginName,loginPassword, confirmPassword);
    }


    public static void main(String[] args) {
        try {
            new CheckLogIn();
        } catch (IllegalCheckException e) {
            throw new RuntimeException(e);
        }
    }
}
