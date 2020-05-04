package com.jack.edu.mybatis.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @author 吴苗苗
 * @date 2020/5/2 12:45
 */
public interface PersonMapper {

    @Select("select username from blog.blog_user where u_id=#{id}")
    public String selectName(int id);


}
