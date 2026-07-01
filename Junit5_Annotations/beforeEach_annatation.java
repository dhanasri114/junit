public class Caluclate
{
    int add(int a,int b)
    {
        int result=a+b;
        return result;
    }

    int sub(int a,int b)
    {
        int result=a-b;
        return result;
    }

    int mul(int a,int b)
    {
        int result=a*b;
        return result;
    }

}

// test class

public class TestCaluclate
{
    Caluclate cal;

     @BeforEach
     void setUp()
     {
        cal=new Caluclate();
     }

     @test
    void testAdd()
    {
        assertEqual(20,cal.add(10,10))
    }

    @test
    void testmul()
    {
        assertEqual(150,cal.add(15,10))
    }
    
    @test
    void testsub()
    {
        assertEqual(50,cal.add(60,10))
    }
}