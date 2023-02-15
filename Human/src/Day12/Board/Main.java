package Day12.Board;

import java.sql.Date;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import java.util.date;

import Day12.Board.DAO.BoardDAO;
/*
 * 게시판 프로그램
 * -메뉴판
 * -게시글 목록
 * -게시글 등록
 * -게시글 읽기
 * -게시글 쓰기
 * -게시글 수정
 * -게시글 삭제
 */
import Day12.Board.DTO.Board;
 
	public class Main {
		
		static Board board;
		static List<Board> boardList;	//게시글 목록
		static Scanner sc = new Scanner(System.in);
		static BoardDAO dao = new BoardDAO();		
		
		// 메뉴판
		public static void menu() {
			System.out.println("########## 게시판 ##########");
			System.out.println("1. 게시글 쓰기");
			System.out.println("2. 게시글 수정");
			System.out.println("3. 게시글 삭제");
			System.out.println("4. 게시글 조회");
			System.out.println("5. 게시글 목록");
			System.out.println("0. 종료하기");
			System.out.print("########## 입력: ");
		}
		/**
		 * 전체 게시글 조회 메소드
		 * -DAO 객체로 데이터 전체 조회 요청 메소드를 호출한다.
		 * -List<Board>타입의 게시글 목록을 가져온다.
		 * -게시글 목록 전체 출력 메소드를 호출한다.
		 */
		// 
		public static void menuList() {
			System.out.println("##### [전체목록] #####");
			boardList = dao.selectList();
			ptintAll();			
			}	
		
		/*
		 * 게시글 조회 메소드
		 * -조회할 게시글 번호를 입력받는다.
		 * -DAO 객체의 데이터 조회 요청 메소드를 호출한다.
		 * -Board 객체로 조회된 게시글 정보를 받아온다.
		 * -print()메소드를 호출하여 출력한다.
		 */
		public static void menuSelect() {
			System.out.println("######### [글 조회] #########");
			System.out.println("게시글 번호 : ");
			int boardNo = sc.nextInt();
			sc.nextLine();
			
			board = dao.select(boardNo);
			print(board);
		}
		/**게시글 쓰기
		 * -제목, 작성자, 내용을 이볅받아 Board 객체를 생성하고
		 * DAO 객체의 데이터 삽입 요청 메소드를 호출한다.
		 * @param board
		 */		 
		public static void menuWrite() {
				System.out.println("######## [글쓰기] ########");
	
				System.out.println("제목 : ");
				String title = sc.nextLine();
	
				System.out.println("작성자 : ");
				String writer = sc.nextLine();
	
				System.out.println("내용 : ");
				String content = sc.nextLine();
				
				board = new Board(title, content, writer);
				dao.insert(board);		//데이터 추가 요청
				
		}
		
		/**
		 * 게시글 수정 메소드 
		 * -수정할 게시글 번호를 입력받는다.
		 * -제목, 작성, 내용을 입력받아 Board 객체 를 생성한다.
		 * -DAO 객체를 데이터 수정 메소드를 호출한다.
		 * 
		 */
		public static void menuUpdate() {
			System.out.println("####### [글수정] #######");
			System.out.print("게시글 번호 : ");
			int boardNo = sc.nextInt();
			sc.nextLine();
			
			System.out.println("제목 : ");
			String title = sc.nextLine();
			System.out.println("작성자 : ");
			String writer = sc.nextLine();
			System.out.println("내용 : ");
			String content = sc.nextLine();
			
			board = new Board(title, content, writer);
			board.setBoardNo(boardNo);
			dao.update(board);
		}
		
		/*
		 * 게시글 삭제 메소드
		 * -삭제할 게시글 번호를 입력받는다.
		 * -DAO 객체의 데이터 삭제 요청 메소드를 호출한다.
		 */
		public static void menuDelete() {
			System.out.println("########## [글삭제] ##########");
			System.out.println("게시글 번호 : ");
			int boardNo=sc.nextInt();
			sc.nextLine();
			
			dao.delete(boardNo);
		}
		/*
		 * 게시글 출력 메소드
		 * -Board 타입의 객체를 지정한 문자열 형식에 따라 출력하는 메소드
		 * 
		 */
		//게시글 출력 메소드
		private static void print(Board board) {
			//게시글 정보가 없으면 미출력
			if(board == null) {
				System.out.println("게시글 정보가 존재하지 않습니다.");
				return;
			}
			System.out.println("[게시글 번호 : ]" + board.getBoardNo() + "]------------------");
			System.out.println("-제목 :" + board.getTitle());
			System.out.println("-작성자 :" + board.getWriter());
			System.out.println("-내용 :" + board.getContent());
			
			String dateFormat = "yyyy/MM/dd hh:mm:ss";
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			Date reg_date = (Date) board.getRegDate();	//++++(Date)추가 -선생님 코드 확인필요
			Date upd_date = (Date) board.getUpdDate();	//++++(Date)추가 -선생님 코드 확인필요
			
			String regDate = sdf.format(reg_date);
			String updDate = sdf.format(upd_date);
			
			System.out.println("-등록일자 : " + regDate);
			System.out.println("-수정일자 : " + updDate);
			System.out.println("-----------------------");
		}
		/**
		 * 게시글 전체 출력 메소드
		 * -List<Board> 타입의 게시글 전체 목록을 반복하여 
		 * 각 객체를 인자로 개별 출력 메소드를 호출한다.
		 */
		
		private static void ptintAll() {
			if(boardList.isEmpty()) {
				System.out.println("존재하는 게시글이 없습니다.");
				return;
			}
			for (Board board : boardList) {
				print(board);
			}
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int menuNo = 0;
			int count = 0;		// 게시글 개수
			
			// 메뉴판 반복하여 출력
			do {
				menu();	//메뉴판 호출				
				menuNo = sc.nextInt();	// 메뉴번호 입력
				sc.nextLine();		// 엔터를 버퍼에서 빼준다.
				
				if(menuNo == 0) {
					 System.out.println("프로그램을 종료합니다....");
					 break;
				}

				// 메뉴 선택
				switch (menuNo) {
					// 게시글 목록
					case 1:	menuWrite();	//게시글 쓰기
							break;
				
					case 2: menuUpdate();	//게시글 수정
							break;
						
					case 3:	menuDelete();	//게시글 삭제
							break;
						
					case 4:	menuSelect();	//게시글 조회
							break;
						
					case 5: menuList();	// 게시글 목록
							break;						
					default: System.out.println("(0~5) 사이의 숫자를 입력해주세요!");
							break;
					}
				
			} while (true); 
			
			sc.close();
		}

}
