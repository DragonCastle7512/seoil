//봉인된 인터페이스
public sealed interface InterfaceA permits InterfaceB {
	public abstract void methodA();
}
