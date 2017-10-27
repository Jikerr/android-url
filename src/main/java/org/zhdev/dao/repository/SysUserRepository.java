package org.zhdev.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zhdev.entity.SysUser;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 15:10 2017/10/27
 * @Modified By :
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
}