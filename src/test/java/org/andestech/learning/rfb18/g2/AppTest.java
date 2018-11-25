package org.andestech.learning.rfb18.g2;

import static org.testng.Assert.assertTrue;

import org.testng.ITestContext;
import org.testng.annotations.Test;


public class AppTest 
{

//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }

    @Test(priority = 0)
    public void loginTest (ITestContext ctx)
    {
        System.out.println("Test: " + ctx.getCurrentXmlTest().getName() +
                ", Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( true );

    }

    @Test(priority =1, dependsOnMethods = "loginTest")
    public void profileTest(ITestContext ctx)
    {
        System.out.println("Test: " + ctx.getCurrentXmlTest().getName() +
        ", Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( true );
    }

    @Test(priority = 2, dependsOnMethods = "loginTest", groups = "pageTests")
    public void pageTestCase01(ITestContext ctx)
    {
        System.out.println("Test: " + ctx.getCurrentXmlTest().getName() +
                ", Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( true );
    }

    @Test(priority = 2, dependsOnMethods = "loginTest", groups = "pageTests")
    public void pageTestCase02(ITestContext ctx)
    {
        System.out.println("Test: " + ctx.getCurrentXmlTest().getName() +
                ", Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( true );
    }
    @Test (priority = 2, dependsOnMethods = "loginTest", groups = "pageTests")
    public void pageTestCase03(ITestContext ctx)
    {
        System.out.println("Test: " + ctx.getCurrentXmlTest().getName() +
                ", Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( true );
    }

    @Test(priority = 3, dependsOnMethods = "loginTest")
    public void logoffTest(ITestContext ctx)
    {
        System.out.println("Test: " + ctx.getCurrentXmlTest().getName() +
                ", Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue( true );
    }


}
