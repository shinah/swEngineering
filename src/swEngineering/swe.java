package swEngineering;
import java.util.Scanner;


public class swe {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int func = 0;
		
		//case3 accountbook�� ���� �����
		int update_index,delete_index;
		Account_book.last_index=-1;
		Account_book[] account_book = new Account_book[100];
		account_book[0] = new Account_book(null,null,0,0);
		Scanner scan2 = new Scanner(System.in);
		
		do {
			do {
				
				System.out.println("1. Memo Manager");
				System.out.println("2. Calculator");
				System.out.println("3. Account Book");
				System.out.println("4. End");
				System.out.print(":");
				func = scan.nextInt();
				
			}while(func<0&&func>5);
			
			switch(func) {
					case 1: break;
					case 2: break;
						
					case 3: 
						Account_book.account_list_print(account_book);
						do{						
							System.out.print("���ϴ� �۾��� �Է����ּ���:");
							String input = scan2.next();
							System.out.println();
							
							if(input.equals("a")){
								Account_book.last_index++;
								if(Account_book.last_index==0){
									account_book[Account_book.last_index].write();
									account_book[Account_book.last_index].index = Account_book.last_index;
								}
								else{
									account_book[Account_book.last_index] = new Account_book(null,null,0,0);
									account_book[Account_book.last_index].write();
									account_book[Account_book.last_index].index = Account_book.last_index;
								}
								Account_book.account_list_print(account_book);
							}
							else if(input.equals("b")){
								System.out.print("�����ϰ��� �ϴ� ����� ��ȣ�� �Է��ϼ���:");
								update_index = scan2.nextInt();
								account_book[update_index-1].update();
								Account_book.account_list_print(account_book);
							}
							else if(input.equals("c")){
								System.out.println("�����ϰ��� �ϴ� ����� ��ȣ�� �Է��ϼ���:");
								delete_index = scan2.nextInt();
								account_book[delete_index-1].delete(account_book,Account_book.last_index);
								Account_book.account_list_print(account_book);
							}
							else if(input.equals("d"))
								break;
							}while(true);
							break;
					case 4: 
						System.out.println("�̿��� �ּż� �����մϴ�.");
						System.exit(0);
			
			
			
			}
		}while(true);

	}
}