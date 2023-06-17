package exam06;

public class Window {

	Button button1 = new Button();
	Button button2 = new Button();
	
	Button.OnClincListener listener =new Button.OnClincListener() {
		
		@Override
		public void onClick() {
			
			System.out.println("전화를 겁니다.");
		}
	};
	
	public Window(){
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClincListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
