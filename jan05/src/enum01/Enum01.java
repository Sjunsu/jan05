package enum01;

//Enum : 열거타입
//열거한 데이터만 쓸 수 있음
//같은 값은 가질 수 없음
//enum은 클래스명하고 중복할 수 없음
enum Week {
	MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class Enum01 {
	public static void main(String[] args) {
		Week mon = Week.MON;
		
		var number = 10; //java 10버전에 도입된 변수 var
						 //값으로 데이터타입을 추론함
						 //지역변수로만 사용 가능
						 //꼭 초기화 후에만 사용 가능 null초기화 안됨, 배열 사용 불가

	}
}
