package consol;

import java.util.*;

public class MyMap {

	private Scanner scan = new Scanner(System.in);
	private Map<User, ArrayList<Board>> map = new HashMap<>();
	private ArrayList<User> group = new ArrayList<>();
	private UserManager userManager = UserManager.getUserManager();

	private final int JOIN = 1;
	private final int LEAVE = 2;
	private final int LOG_IN = 3;
	private final int LOG_OUT = 4;
	private final int INQUIRY = 5;

	private final int BEFORE = 1;
	private final int AFTER = 2;
	private final int ADD = 3;
	private final int DELETE = 4;
	private final int CHECK = 5;
	private final int EXIT = 0;

	public void run() {
		while (true) {
			printUserMenu();
//			printBoardMenu();
			int sel = inputNumber("MENU");
			runUserMenu(sel);
//			runBoardMenu(sel);
		}
	}

	private void printUserMenu() {
		System.out.println("USER");
		System.out.println("[1]회원가입");
		System.out.println("[2]회원탈퇴");
		System.out.println("[3]로그인");
		System.out.println("[4]로그아웃");
		System.out.println("[5]회원조회");
		System.out.println(map);
	}

	private void printBoardMenu() {
		System.out.println("BOARD");
		System.out.println("[1]이전");
		System.out.println("[2]이후");
		System.out.println("[3]추가하기");
		System.out.println("[4]삭제하기");
		System.out.println("[5]내용확인");
		System.out.println("[0]종료");
	}

	private int inputNumber(String message) {
		int number = -1;
		try {
			String input = scan.next();
			number = Integer.parseInt(input);
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요.");
		}
		return number;
	}

	private String inputString(String message) {
		System.out.println(message + " : ");
		return scan.next();
	}

	private void runUserMenu(int sel) {
		if (sel == JOIN) {
			joinUser();
		} else if (sel == LEAVE) {
//			leaveUser();
		} else if (sel == LOG_IN) {
//			loginUser();
		}
//		else if(sel == LOG_OUT) {}
//		else if(sel == INQUIRY) {}
	}

//	private void runBoardMenu(int sel) {
//		if(sel == BEFORE) {}
//		else if(sel == AFTER) {}
//		else if(sel == ADD) {}
//		else if(sel == DELETE) {}
//		else if(sel == CHECK) {}
//		else if(sel == EXIT) {}
//	}

	private String checkJoin() {
		String id = inputString("아이디");
		id = userManager.getUserById(id);
		return id;
	}

	private void joinUser() {
		String name = inputString("이름");
		String id = checkJoin();
		String password = inputString("비밀번호");
		
		if(id.equals("")) {
			return;
		}

		User user = new User(name, id, password);
		userManager.createUser(user);
		map.put(user, new ArrayList<Board>());
		System.out.println("회원가입완료");
	}

//	private void leaveUser() {
//		
//	}

//	private void loginUser() {
//		String id = inputString("아이디");
//		String password = inputString("비밀번호");
//	}

}
