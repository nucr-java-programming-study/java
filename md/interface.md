# 인터페이스와 추상 클래스

## 인터페이스의 기본과 그 의미

- 구현된 사항은 없고 다른 클래스를 구현할 때 기본이 되는 틀을 제공하는 일종의 추상 메소드
    - 추상 메소드 (Abstract Methods) : 메소드의 몸체가 비어있는 메소드
    - 추상 메소드와 상수만 포함할 수 있음
    - 자바의 다형성을 극대화할 수 있음
- 인터페이스의 사전적 의미로는 “연결점", “접점”으로 둘 사이를 연결하는 매개체
    - 여기서 둘 이란? 기본이 되는 틀과 그 구현체

---

1. 인터페이스를 대상으로는 인스턴스 생성이 불가능함 다른 클래스에 의해 상속될 뿐
2. 이 행위는 상속이 아닌 구현 `implements` (문법관계는 상속과 동일하지만 본질은 '구현'임)
    - 구현할 인터페이스를 명시할 때 키워드 `implements`를 사용한다
    - 한 클래스는 둘 이상의 인터페이스를 동시에 구현할 수 있다
    - 상속과 구현은 동시에 가능하다

    ```java
    class Robot extends Machine implements Movable, Runnable{...}
    ```

3. 인터페이스의 형을 대상으로 참조변수의 선언이 가능함
    - 참조변수를 대상으로 인터페이스에 정의된 추상 메소드를 호출할 수 있음

    ```java
    Printable prn = new Printer();
    ```

>💡 **참조변수 (Reference Variable)**
>- 실제 값이 아닌 주소값은 저장하는 변수
>- `new`를 통해 Heap영역에 메모리 주소값을 할당하여 새로운 공간을 생성하고 실제 값을 저장
>- Stack영역엔 주소값을 저장함
>

4. 인터페이스의 추상 메소드와 이를 구현하는 메소드 사이에 오버라이딩 관계가 성립한다 (`@Override`)

## 인터페이스의 문법 구성

- 인터페이스의 모든 메소드는 `public`
- 인터페이스 내에 선언되는 변수는 반드시 선언과 동시에 값으로 초기화 해야함
- 모든 변수는 public, static, final이 선언된 것으로 간주함
- 인터페이스를 구현하는 클래스는 인터페이스에 존재하는 모든 추상 메소드 를 구현해야함 (하나라도 구현하지 않으면 인스턴스 생성이 불가능함)
- 자바에서는 인터페이스 상속 지원
    - 두 클래스 사이의 상속은 `extends`
    - 두 인터페이스 사이의 상속도 `extends`
    - 인터페이스와 클래스 사이의 구현만 `implements`로 명시

## 인터페이스에 존재할 수 있는 것

- *상수* : 인터페이스에서 값을 정해줄테니 함부로 바꾸지 말고 제공해주는 값만 참조해라 (절대적)
- *추상 메소드* : 가이드만 줄테니 추상메소드를 오버라이팅해서 재구현해라. (강제적)
- *디폴트 메소드* : 인터페이스에서 기본적으로 제공해주지만, 맘에 안들면 각자 구현해서 써라. (선택적)
- *static 메소드* : 인터페이스에서 제공해주는 것으로 무조건 사용 (절대적)

```java
public interface 인터페이스명 {
	 //상수
	타입 상수명 = 값;
	
	//추상 메소드
	타입 메소드명(매개변수, ... );
	
	//디폴트 메소드
	default 타입 메소드명(매개변수, ... ){
	  //...구현부
	}
	
	//static 메소드
	static 타입 메소드명(매개변수) {
	  //...구현부
	}
}
```

### 인터페이스의 디폴트 메소드

- 자바 8에서 도입
- 인터페이스 내에 정의되어있는 그 자체로 완전한 메소드이기 때문에 이를 구현하는 클래스가 오버라이딩 하지 않아도 됨
- 이전에 구현된 구현체에 영향을 미치지 않기 위함

### 인터페이스의 static 메소드(클래스 메소드)

- 자바 8에서 도입
- 클래스에 정의하는 static 메소드와 유사함
- public에 선언된 것으로 간주함

### 인터페이스 대상의 instanceof 연산

- 직접 혹은 간접적으로 구현한 클래스의 인스턴스인 경우 return true

### 인터페이스의 또 다른 사용 용도 : Marker Interface

- 클래스에 특별한 표식을 다는 용도로 인터페이스를 사용하기도함

## 추상 클래스

- 하나 이상의 추상 메소드를 갖는 클래스
- 인스턴스 생성도 불가능하며 다른 클래스에 의해서 추상 메소드가 구현되어야함

```java
public abstract class House{
	public void methodOne(){
		System.out.println("method one");
	}
	public abstract void methodTwo(); // 추상 메소드
}

public class MyHouse extends House{
	@Override
	public void methodTwo(){
		System.out.println("method two");
	}
}
```

---

### 참고

윤성우의 열혈 Java 프로그래밍 (Chapter 17)

[https://colossus-java-practice.tistory.com/7](https://colossus-java-practice.tistory.com/7)

[https://limkydev.tistory.com/197](https://limkydev.tistory.com/197)

[https://www.youtube.com/watch?v=T1BJzC9xb0g](https://www.youtube.com/watch?v=T1BJzC9xb0g)