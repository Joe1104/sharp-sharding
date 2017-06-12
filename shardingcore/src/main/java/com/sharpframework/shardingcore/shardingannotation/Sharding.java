package com.sharpframework.shardingcore.shardingannotation;


import com.sharpframework.shardingcore.shardingmodel.ShardingModel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhaoyabin on 2017-02-07.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Sharding {
    String dataSource();
    ShardingModel shardingModel();
    int shardingCount();
}
