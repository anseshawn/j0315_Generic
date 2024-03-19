package t2;

class MyClass2<T, V> { // 타입 두개 지정
	private T t;
	private V v;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
}

public class Test2 {
	public static void main(String[] args) {
		// <> 안에는 무조건 객체타입(String,Integer,Double..)
		//MyClass2<String, Integer> mc1 = new MyClass2<String,Integer>();
		MyClass2<String,Integer> mc1 = new MyClass2<>();
		mc1.setT("안녕하세요"); // 위에서 T=String 이므로 에러가 나지 않음
		// mc1.setV("안녕");
		mc1.setV(100);
		System.out.println("key : "+ mc1.getT()+" , value : "+mc1.getV());
		System.out.println();
		
		MyClass2<Integer,String> mc2 = new MyClass2<>();
		mc2.setT(404);
		mc2.setV("Page Not found(요청한 페이지를 찾을 수 없습니다.)");
		System.out.println("key : "+ mc2.getT()+" , value : "+mc2.getV());
		System.out.println();
	}
}
