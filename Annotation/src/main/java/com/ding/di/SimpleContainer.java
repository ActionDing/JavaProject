package com.ding.di;

import java.lang.reflect.Field;

/**
 * @author Actionding
 * @create 2022-04-26 17:41
 */
public class SimpleContainer {

    public static <T> T getInstance(Class<T> cls) {
        try {
            T obj = cls.newInstance();
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                if (f.isAnnotationPresent(SimpleInject.class)) {
                    if (!f.isAccessible()) {
                        f.setAccessible(true);
                    }
                    Class<?> fType = f.getType();
                    f.set(obj, getInstance(fType));
                }
            }
            return obj;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
