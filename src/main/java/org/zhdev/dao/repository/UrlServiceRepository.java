package org.zhdev.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.zhdev.entity.ServiceUrl;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 15:38 2017/10/25
 * @Modified By :
 */
public interface UrlServiceRepository extends CrudRepository<ServiceUrl,Long> {
}
