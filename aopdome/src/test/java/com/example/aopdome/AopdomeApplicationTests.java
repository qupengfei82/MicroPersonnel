package com.example.aopdome;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sun.applet.Main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class AopdomeApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(Math.round(9.5));
    }
    @Test
void test(){
        System.out.println(Math.round(-9.6));
}
@Test
    void test2(){
    List<Integer> list= Arrays.asList(new Integer[] {3,32,321});
    list.sort((a,b)->(a+""+b).compareTo(b+""+a));
    StringBuffer buf=new StringBuffer();
    list.forEach(item->buf.append(item));
    System.out.println(buf);

}
//手写一个singleton
    @Test
    void singleton(){

    }
}
