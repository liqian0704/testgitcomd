import org.testng.annotations.*;

public class test01 {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("master����");
        System.out.println("develop02" +
                "����test01");

        System.out.println("develop02" +
                "����test01");

        System.out.println(this.getClass().getName() + " beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println(this.getClass().getName() + " afterSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println(this.getClass().getName() + " beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println(this.getClass().getName() + " afterTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println(this.getClass().getName() + " beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println(this.getClass().getName() + " afterClass");
    }

    @BeforeMethod
    public void beofreMethod() {
        System.out.println(this.getClass().getName() + " beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println(this.getClass().getName() + " afterMethod");
    }

    @Test
    public void test1() {
        System.out.println(this.getClass().getName() + " test1");
    }

    @Test
    public void test2() {
        System.out.println(this.getClass().getName() + " test2");
    }
    @Test
    public void test3() {
        System.out.println(this.getClass().getName() + " test2");
    }
    @Test
    public void test4() {
        System.out.println(this.getClass().getName() + " test2");
    }


}
