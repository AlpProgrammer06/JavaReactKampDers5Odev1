package Busines.Concretes;



import java.util.regex.Pattern;

public class Validator {
    public static boolean emailVerification(String email){
        final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
        return EMAIL_REGEX.matcher(email).matches();
    }
    public static boolean passwordVerification(String password){
        return password.length()>=6;
    }
    public static boolean nameVerification(String name, String lastName){
        return name.length()>=2 && lastName.length()>=2;
    }
}
