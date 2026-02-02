package demos;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {
    private Calculator calculator;
    @BeforeEach
    public void setup(){
        calculator=new Calculator();
    }
    @Test
    public void testAdd(){
        assertEquals(4,calculator.add(2,2));
    }
    


}