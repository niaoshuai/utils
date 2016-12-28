package com.ruijc.mybatis.mapper;

import com.ruijc.mybatis.BaseMapper;
import com.ruijc.mybatis.bean.User;
import com.ruijc.mybatis.cache.redis.LoggingRedisCache;
import com.ruijc.mybatis.cache.redis.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserMapper extends BaseMapper<User> {
    int countAll();
}
