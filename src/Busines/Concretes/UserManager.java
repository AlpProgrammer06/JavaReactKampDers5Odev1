package Busines.Concretes;

import Busines.Abstract.UserService;
import Core.Abstract.GoogleService;
import DataAccess.Abstract.UserDao;
import Entities.Concretes.User;

public class UserManager implements UserService {
    private UserDao userDao;
    private GoogleService googleService;

    public UserManager(UserDao userDao, GoogleService googleService) {
        this.userDao = userDao;
        this.googleService = googleService;
    }

    @Override
    public void register(User user) {
        if (
                Validator.emailVerification(user.getEmail()) &&
                        Validator.passwordVerification(user.getPassword()) &&
                        Validator.nameVerification(user.getFirstName(), user.getLastName())
        ) {
            System.out.println("Email adres =  " + user.getEmail() + "doğrulama kodu gönderildi.");
            System.out.println("Kayıt yapıldı. ");
        } else {
            System.out.println("Geçersiz bir bir E-posta, Ad veya Soyad ");
            return;
        }
        userDao.add(user);
        googleService.withGoogle(user);

    }

    @Override
    public void login(User user, String inputEmail, String inputPassword) {
        if (
                Validator.emailVerification(user.getEmail()) &&
                        Validator.passwordVerification(user.getPassword()) &&
                        Validator.nameVerification(user.getFirstName(), user.getLastName())
        ) {
            System.out.println("Başarıyla giriş yapıldı.");
        } else {
            System.out.println("Yanlış e-posta veya geçiş");
        }

    }
}
