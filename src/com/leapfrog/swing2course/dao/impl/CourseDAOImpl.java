/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.swing2course.dao.impl;

import com.leapfrog.swing2course.constant.SQLConstant;
import com.leapfrog.swing2course.dao.CourseDAO;
import com.leapfrog.swing2course.dbutil.DBConnection;
import com.leapfrog.swing2course.entity.Course;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author apple
 */
public class CourseDAOImpl implements CourseDAO {

    private DBConnection db = new DBConnection();

    @Override
    public int insert(Course c) throws ClassNotFoundException, SQLException {
        db.open();
        PreparedStatement stmt = db.initStatement(SQLConstant.INSERT_COURSE);
        stmt.setString(1, c.getName());
        stmt.setDouble(2, c.getFees());
        stmt.setInt(3, c.getDuration());
        stmt.setString(4, c.getDurationType());
        stmt.setBoolean(5, c.isStatus());
        int result = db.executeUpdate();
        return result;
    }

    @Override
    public Course getRecord(String param,int id) throws ClassNotFoundException, SQLException {
        Course c = null;
        db.open();
        String sql = SQLConstant.GETALL_COURSE;
        if (param.equalsIgnoreCase("first")) {
            sql += " LIMIT 0,1 ";
        } else if (param.equalsIgnoreCase("last")) {
            sql += " order by course_id desc LIMIT 0,1 ";
        } else if (param.equalsIgnoreCase("next")){
            sql += " WHERE course_id > ? limit 1 ";
        }else if (param.equalsIgnoreCase("previous")){
            sql += " WHERE course_id < ? limit 1 ";
        
    }

        PreparedStatement stmt = db.initStatement(sql);
        if(id!=0){
            stmt.setInt(1, id);
        }

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            c = new Course();

            c.setId(rs.getInt("course_id"));
            c.setName(rs.getString("course_name"));
            c.setFees(rs.getDouble("fees"));
            c.setDuration(rs.getInt("duration"));
            c.setDurationType(rs.getString("duration_type"));
            c.setStatus(rs.getBoolean("status"));

        }
        db.close();
        return c;
    }

    @Override
    public int update(Course c) throws ClassNotFoundException, SQLException {
        db.open();
        PreparedStatement stmt = db.initStatement(SQLConstant.UPDATE_COURSE);
        stmt.setString(1, c.getName());
        stmt.setDouble(2, c.getFees());
        stmt.setInt(3, c.getDuration());
        stmt.setString(4, c.getDurationType());
        stmt.setBoolean(5, c.isStatus());
        stmt.setInt(6, c.getId());
        int result = db.executeUpdate();
        return result;

    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
    
        db.open();
        PreparedStatement stmt =db.initStatement(SQLConstant.DELETE_COURSE);
        stmt.setInt(1, id);
        
        int result= db.executeUpdate();
        db.close();
        
        
        return result;
    }

}
