package com.soft9000.M1000.A00100;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainParamsTest {

    @Test
    public void main() {
        ByteArrayOutputStream my_out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(my_out));
        String[] params = {"This", "IS A", "TeSt!"};
        MainParams.main(params);
        String[] results = my_out.toString().split("\n");
        String[] expected = {
                "Got: This ...!",
                "Got: IS A ...!",
                "Got: TeSt! ...!",
        };
        Assert.assertEquals(results.length, expected.length);
        for (int ss = 0; ss < expected.length; ss++) {
            Assert.assertEquals(results[ss].trim(), expected[ss]);
        }
        System.setOut(System.err);
        System.out.println("Testing Success!");
    }
}