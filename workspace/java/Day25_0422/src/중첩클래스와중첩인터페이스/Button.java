package 중첩클래스와중첩인터페이스;

public class Button {

	interface OnClickListener {
		void onClick();
	}
	OnClickListener listener;
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
}
