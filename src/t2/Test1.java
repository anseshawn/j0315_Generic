package t2;

class MyClass<T> { // 하위타입 지정하기
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class Test1 {
	public static void main(String[] args) {
		// <> 안에는 무조건 객체타입(String,Integer,Double..)
		// MyClass<String> mc1 = new MyClass<String>();	// 정석
		MyClass<String> mc1 = new MyClass<>();	// 실무
		mc1.setT("안녕하세요");
		System.out.println("mc1 : "+ mc1.getT());
		System.out.println();
		
		MyClass<Integer> mc2 = new MyClass<>(); // 지정한 타입만 넣을 수 있다
		mc2.setT(100);
		System.out.println("mc2 : "+ mc2.getT());
		System.out.println();
	}
}
