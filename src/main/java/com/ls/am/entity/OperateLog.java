package com.ls.am.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @program: AM
 * @description
 * @author: Ls
 * @create: 2020-01-20 18:09
 **/
@Data
@Entity
public class OperateLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
