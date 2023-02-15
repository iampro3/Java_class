package Day12.Board.DAO;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import Day12.JDBConnection;
import Day12.Board.DTO.Board;

public class BoardDAO extends JDBConnection{
	//데이터 목록 조회
	public List<Board> selectList(){
		LinkedList<Board> boardList = new LinkedList<>();
		
		// SQL
		String sql = " SELECT * "
				   + " FROM board ";	// 자바 문자열에서 쿼리(sql 명령) 사용 시, 띄어쓰기 필수 
		try {
			stmt = con.createStatement();	//쿼리문 실행 객체 생성
			rs = stmt.executeQuery(sql);	//쿼리 실행 - 예외처리
			
			while (rs.next()) {
				Board board = new Board();
				//결과 데이터 가져오기
				//rs.getXXX("컬럼명") --> 해당컬럼의 데이터를 가져온다.
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				board.setUpdDate(rs.getTimestamp("upd_date"));
				
				boardList.add(board);
			}
		} catch (SQLException e) {	
			System.out.println("게시글 목록조회 시, 예외발생");
			e.printStackTrace();
		}			
		return boardList;
	}//게시글 목록 조회 끝
	
	// 데이터 등록
	public int insert(Board board) {
		int result = 0;
		String sql = "INSERT INTO board(title, writer, content)"
					+ "VALUE(?,?,?)";
		try {
			psmt = con.prepareStatement(sql);			//쿼리 실행 객체 생성
			psmt.setString(1, board.getTitle());		//1번 ?에 제목을 맵핑
			psmt.setString(2, board.getWriter());		//2번 ?에 작성자을 맵핑
			psmt.setString(3, board.getContent());		//3번 ?에 내용을 맵핑
			result = psmt.executeUpdate();				//sql 실행요청, 적용된 데이터 개수 받아옴
														//게시글 1개 쓰기 성공 시, result=1, 실패 시, result=0
		}catch(Exception e) {
			System.out.println("게시글 등록 시, 예외 발생");
			e.printStackTrace();
		}
		//글쓰기 성공
		if(result > 0) {
			System.out.println("\"" + board.getTitle() + "\" 게시글이 작성되었습니다.");			
		}else {
			System.out.println("게시글 등록에 실패하였습니다.");
		}
		return result;
	}	//데이터 등록 끝
		
	//데이터 수정
	public int update(Board board) {
		int result =0;
		String sql = " UPDATE board "
					+" SET title =  ? "
					+"     , writer = ? "
					+"     ,upd_date = now() "
					+" WHERE board_no = ? ";
		//Mysql - now()합수 : 현재 날짜, 시간을 반환
		
		try {
			psmt = con.prepareStatement(sql);		//쿼리 실행 객체 생성
			psmt.setString(1, board.getTitle());	//1번 ?에 제목을 맵핑
			psmt.setString(2, board.getWriter());	//2번 ?에 작성자을 맵핑
			psmt.setString(3, board.getContent());	//3번 ?에 내용을 맵핑
			psmt.setInt(4, board.getBoardNo());		//sql 실행요청, 적용된 데이터 개수 받아옴
													//게시글 1개 쓰기 성공 시,
			
			result = psmt.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("게시글 수정 시, 예외발생");
			e.printStackTrace();
		}
		//글수정 성공
		if(result > 0){
			System.out.println("게시글이 수정되었습니다.");			
		//글수정 실패
		}else {
			System.out.println("게시글 수정에 실패하였습니다.");
		}		
		return result;
	}	//데이터 수정 끝
	//데이터 삭제
	public int delete(int boardNo) {
		
		int result =0;
		String sql = " DELETE FROM board "
					+" WHERE board_No = ? ";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, boardNo);
			result = psmt.executeUpdate();
		}catch (Exception e) {
			System.out.println("게시글 삭제 시, 예외 발생");
			e.printStackTrace();
		}
		//글 삭제 성공		
		if(result>0) {
			System.out.println("게시글이 삭제되었습니다.");
		}
		//글 수정 삭제
		else {
			System.out.println("게시글 삭제에 실패했습니다.");
		}
		return result;
	}//데이터 삭제 끝
	//데이터 조회
	public Board select(int boardNo) {
		Board board = new Board();
		
		String sql = " SELECT * "
					+" FROM board "
					+" WHERE board_no = ? ";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, boardNo);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				board.setBoardNo(rs.getInt("boardNo"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("writer"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				board.setUpdDate(rs.getTimestamp("upd_date"));
			}
			else {
				System.out.println(boardNo +" 번 게시글이 존재하지 않습니다.");
				board = null;
			}
		}catch(Exception e) {
			System.out.println("게시글 조회 시, 예외 발생");
			e.printStackTrace();
		}
		return board;
	}
}
