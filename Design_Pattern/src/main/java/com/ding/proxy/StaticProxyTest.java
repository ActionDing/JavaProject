package com.ding.proxy;

/**
 * 静态代理举例
 */
interface ClothFactory {
    void productCloth();
}

// 代理类
class ProxyClothFactory implements ClothFactory {

    private ClothFactory factory; // 用被代理类对象进行实例化

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void productCloth() {
        System.out.println("准备工作");

        factory.productCloth();

        System.out.println("收尾工作");
    }
}

// 被代理类
class NikeClothFactory implements ClothFactory {

    @Override
    public void productCloth() {
        System.out.println("Nike 生产衣服");
    }
}

public class StaticProxyTest {
    public static void main(String[] args) {
        NikeClothFactory nike = new NikeClothFactory();
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);

        proxyClothFactory.productCloth();
    }
}
