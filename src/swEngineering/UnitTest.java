package swEngineering;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

public class UnitTest {
	
	//Account_book test를 위한 선언
	Account_book[] account_book = new Account_book[10];
	
	//가계부 입력 테스트
	@Test
	public void testAccountWrite(){
		int index=0,last_index=-1;
		account_book[0] = new Account_book(null,null,0,0);
		
		System.out.println("[입력 테스트]구매 내역 입력");
		account_book[index].write();
		last_index++;
		
		assertTrue(account_book[index].name==account_book[last_index].name);
	}
	
	//가계부 삭제 테스트
	@Test
	public void testAccountDelete(){
		int index=0,last_index=1;
		String delete;
		account_book[0] = new Account_book("가방","170605",10000,0);
		account_book[1] = new Account_book("신발","171002",20000,1);
		
		System.out.println("\n[삭제 테스트]물품:"+account_book[index].name+" 구매날짜:"+account_book[index].date+" 구매가격:"+account_book[index].price);
		System.out.println("삭제하시겠습니까?\na.예  b.아니오");
		Scanner sc = new Scanner(System.in);
		delete = sc.next();
		
		if(delete.equals("a")){
			account_book[index].delete(account_book, last_index);
			assertTrue(account_book[index] == account_book[index+1]);
		}
	}

}
