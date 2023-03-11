package ru.netology;

import org.junit.Test;
import org.junit.Assert;

public class CashBackServiceTest {
    CashBackService service = new CashBackService();


    @Test
    public void testRemain() {
        Assert.assertEquals(500, service.remain(500));
    }
    @Test
    public void ShouldReturnHundred() {
        Assert.assertEquals(100, service.remain(900));
    }

    @Test
    public void ShouldReturnThousand() {
        Assert.assertEquals(1000, service.remain(0));
    }

    @Test
    public void ShouldReturnZero() {
        Assert.assertEquals(0, service.remain(1000));
    }
}
