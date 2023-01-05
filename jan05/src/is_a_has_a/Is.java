package is_a_has_a;
//클래스의 관계
/* is a,  has a의 관계
 * 
 * is a : ~은 ~이다.
 * 
 * has a : ~은 ~을 가지고 있다.
 *
 * 
 */

class Human{
	String name;
	int age;
	int gender;
}
//이 상속관계에서 학생은 사람을 상속받고 있음
//학생은 사람이다가 성립, 이러한 관계를 is a관계라고 함
class Student extends Human {
	int number;
	String major;
}

class Gun{
	String name;
	int shot;
}
//has a : 경찰은 총을 가지고 있음
// 경찰 클래스 속에 총 클래스의 객체를 멤버로 가지고 있는 경우
class Police{
	Gun gun;
}

public class Is {

}
