package DataAccess.Concretes;

import DataAccess.Abstract.UserDao;
import Entities.Concretes.User;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("Hibernet ile eklendi. " + user.getFirstName());
    }

    @Override
    public void update(User user) {
        System.out.println("Hibernet ile güncellendi. " + user.getFirstName());

    }

    @Override
    public void delete(User user) {
        System.out.println("Hibernet ile silindi. " + user.getFirstName());

    }
}
