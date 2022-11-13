package com.example.common.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_celebrity")
public class Celebrity implements Serializable {

    @TableId(value = "id")
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private Integer name;
    private String sex;
    private Integer age;
    private String phonenumber;
    private String email;
    private String avatar;
    private String intro;
    private String realname;
    private String platform;
    private String platformUrl;
    private Integer category;
    private Integer creditPoint;
    private Integer like;
}