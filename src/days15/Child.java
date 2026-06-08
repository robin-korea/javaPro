package days15;

import days16.Parent;

// days16.Parent 와 다른 패키지 외부
public class Child extends Parent{

	void modifierAccessTest() {
		this.pub = 1;
		this.pro = 1; // 패키지내부(default) X + 상속이어서 접근 가능

	}

}
