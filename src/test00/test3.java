package test00;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		
		/* method1(); */
		/* method2(); */
		method3();

	}

	private static void method3() {
		    String jsonString = "{\"title\": \"how to get stroage size\","
		            + "\"url\": \"https://codechacha.com/ko/get-free-and-total-size-of-volumes-in-android/\","
		            + "\"draft\": false,"
		            + "\"star\": 10"
		            + "}";

		    // JSONObjet를 가져와서 key-value를 읽습니다.
		    JSONObject jObject = new JSONObject(jsonString);
		    String title = jObject.getString("title");
		    String url = jObject.getString("url");
		    Boolean draft = jObject.getBoolean("draft");
		    int star = jObject.getInt("star");

		    System.out.println("title: " + title);
		    System.out.println("url: " + url);
		    System.out.println("draft: " + draft);
		    System.out.println("star: " + star);

}
