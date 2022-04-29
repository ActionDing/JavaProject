package com.ding.collections;

import org.testng.annotations.Test;

import java.util.*;

/**
 * 类Collections以静态方法的方式提供了很多通用算法和功能，这些功能大概可以分为两类。
 *      1）对容器接口对象进行操作。
 *          ❑ 查找和替换。
 *          ❑ 排序和调整顺序。
 *          ❑ 添加和修改。
 *      2）返回一个容器接口对象。
 *          ❑ 适配器：将其他类型的数据转换为容器接口对象。
 *          ❑ 装饰器：修饰一个给定容器接口对象，增加某种性质。
 *
 * @author Actionding
 * @create 2022-04-29 16:14
 */
public class CollectionsTest {

    /**
     * 查找和替换
     */
    @Test
    public void binarySearchTest() {
        List<Integer> list = Arrays.asList(13, 32, 37, 43, 57, 65, 76, 92);
        // 二分查找 binarySearch()
        int index = Collections.binarySearch(list, 32);
        System.out.println(index);
        // 最大值 max() 最小值 min()
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println(max + ", " + min);
        // 查找元素出现次数 frequency()
        int frequency = Collections.frequency(list, 32);
        System.out.println(frequency);
        // 查找子列表 indexOfSubList() lastIndexOfSubList()
        List<Integer> target = Arrays.asList(13, 32, 37);
        int start = Collections.indexOfSubList(list, target);
        int end = Collections.lastIndexOfSubList(list, target);
        System.out.println(start + ", " + end);
        // 查看两个集合是否有交集 disjoint()
        boolean disjoint = Collections.disjoint(list, target);
        System.out.println(disjoint);
        // 替换方法 replaceAll()
        boolean success = Collections.replaceAll(list, 32, 33);
        System.out.println("success: " + success);
    }

    /**
     * 排序和调整顺序
     */
    @Test
    public void sortTest() {
        // 排序 sort()

        // 交换元素 swap()

        // 翻转列表 reverse()

        // 洗牌 shuffle()

        // 循环位移 rotate()

    }

    /**
     * 添加和修改
     */
    @Test
    public void addTest() {
        // 批量添加 addAll()

        // 批量填充固定值 fill()

        // 批量复制 copy()
    }

    /**
     * 适配器
     */
    @Test
    public void adapterTest() {
        // 空容器方法
        List<String> list = Collections.emptyList();
        Map<String, Integer> map = Collections.emptyMap();
        Set<Integer> set = Collections.emptySet();
        Iterator<Object> iterator = Collections.emptyIterator();
        // 单一对象方法
        Collection<String> coll = Collections.singleton("Code");
        List<String> list1 = Collections.singletonList("Coding");
        Set<String> set1 = Collections.singleton("Test");
        Map<String, Integer> map1 = Collections.singletonMap("Test", 123);
        // 将 Map 接口转换为 Set 接口
        Set<Object> set2 = Collections.newSetFromMap(new HashMap<>());
    }

    /**
     * 装饰器
     */
    @Test
    public void decoratorTest() {
        // 写安全unmodifiableXxx：使容器对象变为只读的，写入会抛出UnsupportedOperationException异常
        List<Object> objects = Collections.unmodifiableList(new LinkedList<>());
        Set<Object> objects1 = Collections.unmodifiableSet(new HashSet<>());
        Map<Object, Object> map = Collections.unmodifiableMap(new HashMap<>());
        // 类型安全checkedXxx：确保容器中不会保存错误类型的对象。

        // 线程安全synchronized：

    }
}
