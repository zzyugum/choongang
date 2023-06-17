package verify;

public class CheckBoxExam {

	public static void main(String[] args) {

		CheckBox checkBox = new CheckBox();
		checkBox.setOnListener(new CheckBox.OnselectListener() {
			
			@Override
			public void onSelect() {
		
				System.out.println("배경을 변경합니다.");
			}
		});
		checkBox.select();
		

	}

}
