package swEngineering;	
import java.util.*;

public class swe {
	
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int func = 0;
        
      //case3 accountbook을 위한 선언들
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
                case 1: 
                	Memo[] memoManager = new Memo[1000];
					memoManager[0] = new Memo();
					for(String i = ""; !i.equals("d");)
					{
						Memo.memo_list_print(memoManager);
						System.out.println("작업을 입력해주세요.");
						i = scan.next();
						switch(i) {
							case "a":
								if(Memo.lastindex==0) {
									memoManager[Memo.lastindex].create();
								}
								else {
									memoManager[Memo.lastindex] = new Memo();
									memoManager[Memo.lastindex].create();
								}
								break;
							case "b":
								System.out.println("수정하고자 하는 메모의 번호를 입력하세요.");
								Memo.index = scan.nextInt();
								memoManager[Memo.index].update();
								break;
							case "c":
								System.out.println("삭제하고자 하는 메모의 번호를 입력하세요.");
								Memo.index = scan.nextInt();
								System.out.println(Memo.index+"번을 삭제해도 될까요? 'a.예', 'b.아니오'");
								String answer = scan.next();
								if(answer.equals("a")) {
									memoManager[Memo.index].delete(memoManager, Memo.lastindex);
									break;
								}else {
									break;}
							default:
								break;
						}
					}
					break;
                case 2:
                	do {

                        Calculator calculator = new Calculator();

                        System.out.println("a. 사칙연산");

                        System.out.println("b. 단위변환");

                        System.out.println("c. 돌아가기");

                        calculator.selected = scan.next();

                        if(calculator.selected.equals("a") || calculator.selected.equals("b")) {

                            calculator.calculating();

                            Scanner scan1 = new Scanner(System.in);

                            String clear = scan1.nextLine();

                        }

                        else break;

                    }while(true);

                    break;
                case 3:
                	Account_book.account_list_print(account_book);

					do{						

						System.out.print("원하는 작업을 입력해주세요:");

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

							System.out.print("수정하고자 하는 가계부 번호를 입력하세요:");

							update_index = scan2.nextInt();

							account_book[update_index-1].update();

							Account_book.account_list_print(account_book);

						}

						else if(input.equals("c")){

							System.out.println("삭제하고자 하는 가계부 번호를 입력하세요:");

							delete_index = scan2.nextInt();

							account_book[delete_index-1].delete(account_book,Account_book.last_index);

							Account_book.account_list_print(account_book);

						}

						else if(input.equals("d"))

							break;

						}while(true);

						break;
                case 4:
                	 System.out.println("이용해 주셔서 감사합니다.");

                     System.exit(0);
                    
                    
                    
            }
        }while(true);
	
	}
}
