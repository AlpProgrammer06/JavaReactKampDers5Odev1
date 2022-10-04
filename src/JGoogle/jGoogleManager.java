package JGoogle;

import Entities.Concretes.User;

public class jGoogleManager {
    public void registerWithGoogle(User user){
        System.out.println("Google Hesabı ile eklendi" + user.getFirstName());
    }
}
