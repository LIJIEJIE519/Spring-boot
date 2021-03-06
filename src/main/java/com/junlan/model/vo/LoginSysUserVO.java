package com.junlan.model.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Set;

/**
 * @Author LJ
 * @Date 2020/12/2
 * msg
 */
@Data
@Accessors(chain = true)
public class LoginSysUserVO {

    private Long id;

    private String username;

    private String usernick;

    private Long roleId;

    private String roleCode;

    private String roleName;

    private Set<String> permissionCodes;
}
