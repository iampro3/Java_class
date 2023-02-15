package Day11.Ex01_Generic;

//제네릭 기법으로 타입 매개변수 2개 지정
class keyValue<K, V>{
	
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}

public class TwoTypeGeneric {
	public static void main(String[] args) {	
	
	keyValue<String, Integer> kv = new keyValue<>();
	
	kv.setKey("Java");
	kv.setValue(100);
	
	String key = kv.getKey();
	int value = kv.getValue();
	
	System.out.println("key : " + key);
	System.out.println("value : " + value);
	
	keyValue<Integer, String> kv2 = new keyValue<>();
	kv2.setKey(100);
	kv2.setValue("Java");
	
	int key2 = kv2.getKey();
	String value2 = kv2.getValue();
	
	System.out.println("key2 : " + key2);
	System.out.println("value2 : " + value);
	
	// void : 해당 타입에는 변수를 사용하지 않도록 지정
	keyValue<String, Void> kv3 = new keyValue();
	kv3.setKey("키 값만");
	String key3 = kv3.getKey();
	System.out.println("key3 : " + key3);
	}
}
