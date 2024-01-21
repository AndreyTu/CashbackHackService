package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

    public class CashbackHackServiceTest {
        @Test
        public void should500Amount500() {
            CashbackHackService service = new CashbackHackService();
            int amount = 500;
            int expected = 500;
            int actual = service.remain(amount);

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void should0Amount1000() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;
            int expected = 0;
            int actual = service.remain(amount);

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void should999Amount1001() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1001;
            int expected = 999;
            int actual = service.remain(amount);

            Assert.assertEquals(actual, expected);
        }

        @Test
        public void should1000Amount0() {
            CashbackHackService service = new CashbackHackService();
            int amount = 0;
            int expected = 1000;
            int actual = service.remain(amount);

            Assert.assertEquals(actual, expected);
        }

}