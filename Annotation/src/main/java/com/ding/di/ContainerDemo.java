package com.ding.di;

/**
 * @author Actionding
 * @create 2022-04-26 17:48
 */
public class ContainerDemo {
    public static void testSimpleContainer() {
        ServiceA a = SimpleContainer.getInstance(ServiceA.class);
        a.callB();
        ServiceB b = SimpleContainer.getInstance(ServiceB.class);

        if(b != a.getB()){
            System.out.println("SimpleContainer: different instances");
        }
    }

    public static void testSimpleContainer2(){
        ServiceA a = SimpleContainer2.getInstance(ServiceA.class);
        a.callB();

        ServiceB b = SimpleContainer2.getInstance(ServiceB.class);

        if(b == a.getB()){
            System.out.println("SimpleContainer2: same instances");
        }
    }

    public static void main(String[] args) {
        testSimpleContainer2();
    }
}
