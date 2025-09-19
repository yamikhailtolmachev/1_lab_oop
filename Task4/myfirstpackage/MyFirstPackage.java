class MySecondClass {
	// два приватных поля типа int
	private int p1, p2;
	
	// методы для получения значений полей
	public int getp1() {
		return p1;
	}
	public int getp2() {
		return p2;
	}
	// методы для модификации значений полей
	public void setp1(int p1) {
		this.p1 = p1;
	}
	public void setp2(int p2) {
		this.p2 = p2;
	}
	
	// конструктор, создающий объект и инициализирующий значения полей
	public MySecondClass(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	// метод с возвращаемым типом int, реализующий над этими числами целочисленное деление
	public int division() {
		return p1/p2;
	}
}