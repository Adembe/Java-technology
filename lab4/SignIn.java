package lab4;

public class SignIn {
    private String loginName;
    private String loginPassword;
    private String confirmPassword;

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public SignIn(String loginName, String loginPassword, String confirmPassword) throws IllegalCheckException{
        if(!check(loginName,loginPassword,confirmPassword)){
            throw new IllegalArgumentException("Netreh ner eswel password aldaatai baina.");
        }
        else {
            System.out.println("Amjilttai newterlee");
        }
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.confirmPassword = confirmPassword;
    }

    public static boolean check(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new IllegalArgumentException("Nernii urt taarsan.");
            }
            if (!login.matches("^[a-zA-Z0-9_]+$")) {
                throw new IllegalArgumentException("ner temdegt taarsan.");
            }
            if (!password.equals(confirmPassword)) {
                throw new IllegalArgumentException("Password taarsan.");
            }
            if (!password.matches("^[a-zA-Z0-9_]+$")) {
                throw new IllegalArgumentException("Password temdegt taarch baina.");
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
