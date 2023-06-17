package ex02;

public class A {

	Parent field = new Parent() {
		int childField;
		void childMethod() {}
		@Override
		void ParentMethod() {}
		
	};
	
	void method3() {
		field.ParentMethod();
		
	}
	void method2(Parent parent) {}
	void method() {
		
		
		method2(new Parent() {	
		int childField;
		void childMethod() {}
		@Override
		void ParentMethod() {}
		}
	);
		Parent localVer = new Parent() {
			int childField;
			void childMethod() {}
			@Override
			void ParentMethod() {}
			
		};
			
	}
}
