import Busines.Abstract.UserService;
import Busines.Concretes.UserManager;
import Core.Conretes.GoogleManagerAdapter;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concretes.User;

public class Main {
    public static void main(String[] args) {
        User user =new User(1,"Aslan","Balcı","aslaneymenbalci@gmail.com" , "12345");
        User testUser = new User(1,"Aslan","Balcı","aslaneymenbalci@gmail.com","12345");

        UserService userService = new UserManager(new HibernateUserDao(),new GoogleManagerAdapter());  // mevzunun hepsi burda dönüyor bu ödevin kritik yeri
        userService.register(user);
        userService.login(user,"aslaneymenbalci@gmail.com","12345");


    }
}