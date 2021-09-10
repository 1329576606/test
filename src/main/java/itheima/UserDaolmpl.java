package itheima;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaolmpl implements UserDao {

    @Override
    public void save() {
        System.out.println("userdao......save......");
    }
}
