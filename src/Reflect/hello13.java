package Reflect;

import java.lang.reflect.Field;

public class hello13 {
	public static void main(String[] args) throws Exception {
        Class<?> demo = null;
        Object obj = null;
 
        demo = Class.forName("Reflect.Person");
        obj = demo.newInstance();
 
        Field field = demo.getDeclaredField("sex");
        field.setAccessible(true);
        field.set(obj, "ÄÐ");
        System.out.println(field.get(obj));
    }
}
