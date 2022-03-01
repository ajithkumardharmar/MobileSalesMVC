package com.example.sample.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.sample.connectionutil.ConnectionUtil;
import com.example.sample.dao.UserDao;
import com.example.sample.model.Users;




public class UserDaoImpl implements UserDao{
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public UserDaoImpl() {
		jdbcTemplate = ConnectionUtil.getJdbcTemplate();
	}
	
	 

	public  List<Users> getUserDetails(String email) {
		  String sql = "select pk_user_id,first_name,email,phone_number,wallet,role from users_table where email=? ";
		 System.out.println("h");
		  List<Users> tcObj =   jdbcTemplate.query(sql, new Object[] { email },new RowMapper<Users>() {
			 // Users tc = convert(rs);

			@Override
			public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
				Users user=new Users();
				user.setUserId(rs.getInt("pk_user_id"));
				user.setName(rs.getString("first_name"));
				user.setEmail(rs.getString("email"));
				user.setPhoneNumber(rs.getLong("phone_number"));
				user.setWallet(rs.getDouble("wallet"));
				user.setRole(rs.getString("role"));
				
				 System.out.println("h1");
				 return user;
				
			}
			 
	          
	        });
		  return tcObj;
	    }

	private Users convert(ResultSet rs) throws SQLException {
	
		Users user=new Users();
		user.setUserId(rs.getInt("pk_user_id"));
		user.setName(rs.getString("first_name"));
		user.setEmail(rs.getString("email"));
		user.setPhoneNumber(rs.getLong("phone_number"));
		user.setWallet(rs.getDouble("wallet"));
		user.setRole(rs.getString("role"));
		return user;
	}



}
