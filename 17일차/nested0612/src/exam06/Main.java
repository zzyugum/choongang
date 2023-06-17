package exam06;

public class Main {

	public static void main(String[] args) {

		
		Window w = new Window();
		w.button1.touch();
		w.button2.setOnClickListener(new Button.OnClincListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}

	});

}
}

