package com.aliouswang.controller;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aliouswang.dao.UserMapper;
import com.aliouswang.model.User;

@Controller
public class GetUserController {
	
	@RequestMapping("/getUserId")
	public @ResponseBody User getUserById(int id) {
//        //mybatis的配置文件
//        String resource = "conf.xml";
//        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
//        InputStream is = GetUserController.class.getClassLoader().getResourceAsStream(resource);
//        //构建sqlSession的工厂
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
//        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
//        //Reader reader = Resources.getResourceAsReader(resource); 
//        //构建sqlSession的工厂
//        //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        //创建能执行映射文件中sql的sqlSession
//        SqlSession session = sessionFactory.openSession();
//        /**
//         * 映射sql的标识字符串，
//         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
//         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
//         */
//        String statement = "com.aliouswang.mapping.userMapper.getUser";//映射sql的标识字符串
//        //执行查询返回一个唯一user对象的sql
//        User user = session.selectOne(statement, 1);
//        return user;
		
		ApplicationContext ctx=null;  
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
        UserMapper userMapper=(UserMapper)ctx.getBean("userMapper");  
        
        return userMapper.selectUser();
	}

}
