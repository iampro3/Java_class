package Day04;

import java.util.Iterator;

public class Ex03_Language {
	//java, html, css, javascrtips, sql, python
	// 1~6
	public static void main(String[] args) {
		int count[] = new int[6];
		for (int i = 0; i < count.length; i++) {
			count[i] = (i+1);
		}
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i] + "");
		}
		System.out.println();
		
		String language[] = {"java", "html", "css", "javascrtips", "sql", "python" };
	
		//배열.length : 배열의 길이(바열요소의 개수)
		for (int i = 0; i < language.length; i++) {
			System.out.print(language[i]+ " ");
		}
		System.out.println();
		
		//foreach - 배열의 모든 요소 반복
		for(String lang : language) {
			System.out.print(lang + " ");
		}
		System.out.println();
		}
	}

