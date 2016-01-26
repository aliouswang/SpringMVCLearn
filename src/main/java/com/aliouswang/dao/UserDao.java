package com.aliouswang.dao;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.aliouswang.model.User;

public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcT;
    
//    public void setJdbcT(JdbcTemplate jdbcT) {
//        this.jdbcT = jdbcT;
//    }

    public  List findALL() {
        String sql = "select * from User";
        return jdbcT.queryForList(sql);
    }
    
    public List<User> findALLDepts() {
        List<User> depts = new ArrayList<User>();;
        String sql = "select * from User";
        List list = jdbcT.queryForList(sql); 
        Iterator iterator = list.iterator();
        User dept = null;
        while (iterator.hasNext()) {
            Map map4dept = (Map) iterator.next();
            dept = new User();       
            dept.setUser_id(((Integer) map4dept.get("user_id")));
            dept.setUser_name((String)map4dept.get("user_name"));
            dept.setHead_ic((String)map4dept.get("head_ic"));        
            depts.add(dept);
        }
        return depts;
    }    
    public int delete(int bid){
        String sql = "delete from User where user_id =?";
        return jdbcT.update(sql, new Object[]{bid});
    }  
}
