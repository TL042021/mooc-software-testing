package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void No_g_inString()
    {
        GHappy No_g = new GHappy();
        boolean result = No_g.gHappy("xyz");
        Assertions.assertTrue(result);
    }

    @Test
    public void Valid_g_even()
    {
        GHappy Valid_g = new GHappy();
        boolean result = Valid_g.gHappy("xggxygg");
        Assertions.assertTrue(result);
    }

    @Test
    public void Valid_g_odd()
    {
        GHappy Valid_g = new GHappy();
        boolean result = Valid_g.gHappy("yxgggxy");
        Assertions.assertTrue(result);
    }

    @Test
    public void Valid_all_g()
    {
        GHappy Valid_g = new GHappy();
        boolean result = Valid_g.gHappy("ggggg");
        Assertions.assertTrue(result);
    }

    @Test
    public void single_g_begin()
    {
        GHappy single_g = new GHappy();
        boolean result = single_g.gHappy("gx");
        Assertions.assertFalse(result);
    }

    @Test
    public void single_g_between()
    {
        GHappy single_g = new GHappy();
        boolean result = single_g.gHappy("xggyxgx");
        Assertions.assertFalse(result);
    }

    @Test
    public void single_g_end()
    {
        GHappy single_g = new GHappy();
        boolean result = single_g.gHappy("xxg");
        Assertions.assertFalse(result);
    }

}
