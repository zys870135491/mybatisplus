package com.zys.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {

   /* @Autowired
    private UserMapper userMapper;


    @Test
    public void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    // 新增
    @Test
    public void insert(){
        User user = new User();
        user.setName("李四");
        user.setEmail("李四@qq.com");
        user.setAge(23);
        int insert = userMapper.insert(user);
        System.out.println("Inser:"+insert);
    }

    // 修改
    @Test
    public void update(){
        User user = new User();
        user.setId(1329366918578180098L);
        user.setName("李四1");
        user.setEmail("李四1@qq.com");
        user.setAge(24);
        int insert = userMapper.updateById(user);
        System.out.println("update:"+insert);
    }

    // 乐观锁
    @Test
    public void version(){
        // 线程 1    
        User user = userMapper.selectById(1329366918578180098L);
        user.setName("kuangshen111");
        user.setEmail("24736743@qq.com");

    *//*    // 模拟另外一个线程执行了插队操作    
        User user2 = userMapper.selectById(1L);
        user2.setName("kuangshen222");
        user2.setEmail("24736743@qq.com");
        userMapper.updateById(user2);*//*

        // 自旋锁来多次尝试提交！    
        userMapper.updateById(user); // 如果没有乐观锁就会覆盖插队线程的值！
    }

    // 批量查询
    @Test
    public void selectBatch(){
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1L, 2L, 3L));
        users.forEach(u->{
            System.out.println(u);
        });
    }

    // 按条件查询之一使用map操作
    @Test
    public void selectByMap(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","Billie");
        map.put("age","11");
        List<User> users = userMapper.selectByMap(map);
        users.forEach(u->{
            System.out.println(u);
        });
    }


    // 测试分页查询
      @Test
     public void testPage(){
    //  参数一：当前页    //  参数二：页面大小    
    //  使用了分页插件之后，所有的分页操作也变得简单的！    
    Page<User> page = new Page<>(1,5);
    userMapper.selectPage(page,null);
    page.getRecords().forEach(System.out::println);
    System.out.println(page.getTotal());
    }

    @Test
    public  void deleteLogic(){
        userMapper.deleteById(1l);
    }
*/

}
