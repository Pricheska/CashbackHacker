package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackServiceTest {
    CashBackService service = new CashBackService();


    @Test
    public void testRemain() {
        Assert.assertEquals(service.remain(500), 500);
    }
    @Test
    public void ShouldReturnHundred() {
        Assert.assertEquals(service.remain(900), 100);
    }

    @Test
    public void ShouldReturnZero() {
        Assert.assertEquals(service.remain(0), 1000);
    }
    @Test
    public void ShouldReturnThousand() {
        Assert.assertEquals(service.remain(1000), 0);
    }

}
