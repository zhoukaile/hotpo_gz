package com.example.hotpot.comment;

import tk.mybatis.mapper.common.BaseMapper;

public interface MyBaseMapper<T> extends BaseMapper<T> {
    public static Integer PAGE_SIZE = 20;
}
