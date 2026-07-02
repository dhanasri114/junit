//this is java class

public class Caluclate
{
    int add(int a,int b)
    {
        int result=a+b;
        return result;
    }
}


//this is test class

public class TestCaluclate
{
    @test
    void testAdd()
    {
        Caluclate c=new Caluclate();

        assertEqual(30,c.add(10,30));
    }
}


