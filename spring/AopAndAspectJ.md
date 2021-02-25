# AOP

## xml中的命名空间

1. xmlns:context
2. xmlns:aop(两个地方都需要添加内容)

## 流程

1. 开启扫描包

   ```xml
   <context:compoent-scan base-package="com.clark"/>
   ```

   

2. 被代理的地方和代理(UserProxy)都加上@Component -> 创建增强和被增强类

3. 增强类上面(Proxy)添加@Aspect注解 -> 生成代理对象

4. .xml中开启ASPECTJ生成代理对象 -> 扫描之后添加代理

   ```java
   <aop:aspectj-autoproxy/>
   ```

5. 配置不同类型的通知（增强类的里面的方法添加对应的类型的通知，并使用切入点表达式）

   ```java
   class Proxy{
       
       @Before(value="execution(* com.clark.aopannoo.User.add(..))")
       public void before(){
           System.out.println("before...");
       }
       @After
       @AfterReturning
       @AfterThrowing
       
       //环绕通知：方法之前和之后都执行
       @Around()
       public void around(ProceedingJoinPoint proceedingJoinPoint) throws Exception{
   		//a
           proceedingJoinPoint.proceed();//原来执行的部分
           //b
       }
   }
   ```

   

