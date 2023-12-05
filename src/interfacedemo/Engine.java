package interfacedemo;

public interface Engine {
	static final int PRICE = 78000;//we don't have to write variable as static final they are by default
	void start();//method can be static default and abstract
	void stop();
	void acc();
default void main() {
		
	}

}
