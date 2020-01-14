/**
 * @author: cmots
 * @date: 2020/1/14 19:35
 * @description: the entity model of users
 */
package com.cmots.hicmost.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.cmots.hicmost.controller.UserController;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @JSONField(name = "userId")
    private int userId;
    @JSONField(name = "roleId")
    private int roleId;
    @JSONField(name = "username")
    @Length(min = 1, max = 15, message = "用户名长度违规")
    private String username;
    @JSONField(name = "password", serialize = false)
    private String password;
    @JSONField(name = "profilePhoto")
    private String profilePhoto;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
}
