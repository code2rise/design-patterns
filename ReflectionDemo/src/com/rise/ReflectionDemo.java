package com.rise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.SpringLayout.Constraints;

public class ReflectionDemo {

	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		
		Class reflectionClass = myDog.getClass();
		System.out.println("Name : " + reflectionClass.getName());
		System.out.println("Parent : " + reflectionClass.getSuperclass().getName());
		
		try {
			Field field = reflectionClass.getDeclaredField("sniff");
			field.setAccessible(true);
			
			System.out.println(field.get(myDog));
			
			Method method1 = reflectionClass.getDeclaredMethod("getBreed", null);
			method1.setAccessible(true);
			String breed = (String) method1.invoke(myDog, null);
			System.out.println("Breed : " + breed);
			
			Constructor constructor = reflectionClass.getConstructor(null);
			Dog instance = (Dog) constructor.newInstance(null);
			instance.setName("James");
			System.out.println("Name : " + instance.getName());
			
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
