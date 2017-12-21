package swEngineering;
import java.util.Scanner;

public class Memo {
	
	static Scanner scan = new Scanner(System.in);
	
	String content;
	static int index = 0;
	static int lastindex = 0;
	
	//생성자
	public Memo(){
		this.content = null;
	}
	
	public Memo(String a) {
		this.content = a;
		lastindex++;
	}
	
	//작성
	public void create() {
		System.out.println("메모를 작성하세요.");
		this.content = scan.next();
		lastindex ++;
	}
	
	//수정
	public void update() {
		System.out.println("메모를 작성하세요.");
		this.content = scan.next();
	}
	
	//삭제
	public void delete(Memo[] memo, int last) {
		for(int k = this.index; k<last-1; k++) {
			memo[k].content = memo[k+1].content;
		}
		lastindex--;
	}
	
	//출력
	public static void memo_list_print(Memo[] memo) {
		System.out.println("MemoList");
		if(memo[0].content!=null) {
			for(int i=0; i<lastindex; i++) {
				System.out.println(i + "." + memo[i].content);}
		}else {
			System.out.println("작성된 메모가 없습니다.");
		}
		System.out.println("‘a. 작성’, ‘b.수정’, ‘c.삭제’ ‘d.돌아가기’");
	}

}