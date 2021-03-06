package com.wfmyzyz.user.user.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author auto
 * @since 2020-03-16
 */
public class RoleAuthority implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色权限ID
     */
    @TableId(value = "role_authority_id", type = IdType.AUTO)
    private Integer roleAuthorityId;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 权限ID
     */
    private Integer authorityId;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    /**
     * 状态:正常，删除
     */
    @TableLogic
    private String tbStatus;

    public Integer getRoleAuthorityId() {
        return roleAuthorityId;
    }

    public void setRoleAuthorityId(Integer roleAuthorityId) {
        this.roleAuthorityId = roleAuthorityId;
    }
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
    public String getTbStatus() {
        return tbStatus;
    }

    public void setTbStatus(String tbStatus) {
        this.tbStatus = tbStatus;
    }

    @Override
    public String toString() {
        return "RoleAuthority{" +
            "roleAuthorityId=" + roleAuthorityId +
            ", roleId=" + roleId +
            ", authorityId=" + authorityId +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", tbStatus=" + tbStatus +
        "}";
    }
}
