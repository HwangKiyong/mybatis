package ch04.domain;

public class Post {	//칼럼 네임과 멤버변수 네임이 다르다.
	private String title;
	private String content;
	
	@Override
	public String toString() {
		return String.format("%s %s", title, content);
	}
}
