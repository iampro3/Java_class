package Day13;

import java.io.File;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Ex07_File {
	
	private static final String SimpleDateFormat = null;
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		System.out.println("######### 파일 관리 #########");
		System.out.println("1. 디렉토리 생성");
		System.out.println("2. 디렉토리 파일목록");
		System.out.println("3. 파일정보 조회");
		System.out.println("4. 파일 삭제");
		System.out.println("5. 폴더 삭제");
		System.out.println("0. 종료");
		System.out.println("######### 번호 : ");
	}
	
	public static void makeDirectory( String filePath) {
		File file = new File(filePath);
		//폴더 생성 메소드 	:내 경로명을 입력하고, '\폴더명'을 직접 입력한다.
		//mkdir()		:생성할 경로의 상위 경로까지 기존 디렉토리가 존재해야 한다.
		//mkdirs()		:생성할 경로의 상위 경로 까지 디렉토리를 생성
		
		if(file.mkdir()) {
			System.out.println("디렉토리 생성 성공!");
		}
		else {
			System.out.println("디렉토리 생성 실패!");
		}
		System.out.println("경로 : " + filePath);
	}
	
	/**
	 * 디렉토리 파일 목록 가져오기
	 * @param filePath
	 * @return
	 */
	public static File[] listDirectory(String filePath) {
		System.out.println(filePath);
		System.out.println("-------------------------------------");
		File file = new File(filePath);
		File[] fileList = file.listFiles();		//하위 경로에 있는 파일 목록
		
		for (File subFile : fileList) {
			long update = subFile.lastModified();
			Date date = new Date(update);
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss");
			String updateDate = sdf.format(date);
			
			System.out.print(subFile.getName() + "\t\t");	//파일명
			System.out.print(subFile.length() + "\t\t" );	//파일크기
			System.out.print(updateDate + "\t\t" );		//수정일자
			System.out.println();
		}
		System.out.println("-------------------------------------");
		
		return fileList;
	}
	
	/**
	 * 파일 정보 조회
	 * @param filePath
	 */
	public static void fileInfo(String filePath) {
		File file = new File(filePath);
		System.out.println("파일 종류 : ");
		if(file.isDirectory()) System.out.println("디렉토리");
		if(file.isFile())System.out.println("일반 파일");
		
		System.out.println("파일명 : \t\t" + file.getName() );
		System.out.println("파일크기 : \t" + file.length() );
		
		long update = file.lastModified();
		Date date = new Date(update);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String updateDate = sdf.format(date);
		System.out.println("수정일자 : \t" + updateDate);
	}
	
	public static void deleteFile(String filePath) {
		
		File file = new File(filePath);
		
		//파일 존재 여부 확인
		if(file.exists()) {
			//delete()_
			//-파일 삭제 성공 : true
			//-파일 삭제 실패 : false
			
			if(file.delete()) {
				System.out.println("파일 삭제 성공!!!");
			}else{
				System.err.println("파일 삭제 실패!!!");
				}
			}
		else{
			System.err.println("파일이 존재하지 않습니다.");			
		}
	}
	
	/**
	 * 폴더 삭제하는 메소드
	 * @param filePath
	 */
	public static void deleteDirectory(String filePath) {
		
		File file = new File(filePath);
		File[] subFiles = file.listFiles();
		//하위 경로에 파일들이 있으면
		if(subFiles != null) {
			//하위 경로의 파일들을 삭제
			for (File subFile : subFiles) {
				//재귀함수
				deleteDirectory(subFile.getPath());
			}
		}		
		//폴더 삭제
		if(file.delete()) {
			System.out.println("폴더 삭제 성공!");
		}
		else {
			System.err.println("폴더 삭제 실패!");
		}
	}
	
	public static void main(String[] args) {
		int menuNo;
		
		do {
			menu();
			menuNo = sc.nextInt();
			sc.nextLine();
			
			if(menuNo == 0) break;
			
			System.out.println("파일 경로 : ");
			String filePath = sc.nextLine();
			
			switch(menuNo) {
			case 1:
					//디렉토리 생성 - 입력 : 디렉토리 경로
					makeDirectory(filePath);
					break;
			case 2:	
					//디렉토리 파일 목록 - 입력: 디렉토리 경로 
					listDirectory(filePath);
					break;
			case 3:
					// 파일 정보 조회
					fileInfo(filePath);
					break;
			case 4:
					//파일 삭제
					deleteFile(filePath);
					break;
			case 5:	
					//폴더 삭제 - 입력: 디렉토리 경로 
					deleteDirectory(filePath);
					break;
					
			default:
					break;
			}				
		}while(true) ;
				
	}
}
