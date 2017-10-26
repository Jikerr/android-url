package org.zhdev.dao.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.zhdev.entity.ServiceUrl;

import java.util.List;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 15:38 2017/10/25
 * @Modified By :
 */
public interface UrlServiceRepository extends CrudRepository<ServiceUrl,Long> {


    @Query("from ServiceUrl order by updateDate desc")
    public List<ServiceUrl> list();

}



