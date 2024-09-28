
/**
 * A class that changes ClockDisplayClass
 *
 * @author Austin Nass
 * @version 09/28/2024
 */
public class TestClockDIsplay
{

    /**
     * Constructor for objects of class TestClockDIsplay
     */
    public TestClockDIsplay()
    {
    }
    
    public void test()
    {
        ClockDisplay clock = new ClockDisplay();
        
    clock.setTime(22, 30);
    System.out.println(clock.getTime());
    
    clock.setTime(00, 00);
    System.out.println(clock.getTime());
    
    clock.setTime(12, 00);
    System.out.println(clock.getTime());
    }
}
