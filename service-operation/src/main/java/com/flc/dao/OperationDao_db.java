package com.flc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OperationDao_db implements OperationDao {

    @Autowired
    JdbcTemplate jdbcTemplate;



}
