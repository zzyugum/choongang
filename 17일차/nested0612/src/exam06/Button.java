package exam06;

public class Button {

	OnClincListener listener; // 버튼에 리스너 등록
	
	void setOnClickListener(OnClincListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
		
		
	}
	
	static interface OnClincListener{
		void onClick();
	}
}
