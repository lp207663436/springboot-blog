package com.lp.blog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 管理员实体类
 *
 * @Date 2020/6/18 21:54
 * @Author luopeng
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminUser {
    private Integer adminUserId;

    private String loginUserName;

    private String loginPassword;

    private String nickName;

    private Byte locked;
}
