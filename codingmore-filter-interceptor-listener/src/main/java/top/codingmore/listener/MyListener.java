package top.codingmore.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 5/13/22
 */
@WebListener
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("上下文创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("上下文销毁");
    }
}
