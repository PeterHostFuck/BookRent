package com.coderman.rbac.sys.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiveUser {
    /**
     * 当前用户对象
     */
    private User user;
    /**
     * 当前用户具有的角色
     */
    private List<String> roles;
    /**
     * 当前用户具有的权限
     */
    private List<String> permissions;

    /**
     * session id
     */
    private String id;
    /**
     * 用户 id
     */
    private String userId;
    /**
     * 用户名称
     */
    private String username;
    /**
     * 用户主机地址
     */
    private String host;
    /**
     * 用户登录时系统 IP
     */
    private String systemHost;
    /**
     * 状态
     */
    private String status;
    /**
     * session 创建时间
     */
    private String startTimestamp;
    /**
     * session 最后访问时间
     */
    private String lastAccessTime;
    /**
     * 超时时间
     */
    private Long timeout;
    /**
     * 所在地
     */
    private String location;
    /**
     * 是否为当前登录用户
     */
    private boolean current;
}
