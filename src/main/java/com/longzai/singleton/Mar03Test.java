package com.longzai.singleton;

public class Mar03Test {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            // 这里我们使用线程来实例化并输出hashcode值如果值不一样说明不是同一个对象(需要注意的是：就算值一样也有可能不是同一个对象)
            // 同时这里也使用了 java8新特效lambda表达式
           new Thread(()-> System.out.println(Mar03.getINSTANCE().hashCode())).start();
           // 原型：如下
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Mar03.getINSTANCE().hashCode());
//                }
//            }).start();
        }
    }
}
