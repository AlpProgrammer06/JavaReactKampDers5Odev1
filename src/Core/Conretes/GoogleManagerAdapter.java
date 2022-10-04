package Core.Conretes;

import Core.Abstract.GoogleService;
import Entities.Concretes.User;
import JGoogle.jGoogleManager;

public class GoogleManagerAdapter implements GoogleService {
    @Override
    public void withGoogle(User user) {
        jGoogleManager manager  = new jGoogleManager();
        manager.registerWithGoogle(user);

    }
}
