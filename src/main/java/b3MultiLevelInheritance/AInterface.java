package b3MultiLevelInheritance;

public interface AInterface {

	int a = 10;
	static int b = 20;

	public void methodA1();

	default void methodA2() {

	}

	public static void methodA3() {

	}
}
