/**
 * @author: cmots
 * @date: 2020/1/14 19:49
 * @description: entity of roles
 */
package com.cmots.hicmost.domain;

import java.io.Serializable;

public class Role implements Serializable {

    private static final Long serialVersionUID = 1L;
    private int roleId;
    private String role;
    private String description;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
