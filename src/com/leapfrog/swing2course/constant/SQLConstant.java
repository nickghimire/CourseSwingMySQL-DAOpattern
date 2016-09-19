/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.swing2course.constant;

import com.leapfrog.swing2course.tableconstant.TableConstant;

/**
 *
 * @author apple
 */
public class SQLConstant {

    public static final String INSERT_COURSE = " INSERT INTO " + TableConstant.COURSE_TABLE + "(course_name,fees,duration,duration_type,status) VALUES (?,?,?,?,?)";
    public static final String GETALL_COURSE = " SELECT * FROM " + TableConstant.COURSE_TABLE;
    public static final String UPDATE_COURSE = "  UPDATE " + TableConstant.COURSE_TABLE + " SET course_name= ? ,fees= ? ,duration= ? ,duration_type= ? ,status= ? WHERE course_id = ? " ;
    public static final String DELETE_COURSE = " DELETE FROM " + TableConstant.COURSE_TABLE + (" WHERE course_id = ? ");

}
