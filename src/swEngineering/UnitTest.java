package swEngineering;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

public class UnitTest {

	
	//Memo test�� ���� ����
	Memo[] memo = new Memo[2];
	
	//Memo create �׽�Ʈ
	@Test
	public void testMemoWrite(){
		Memo.lastindex=0;
		memo[Memo.lastindex] = new Memo("�׽�Ʈ");
		
		System.out.println("Memo �Է� Test('�׽�Ʈ'�� ������ �޸� �Է����ּ���.)");

		memo[Memo.lastindex] = new Memo();
		memo[Memo.lastindex].create();
		
		assertTrue(memo[0].content!=memo[1].content);
	}
	
	//Memo ���� �׽�Ʈ
	@Test
	public void testMemoDelete(){
		Memo.lastindex=0;
		
		System.out.println("Memo ���� Test");

		memo[Memo.lastindex] = new Memo("1��");
		memo[Memo.lastindex] = new Memo("2��");
		
		memo[0].delete(memo, Memo.lastindex);
	
		assertTrue(Memo.lastindex == 1);
	}
	
	//**unit test of Calculator**//
	//Arithmetic test
	Arithmetic arm = new Arithmetic();
	
	@Test
	public void testAdd() {
		arm.operand_1 = 3;
		arm.operand_2 = 4;
		assertTrue(arm.add(arm.operand_1, arm.operand_2)==7);
	}	
	
	//Transformation test
	Transformation trnf = new Transformation();
	
	@Test
	public void testPoundKg() {
		trnf.unit = "pound";
		trnf.number = 1000000;
		assertTrue(trnf.poundKg(trnf.unit, trnf.number)==453592);
	}
	//**unit test of Calculator end**//
	
	
	//Account_book test�� ���� ����
		Account_book[] account_book = new Account_book[10];
		
		//����� �Է� �׽�Ʈ
		@Test
		public void testAccountWrite(){
			int index=0,last_index=-1;
			account_book[0] = new Account_book(null,null,0,0);
			
			System.out.println("[�Է� �׽�Ʈ]���� ���� �Է�");
			account_book[index].write();
			last_index++;
			
			assertTrue(account_book[index].name==account_book[last_index].name);
		}
		
		//����� ���� �׽�Ʈ
		@Test
		public void testAccountDelete(){
			int index=0,last_index=1;
			String delete;
			account_book[0] = new Account_book("����","170605",10000,0);
			account_book[1] = new Account_book("�Ź�","171002",20000,1);
			
			System.out.println("\n[���� �׽�Ʈ]��ǰ:"+account_book[index].name+" ���ų�¥:"+account_book[index].date+" ���Ű���:"+account_book[index].price);
			System.out.println("�����Ͻðڽ��ϱ�?\na.��  b.�ƴϿ�");
			Scanner sc = new Scanner(System.in);
			delete = sc.next();
			
			if(delete.equals("a")){
				account_book[index].delete(account_book, last_index);
				assertTrue(account_book[index] == account_book[index+1]);
			}
		}
		
}
