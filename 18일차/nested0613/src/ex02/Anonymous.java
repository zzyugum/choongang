package ex02;

public class Anonymous {

		Person field = new Person() {
			void work() {
				System.out.println("출근 합니다.");
			}

			@Override
			void wake() {

				System.out.println("6시에 일어납니다.");
				work();
			}
			};
		Person method1 = new Person() {
		
			void walk() {
				System.out.println("산책 합니다.");
			}

			@Override
			void wake() {

				System.out.println("7시에 일어납니다.");
				walk();
		}

				
	
		};
}
			
