package Day07.Ex03_MultipleInterface;

//검색 인터페이스
public interface Searchable {
	
	//채널검색
	//검색어에 해당하는 채널번호를 반환
	int channelSearch(String keyword);
		
	//컨텐츠 검색
	//검색어에 해당하는 컨텐츠들을 반환
	String[] contentSearch(String keyword);
}
