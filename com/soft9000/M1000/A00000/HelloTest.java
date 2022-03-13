package com.soft9000.M1000.A00000;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloTest {

    @Test
    public void main() {
        ByteArrayOutputStream my_out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(my_out));
        Hello.main(null);
        Assert.assertEquals("Hello, 'Javaeer!", my_out.toString().trim());
        System.setOut(System.err);
        System.out.println("Testing Success!");
    }
}