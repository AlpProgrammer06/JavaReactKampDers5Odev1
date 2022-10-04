package DataAccess.Abstract;

import Entities.Concretes.User;

public interface UserDao {
    public void add(User user);
    public void update(User user);
    public void delete(User user);
}
