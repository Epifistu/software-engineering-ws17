import TinyTestJ.Test;

import static TinyTestJ.Assert.*;



public class TestSuite {


    //tests adapted to Factory Pattern
    @Test
    public static void DETest1() {
        UnitConverter test = ConverterFactory.instance().create("dollar to euro");
        double result = test.convert(10000);
        assertEquals(8500, result, 0.001);
    }

    @Test
    public static void DETest2() {
        UnitConverter test = ConverterFactory.instance().create("dollar to euro");
        double result = test.convert(-1);
        assertEquals(-0.85, result, 0.001);
    }

    @Test
    public static void DETest3() {
        UnitConverter test = ConverterFactory.instance().create("dollar to euro");
        double result = test.convert(0);
        assertEquals(0, result, 0.001);
    }

    @Test
    public static void BETest1() {
        UnitConverter test = ConverterFactory.instance().create("boliviano to euro");
        double result = test.convert(-10);
        assertEquals(-1.2, result, 0.001);
    }

    @Test
    public static void BETest2() {
        UnitConverter test = ConverterFactory.instance().create("boliviano to euro");
        double result = test.convert(Math.PI);
        assertEquals(0.37699111843, result, 0.001);
    }

    @Test
    public static void BETest3() {
        UnitConverter test = ConverterFactory.instance().create("boliviano to euro");
        double result = test.convert(2d/3d);
        assertEquals(0.08, result, 0.001);
    }

    @Test
    public static void RETest1() {
        UnitConverter test = ConverterFactory.instance().create("ruble to euro");
        double result = test.convert(Math.E);
        assertEquals(0.03995874287, result, 0.001);
    }

    @Test
    public static void RETest2() {
        UnitConverter test = ConverterFactory.instance().create("ruble to euro");
        double result = test.convert(1);
        assertEquals(0.0147, result, 0.001);
    }

    @Test
    public static void RETest3() {
        UnitConverter test = ConverterFactory.instance().create("ruble to euro");
        double result = test.convert(-8546952);
        assertEquals(-125640.1944, result, 0.001);
    }

    @Test
    public static void CLTest1() {
        UnitConverter test = ConverterFactory.instance().create("cup to litre");
        double result = test.convert(3d/4d);
        assertEquals(0.18, result, 0.001);
    }

    @Test
    public static void CLTest2() {
        UnitConverter test = ConverterFactory.instance().create("cup to litre");
        double result = test.convert(-0);
        assertEquals(0, result, 0.001);
    }

    @Test
    public static void CLTest3() {
        UnitConverter test = ConverterFactory.instance().create("cup to litre");
        double result = test.convert(1);
        assertEquals(0.24, result, 0.001);
    }

    @Test
    public static void GLTest1() {
        UnitConverter test = ConverterFactory.instance().create("gallon to litre");
        double result = test.convert(1);
        assertEquals(3.84, result, 0.001);
    }

    @Test
    public static void GLTest2() {
        UnitConverter test = ConverterFactory.instance().create("gallon to litre");
        double result = test.convert(5000);
        assertEquals(19200, result, 0.001);
    }

    @Test
    public static void GLTest3() {
        UnitConverter test = ConverterFactory.instance().create("gallon to litre");
        double result = test.convert(Math.sqrt(2));
        assertEquals(5.43058007951, result, 0.001);
    }

    @Test
    public static void ASTest1() {
        UnitConverter test = ConverterFactory.instance().create("acre to squaremetre");
        double result = test.convert(1);
        assertEquals(4046.86, result, 0.001);
    }

    @Test
    public static void ASTest2() {
        UnitConverter test = ConverterFactory.instance().create("acre to squaremetre");
        double result = test.convert(23.00004);
        assertEquals(93077.9418744, result, 0.001);
    }

    @Test
    public static void ASTest3() {
        UnitConverter test = ConverterFactory.instance().create("acre to squaremetre");
        double result = test.convert(-0.00000000001);
        assertEquals(-0.0000000404686, result, 0.001);
    }

    @Test
    public static void SSTest1() {
        UnitConverter test = ConverterFactory.instance().create("squareyard to squaremetre");
        double result = test.convert(1);
        assertEquals(0.836127, result, 0.001);
    }

    @Test
    public static void SSTest2() {
        UnitConverter test = ConverterFactory.instance().create("squareyard to squaremetre");
        double result = test.convert(-4d/3d);
        assertEquals(-1.114836, result, 0.001);
    }

    @Test
    public static void SSTest3() {
        UnitConverter test = ConverterFactory.instance().create("squareyard to squaremetre");
        double result = test.convert(Math.pow(10, 10));
        assertEquals(Math.pow(10, 10)*0.836127, result, 0.001);
    }

    //Singleton Test
    @Test
    public static void Singleton() {
        ConverterFactory multiple1 = new ConverterFactory();
        ConverterFactory multiple2 = new ConverterFactory();
        ConverterFactory multiple3 = new ConverterFactory();
        ConverterFactory multiple4 = new ConverterFactory();
        double result = multiple4.testCounter;
        assertEquals(1,result,0.001);
    }
}
