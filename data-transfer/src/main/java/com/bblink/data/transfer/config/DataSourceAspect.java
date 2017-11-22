package com.bblink.data.transfer.config;

import com.bblink.data.transfer.model.Log;
import com.bblink.data.transfer.util.DatabaseContextHolder;
import com.bblink.data.transfer.util.DatabaseType;
import com.bblink.data.transfer.util.Hash;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class DataSourceAspect {

    /**
     * 使用空方法定义切点表达式
     */
    @Pointcut("execution(* com.bblink.data.transfer.service.**.*(..))")
    public void declareJointPointExpression() {
    }

    @Before("declareJointPointExpression()")
    public void setDataSourceKey(JoinPoint point){
        //根据连接点所属的类实例，动态切换数据源
        Log msg = (Log)point.getArgs()[0];
        if(Hash.getServer(msg.toString()).equals("A")){
            DatabaseContextHolder.setDatabaseType(DatabaseType.test1);
        }else if(Hash.getServer(msg.toString()).equals("B")){
            DatabaseContextHolder.setDatabaseType(DatabaseType.test2);
        }

    }
}