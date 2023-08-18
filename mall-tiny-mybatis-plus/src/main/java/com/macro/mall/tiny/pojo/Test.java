package com.macro.mall.tiny.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

import java.io.Serializable;

/**
 * <p>
 * 后台用户角色表
 * </p>
 *
 * @author yuri
 * @since 2023-08-18
 */
@TableName(value = "test")//指定表名
public class Test implements Serializable {
    private static final long serialVersionUID = -5644799954031156649L;
    //value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(value = "id", type = IdType.AUTO)//指定自增策略
    @Column(name = "id", type = MySqlTypeConstant.INT, isNull = false, comment = "id")
    private Integer id;

    @TableField(value = "name")
    @Column(name = "",comment = "名称",isNull = false)
    private String name;

    @TableField(value = "sex")
    @Column(name = "",comment = "性别",isNull = false)
    private String sex;
    private String pwd;
    @TableField(value = "email")
    @Column(name = "",comment = "邮件",isNull = false)
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

