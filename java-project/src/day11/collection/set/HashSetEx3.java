package day11.collection.set;

import java.util.HashSet;
import java.util.Set;
//import java.lang.*; // 자동 이포트

class Person { //extends Object { => 생략됨
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age; // return Objects.hash(name, age);
	}  // name의 주소가 같다는 해쉬코드도 명시해줘야 한다 => 문자열의 특수성

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) {  // instanceof(연산자)
			Person temp = (Person)obj;
			return name.equals(temp.name) && age == temp.age;
		}
		return false; 
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}
	
}  // Person end

// Set : 순서 없고 중복허용하지 않음
public class HashSetEx3 {
	public static void main(String[] args) {
		
		Set set = new HashSet();  // 타입 파라미터를 넣어주지 않으면 모든 데이터를 받아준다
		
		set.add(new String("happy"));
		set.add(new String("happy"));
		set.add(new String("virus"));
		
		set.add(new Double(12.34));
		set.add(new Double(12.));
		set.add(new Double(12.34));
		
		Person ps = new Person("aaa", 10);
		set.add(ps);
		set.add(new Person("David", 10));
		set.add(new Person("David", 33));
		set.add(new Person("David", 10));  // 같은 데이터가 들어왔으므로 이전 데이터에 덮어씌워짐
		set.add(new Person("David", 22));
		
		System.out.println(set);
		
//		A a = new A();
//		B b = new B();
//		A bb = new B();
//		
//		System.out.println(b instanceof A);  // A가 b로 객체생성이 되는가?
//		System.out.println(b instanceof B);
//		System.out.println(a instanceof A);
//		System.out.println(a instanceof B);  // false
	}
}

class A {
	String name;
}

class B extends A {
	
}