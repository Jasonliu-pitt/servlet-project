/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hw3.util;

import com.hw3.model.UserBeans;

/**
 *
 * @author thinkpad
 */
public class UserOper {
    
    public boolean valid(UserBeans user){
		boolean isValid = false;
		DBAcess db = new DBAcess();
		if(db.createConn()){
			String sql = "select * from HW_user where username='"+user.getName()+"' and password='"+user.getPwd()+"'";
			db.query(sql);
			if(db.next()){
				isValid = true;
			}
			db.closeRs();
			db.closeStm();
			db.closeConn();
		}
		return isValid;
	}

	public boolean isExist(UserBeans user){
		boolean isValid = false;
		DBAcess db = new DBAcess();
		if(db.createConn()){
			String sql = "select * from HW_user where username='"+user.getName()+"'";
			db.query(sql);
			if(db.next()){
				isValid = true;
			}
			db.closeRs();
			db.closeStm();
			db.closeConn();
		}
		return isValid;
	}

	public boolean add(UserBeans user){
		boolean isValid = false;
		DBAcess db = new DBAcess();
		if(db.createConn()){
			String sql = "insert into HW_user(id,username,password,email,tel) values('"+GenerateId.next()+"','"+user.getName()+"','"+user.getPwd()+"','"+user.getEmail()+"','"+user.getTel()+"')";
			isValid = db.update(sql);
			db.closeStm();
			db.closeConn();
		}
		return isValid;
        }
}
