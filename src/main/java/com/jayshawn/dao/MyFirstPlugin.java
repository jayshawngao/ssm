package com.jayshawn.dao;

import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;

/**
 * @Intercepts用于插件签名
 * @Signature:拦截哪个对象的哪个方法，以及方法参数
 * @author Jayshawn
 * @date 2018年3月5日 上午9:51:00
 */
@Intercepts({
	@Signature(type=StatementHandler.class,method="parameterize",args={java.sql.Statement.class})
	
})
public class MyFirstPlugin implements Interceptor {

	/**
	 * 拦截目标对象目标方法的执行
	 */
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		// 执行目标方法
		Object object = invocation.proceed();
		return object;
	}

	/**
	 * 包装目标对象,返回一个代理对象
	 */
	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	/**
	 * 获得插件配置时的信息
	 */
	@Override
	public void setProperties(Properties properties) {
		// TODO Auto-generated method stub
		
	}

}
