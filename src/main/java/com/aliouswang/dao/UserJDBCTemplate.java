package com.aliouswang.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.aliouswang.model.User;

public class UserJDBCTemplate {
	
	   private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   
	   public void setDataSource(DataSource dataSource) {
		      this.dataSource = dataSource;
		      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		   }
	
	   
	   public List<User> listStudents() {
		      String SQL = "select * from Student";
		      List <User> students = jdbcTemplateObject.query(SQL, 
		                                new UserMapper());
		      return students;
	   }

}
