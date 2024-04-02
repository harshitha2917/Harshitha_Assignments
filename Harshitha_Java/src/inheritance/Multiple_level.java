package inheritance;
//Assignment-39
interface Parent0 {
	void auth();
	void authentication();
}
interface Parent2 {
	void username();
	void password();
}
interface Parent3 {
	void username1();
	void password1();
}
interface Parent4 {
	void username2();
	void password2();
}
public class Multiple_level implements Parent0, Parent2, Parent3, Parent4 {
	public static void main(String[] args) {
	
	}
	@Override
	public void username() {
	}
	@Override
	public void password() {
	}
	@Override
	public void auth() {
	}
	@Override
	public void authentication() {
	}
	@Override
	public void username2() {
	}
	@Override
	public void password2() {
	}
	@Override
	public void username1() {
	}
	@Override
	public void password1() {
	}
}