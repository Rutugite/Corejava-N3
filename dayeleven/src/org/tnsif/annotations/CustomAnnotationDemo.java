package org.tnsif.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//custom value annotation with Multi-value annotation
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface custom
{
	//abstract method
	String print()default"Rutuja";
	int Speed() default 80;
	float salary() default 75000.50f;
}
class CustomeAnnotationClass
{
	@custom(print="Hello Guys!",Speed=50,salary=65000.30f)
	public void display() {
		System.out.println("Hurrah! Its Sunday and Its Funnnnnnnnn day");
	}
}
public class CustomAnnotationDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		CustomeAnnotationClass c=new CustomeAnnotationClass();
		c.display();
		Method m=c.getClass().getMethod("display");
		custom obj=m.getAnnotation(custom.class);
		System.out.println(obj.print());
		System.out.println(obj.Speed());
		System.out.println(obj.salary());
	}

}
