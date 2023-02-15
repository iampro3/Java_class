package Day10.Collection;

import java.util.Date;
public class Board {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	// Date 날짜/시간을 다루는 클래스
	// ctrl + shift + O : 자동 import
	private Date regDate;
	private Date updDate;

	// Atl + Shift + S 
	// 생성자
	public Board() {
		
	}

	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	// getter, setter
	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	// toString() 
	// : 객체를 출력할 때, 지정할 문자열 양식을 반환하는 메소드
	//   Object(최상위클래스)에 정의되어 있다.
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", regDate=" + regDate + ", updDate=" + updDate + "]";
		
		// Board [boardNo = 10, title = 제목1 ...]
	}
}
