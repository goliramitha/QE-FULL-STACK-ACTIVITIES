package demos;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderTester {
    @Test
    @Order(1)
    public void test0(){
        System.out.print("test0");
    }

    @Test
    @Order(4)
    public void test1(){
        System.out.print("test1");
    }

    @Test
    @Order(2)
    public void test2(){
        System.out.print("test2");
    }

    @Test
    @Order(3)
    public void test3(){
        System.out.print("test3");
    }

    @Test
    @Order(4)
    public void test4(){
        System.out.print("test4");
    }

    @Test
    @Order(5)
    public void test5(){
        System.out.print("test5");
    }



}
