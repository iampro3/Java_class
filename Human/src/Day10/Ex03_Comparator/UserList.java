package Day10.Ex03_Comparator;

import java.util.Collections;
import java.util.LinkedList;

public class UserList {
public static void main(String[] args) {
	LinkedList<User> userList = new LinkedList<User>();
	
	User u1 = new User("abc1004", "홍휴먼", 20);
	User u2 = new User("ldc1004", "정휴먼", 30);
	User u3 = new User("mec1004", "오휴먼", 10);
	User u4 = new User("aic1004", "박휴먼", 30);
	User u5 = new User("xpo1004", "김휴먼", 40);
	User u6 = new User("bec1004", "이휴먼", 30);
	User u7 = new User("lwc1004", "전휴먼", 20);
	User u8 = new User("alr1004", "한휴먼", 50);
	User u9 = new User("pdc1004", "고휴먼", 20);
	User u10 = new User("ㅎbc1004", "배휴먼", 40);

	userList.add(u1);
	userList.add(u2);
	userList.add(u3);
	userList.add(u4);
	userList.add(u5);
	userList.add(u6);
	userList.add(u7);
	userList.add(u8);
	userList.add(u9);
	userList.add(u10);
	
	//Colletctions.sort(리스트, Comparator 구현객체);
	//-오버라이딩한 compare 메소드의 기준에 따라서 정렬된다.
	Collections.sort(userList, new User());
	
	for (User user : userList) {
		System.out.print("id : " + user.id);
		System.out.print(", name : " + user.name);
		System.out.print(", age: " + user.age);
		System.out.println();
	}
	}
}
