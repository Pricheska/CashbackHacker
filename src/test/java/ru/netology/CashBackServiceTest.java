package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackServiceTest {

    @Test
    public void testRemain() {
        CashBackService service = new CashBackService();

        Assert.assertEquals(service.remain(500), 500);
    }
    @Test
    public void ShouldReturnThousandIfСurrentZero() {
        CashBackService service = new CashBackService();

        Assert.assertEquals(service.remain(900), 100);
    }

    @Test
    public void ShouldReturnZero() {
        CashBackService service = new CashBackService();

        Assert.assertEquals(service.remain(0), 1000);
    }
}
