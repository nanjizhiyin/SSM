package com.xpfirst.hdrRouter.dao;

import com.xpfirst.hdrRouter.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Copyright (C) 2017/5/10 北京学信科技有限公司
 *
 * @author:kyq
 * @version:v1.0.0 Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017/5/10     kyq                       v1.0.0        create
 */
@Repository
public interface UserDao {

    /**
     * 根据学信ID查询用户信息
     * @author kyq
     * @version 1.0
     * @date 2017/5/10 18:59
     */
    public User findUserByUsername(@RequestParam("username") String username);

    /**
    * @Author: Gaojindan
    * @Create: 2018/1/29 下午1:31
    * @Des: 添加一个用户
    * @Param:
    * @Return:
    */
    public void insetUsername(@RequestParam("User") User user);
}
