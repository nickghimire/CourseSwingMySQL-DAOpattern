/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.swing2course.dao;

import com.leapfrog.swing2course.entity.Course;
import java.sql.SQLException;

/**
 *
 * @author apple
 */
public interface CourseDAO {
    int insert(Course c) throws ClassNotFoundException,SQLException;
    Course getRecord(String param,int id) throws ClassNotFoundException,SQLException;
    int update(Course c) throws ClassNotFoundException,SQLException;
    int delete( int id ) throws ClassNotFoundException,SQLException;
    
}
