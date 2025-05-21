package 람다식;

/* FuntionalInterface 애노테이션
 * 1. 추상매서드가 딱 하나만 올 수 있다.
 * 2. 함수형 인터페이스
 * 3. 애노테이션이 없더라도 추상매서드가 하나라면, 람다식 인터페이스
 */
@FunctionalInterface
public interface MyfunInterface {
	public void method();
}
