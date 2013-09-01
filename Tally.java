
public class Tally
{
    int t;
    
    public Tally()
    {
        t = 0;
    }
    
    public int inc()
    {
        t++;
        return t;
    }
    
    public int inc(int a)
    {
            t = t + a;
            return t;
    }
    
    public int getTally()
    {
        return t;
    }
    
    public int safeInc()
    {
        int temp = t;
        temp++;
        if (temp <= t)
        {
            throw new ArithmaticException();
        }
        t = temp;
        return t;
    }
}
