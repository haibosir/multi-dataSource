package com.wf.ew.db;


import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @ClassName DynamicDataSource
 * @Description //DynamicDataSource
 * @Author singleZhang
 * @Email 405780096@qq.com
 * @Date 2020/11/2 0002 下午 2:22
 **/
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey()
    {
        return DynamicDataSourceHelper.getDataSourceType();
    }
}
