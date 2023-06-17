package verify;

public class CheckBox {

	OnselectListener listener;
	
	
	

public void setOnListener(OnselectListener listener) {
		this.listener = listener;
	}

void select() {
	listener.onSelect();
}




static interface OnselectListener{
	
	void onSelect();
}
}