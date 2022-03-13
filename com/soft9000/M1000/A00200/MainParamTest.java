package com.soft9000.M1000.A00200;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainParamTest {

    @Test
    public void main() {
        ByteArrayOutputStream my_out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(my_out));
        // TEST - Null Parameters:
        MainParam.main(null);
        MainParam.main(new String[0]);
        String[] aparam = {"Bingo!", "Test"};
        MainParam.main(aparam);
        String[] results = my_out.toString().split("\n");
        String[] expected = {
                "Input parameters are null.",
                "I've nada to heco?",
                "I've 2 parameter strings.",
        };
        Assert.assertEquals(results.length, expected.length);
        for (int ss = 0; ss < expected.length; ss++) {
            Assert.assertEquals(results[ss].trim(), expected[ss]);
        }
        // Done - OK!
        System.setOut(System.err);
        System.out.println("Testing Success!");
    }
}