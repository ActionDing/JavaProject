package com.ding.proxy;

/**
 * @author Actionding
 * @create 2022-04-26 18:08
 */
public class SimpleStaticProxyDemo {

    interface IService {
        void sayHello();
    }

    static class RealService implements IService {
        @Override
        public void sayHello() {
            System.out.println("hello");
        }
    }

    static class TraceProxy implements IService {
        private IService realService;

        public TraceProxy(IService realService) {
            this.realService = realService;
        }

        @Override
        public void sayHello() {
            System.out.println("entering sayHello");
            this.realService.sayHello();
            System.out.println("leaving sayHello");
        }
    }

    public static void main(String[] args) {
        new TraceProxy(new RealService()).sayHello();
    }
}
