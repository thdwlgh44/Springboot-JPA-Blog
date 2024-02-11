package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 응답(HTML 파일): @Controller
//인터넷 브라우저 요청은 get만 할 수 있다.

//사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {

	private static final String TAG = "HttpControllerTest: ";
	
	@GetMapping("/http/lombok")
	public String lombokTest() {
//		Member m = new Member(1, "ssar", "1234", "email");
		//생성자 순서를 지키지 않아도되고, id값 시퀀스 0부터 시작
		Member m = Member.builder().username("ssar").password("1234").email("thdwlgh44@naver.com").build();
		System.out.println(TAG+"getter: " + m.getId());
		m.setId(5000);
		System.out.println(TAG+"getter: " + m.getId());
		return "lombok test complete";
	}
	
	@GetMapping("/http/get")
	public String getTest(Member m) { //id=1&username=ssar&password=1234&email=thdwlgh44@naver.com
		return "get 요청: " +m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	
	@PostMapping("/http/post")
	public String postTest(Member m) {
		return "post 요청" +m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	
	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청";
	}
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
	
}
