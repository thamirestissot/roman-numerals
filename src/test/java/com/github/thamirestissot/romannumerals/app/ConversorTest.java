package com.github.thamirestissot.romannumerals.app;

import org.junit.Assert;
import org.junit.Test;

public class ConversorTest {

    @Test
    public void checkConvertRomansToDecimal19() {
        Assert.assertEquals(Conversor.toInteger("XIX"),19);
    }
    @Test
    public void checkConvertRomansToDecimal14() {
        Assert.assertEquals(Conversor.toInteger("xIV"),14);
    }
    @Test
    public void checkConvertRomansToDecimal13() {
        Assert.assertEquals(Conversor.toInteger("XIii"),13);
    }
    @Test
    public void checkConvertRomansToDecimal17() {
        Assert.assertEquals(Conversor.toInteger("Xvii"),17);
    }
    @Test
    public void checkConvertDecimalToRoman19() {
        Assert.assertEquals(Conversor.toRoman(19),"XIX");
    }
    @Test
    public void checkConvertDecimalToRoman14() {
        Assert.assertEquals(Conversor.toRoman(14),"XIV");
    }
    @Test
    public void checkConvertDecimalToRoman13() {
        Assert.assertEquals(Conversor.toRoman(13),"XIII");
    }
    @Test
    public void checkConvertDecimalToRoman17() {
        Assert.assertEquals(Conversor.toRoman(17),"XVII");
    }
}
