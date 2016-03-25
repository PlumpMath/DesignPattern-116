package design.structure.proxy.dynamicProxy;


import org.junit.Test;

import design.structure.proxy.dynamicProxy.cglib.BookFacadeCglibProxy;
import design.structure.proxy.dynamicProxy.cglib.BookFacadeClass;
import design.structure.proxy.dynamicProxy.jdk.BookFacade;
import design.structure.proxy.dynamicProxy.jdk.BookFacadeImpl;
import design.structure.proxy.dynamicProxy.jdk.BookFacadeJdkProxy1;
import design.structure.proxy.dynamicProxy.jdk.BookFacadeJdkProxy2;


public class BookFacadeTest {

    /**
     * 测试jdk代理1
     */
    @Test
    public void testJdk1() {
        BookFacadeJdkProxy1 proxy = new BookFacadeJdkProxy1();
        BookFacade bookFacade = (BookFacade) proxy.bind(new BookFacadeImpl());
        bookFacade.addBook("JAVA分布式");
    }
    /**
     * 测试jdk代理2
     */
    @Test
    public void testJdk2() {
        BookFacade bookFacade = new BookFacadeImpl();
        BookFacadeJdkProxy2 handler = new BookFacadeJdkProxy2(bookFacade);
        BookFacade proxy = (BookFacade)handler.getProxy();
        proxy.addBook("JAVA分布式");
    }

    /**
     * 测试cglib代理
     */
    @Test
    public void testCglib() {
        BookFacadeCglibProxy proxy = new BookFacadeCglibProxy();
        BookFacadeClass bookFacadeClass = (BookFacadeClass) proxy.getInstance(new BookFacadeClass());
        bookFacadeClass.updateBook("疯狂JAVA");
    }
    
}
