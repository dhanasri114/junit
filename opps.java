
class store
{
    void drinks()
        {
            System.out.println("buy drinks");
        }
}

class person extends store
{
    void cakes()
    {
        System.out.println("Buy cakes");
    }
}


public class opps
{
    public static void main(String args[])
    {
        person p=new person();
        p.cakes();
        p.drinks();
    }
}