package com.javakc.ssm.user.dao;

import com.javakc.ssm.user.entity.User;

import java.util.List;
import java.util.Map;

/**
 * 用户模块数据层接口
 */
public interface UserDao {

    /**
     * 用户注册
     * @param entity 实体类
     * @return  返回成功状态
     */
    public int insert(User entity);

    /**
     * 用户修改
     * @param entity 实体类
     * @return  返回成功状态
     */
    public int update(User entity);

    /**
     * 删除用户
     * @param id 主键id
     * @return  返回成功状态
     */
    public int delete(String id);

    /**
     * 查询所有记录
     * @return  结果集
     */
    public List<User> queryAll();

    /**
     * 分页查询
     * @param param 筛选条件
     * @return 结果集
     */
    public List<User> queryByPage(Map<String, Object> param);

    /**
     * 查询总条数
     * @param param 筛选条件
     * @return 查询条数
     */
    public long queryByCount();

    /**
     * 查询单条记录
     * @param id 主键id
     * @return  结果
     */
    public User queryById(String id);

    public int downloads(int id);

}
