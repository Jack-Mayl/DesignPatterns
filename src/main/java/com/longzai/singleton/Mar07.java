package com.longzai.singleton;

/**
 * 枚举单列
 * 不仅仅可以解决线程同步 还可以防止反序列化
 */
public enum Mar07 {
    INSTANCE;

    public  void m(){System.out.println("m");}

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            // 这里我们使用线程来实例化并输出hashcode值如果值不一样说明不是同一个对象(需要注意的是：就算值一样也有可能不是同一个对象)
            // 同时这里也使用了 java8新特效lambda表达式
            new Thread(()-> System.out.println(Mar07.INSTANCE.hashCode())).start();;
        }
    }
}
