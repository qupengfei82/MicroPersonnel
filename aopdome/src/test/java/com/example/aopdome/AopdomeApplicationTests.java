package com.example.aopdome;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;


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
public static void sort(int[] a,int i, int j){
        if (a==null || j==1){
            return;
        }
        if (a[i]>a[i+1]){
            int m =a[i];
            a[i]=a[i+1];
            a[i+1]=m;
        }
        if (i<j-2){
            sort(a,i+1,j);
        }else {
            sort(a,0,j-1);
        }
}
@Test
void digui(){
int[] ary={10,2,40,4,60,99};
sort(ary,0,ary.length);
for (int i:ary){
    System.out.println(i+"  ");
}
}
@Test
void jiecheng(){
    System.out.println(anInt(5));
}
public static int anInt(int i){
        if (i==1){
            return 1;
        }
        return i*anInt(i-1);
}
//手写一个singleton
    private AopdomeApplicationTests(){}
    private static final AopdomeApplicationTests st=new AopdomeApplicationTests();
    public static AopdomeApplicationTests getSingle(){
        return st;
    }
    public void getMsg(){
        System.out.println("AopdomeApplicationTests");
    }
    @Test
    void singleton(){
        AopdomeApplicationTests as=AopdomeApplicationTests.getSingle();
        as.getMsg();
    }

    //遍历 hash map
    @Test
    void forHashMap(){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(5, 20);
        map.forEach((k, v) -> System.out.println(k+"\t"+v));
    }

    /**
     * 有一对兔子，从出生后第三个月起每个月都生一对兔子，小兔子长到第四个月后每个月都生一对兔子
     * 假如兔子不死，问某个月的兔子总数为多少
     * 分析：兔子的规律为数列
     * 1、1、2、3、5、8、13、21
     * 为 Fibonacci 数列（斐波那契数列）
     */
    @Test
    void Mirror(){
        //idea 中不支持juint 测试
       /* while (true){
            int yushu= new Scanner(System.in).nextInt();
            System.out.println("第"+yushu+"个月的兔子数为："+f(yushu)+"对");
        }*/
        System.out.println(f(7));
    }
    public static int f(int x){
        if (x==1 || x==2) {
            return 1;
        }else {
            return f(x - 1) + f(x - 2);
        }
    }

    //编写一个程序，有1，2,3,4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
    @Test
    void wuchonngfu(){
        int i,j,k;
        int m=0;
        for (i=1;i<=4;i++)
            for (j=1;j<=4;j++)
                for (k=1;k<=4;k++){
                    if (i!=j&&k!=j&&i!=k){
                        System.out.println(" "+i+k+j);
                        m++;
                    }
                }
        System.out.println(m+"个不重复的数字");
    }

    //有一个数值类型的数组，
    // 如何高效的将数组中的偶数和奇数分开存储，即将数组中偶数放在前面部分，奇数都放在后面部分？
    // 前提条件：不得新建数组，不能使用判断，不能使用位运算。
    // 用三元运算符判断下奇偶性，然后排序
    @Test
    void array(){

    }

}
