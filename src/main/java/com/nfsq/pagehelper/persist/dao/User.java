package com.nfsq.pagehelper.persist.dao;

import lombok.Data;

import javax.persistence.*;

@Table(name = "user_t")
@Data
public class User {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String password;
    private String empName;



}
