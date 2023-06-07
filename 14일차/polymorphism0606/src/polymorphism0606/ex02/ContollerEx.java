package polymorphism0606.ex02;

public class ContollerEx {
	
	public static void main(String[] args) {
		
		Controller controller = new Controller();
		

//		controller.setService((MemberLogin) new Login());
		controller.setService(new MemberLogin());
		controller.login.login();
		controller.setService(new Alogin());
		controller.login.login();
	}

}
