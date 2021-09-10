package itheima;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service("userService")
public class UserServicelmpl implements UserService {

    @Resource(name="userDao")
    private UserDao userDao;

    @Override
    public void save() {
        this.userDao.save();
        System.out.println("userservice......save......");
    }
}
