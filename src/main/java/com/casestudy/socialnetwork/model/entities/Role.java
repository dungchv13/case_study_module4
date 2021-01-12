package com.casestudy.socialnetwork.model.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Role {
    private int roleId;
    private String roleName;
    private Collection<UserRole> userRolesByRoleId;

    @Id
    @Column(name = "role_id")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return roleId == role.roleId && Objects.equals(roleName, role.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName);
    }

    @OneToMany(mappedBy = "roleByRoleId")
    public Collection<UserRole> getUserRolesByRoleId() {
        return userRolesByRoleId;
    }

    public void setUserRolesByRoleId(Collection<UserRole> userRolesByRoleId) {
        this.userRolesByRoleId = userRolesByRoleId;
    }
}
