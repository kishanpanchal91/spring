package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
//by default constructor support string value to inject 
//
	public Test(String name) {
		System.out.println("Inject DI using parameter Constructor......." +name);
	}
	public Test(String name,int a) {
		System.out.println("Inject DI using two parameter Constructor (String,int)......." +name+"..."+a);
	}
	public Test(int name,String b) {
		System.out.println("Inject DI using two parameter Constructor.(int,String)......" +name+"..."+b);
	}
	public Test(int age,String email,String name) {
		System.out.println("Inject DI using parameter Constructor...(int,String,String)...." +age+":::::"+email+"::::"+name);
	}
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("resources/spring.xml");
}
}


/*

below are ambiguity becoz compiler is confuse which constructor called need indexing for this 


public Test(String name,int a) {
	System.out.println("Inject DI using two parameter Constructor (String,int)......." +name+"..."+a);
}
public Test(String name,String b) {
	System.out.println("Inject DI using two parameter Constructor.(String,String)......" +name+"..."+b);
}*/



/*
<!--by default string will inject in constructor 
<constructor-arg value="smit"/> -->


<!-- inject below param which constructor have both parameter is string 
	<constructor-arg value="123"/> 
	<constructor-arg value="smit"/> -->


<!-- called required constructor we need to use type attribute which is 
	use for choose right constructor -->


<constructor-arg value="smit" type="String" index="0"/>
<constructor-arg value="123" type="String" index="1"/>


<!--false condition : called required constructor we need to use type attribute which is 
	use for choose right constructor but we need to follow sequence it is mandatory otherwise it will giving error no match found of constructor
		
<constructor-arg value="123" type="int" />
<constructor-arg value="123" type="String" />
-->*/