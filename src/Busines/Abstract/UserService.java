package Busines.Abstract;

import Entities.Concretes.User;

public interface UserService {


    void register(User user);
    void login(User user,String inputEmail, String inputPassword);


}
