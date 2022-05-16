package top.dhbxs.jinsen.admin.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.dhbxs.jinsen.admin.entity.UserEntity;
import top.dhbxs.jinsen.admin.service.ex.ServiceException;
@SpringBootTest
@RunWith(SpringRunner.class)
public class IUserServiceTest {

    @Autowired
    private IUserService iUserService;

    @Test
    public void register() {
        try {
            UserEntity user = new UserEntity();
            user.setUsername("admin");
            user.setPassword("123456");

            iUserService.register(user);
            System.out.println("OK");
        } catch (ServiceException e) {
            // 先获取类的对象，再获取类的名称
            System.out.println(e.getClass().getSimpleName());
            // 获取异常的具体描述信息
            System.out.println(e.getMessage());
        }
    }
}