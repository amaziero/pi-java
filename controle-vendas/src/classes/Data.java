package classes;


public class Data {
    public boolean validateUserName(String user, String password) {
        if(user.equals("admin") && password.equals("123456")) {
            return true;
        } else {
            return false;
        }
    }
}
