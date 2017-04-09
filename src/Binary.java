
public enum Binary {
	
	/**0*/  B0000('0'),
	/**1*/  B0001('1'),
	/**2*/  B0010('2'),
	/**3*/  B0011('3'),
	/**4*/  B0100('4'),
	/**5*/  B0101('5'),
	/**6*/  B0110('6'),
	/**7*/  B0111('7'),
	/**8*/  B1000('8'),
	/**9*/  B1001('9'),
	/**10*/ B1010('A'),
	/**11*/ B1011('B'),
	/**12*/ B1100('C'),
	/**13*/ B1101('D'),
	/**14*/ B1110('E'),
	/**15*/ B1111('F');
	
	char HexidecimalValue;
	
	Binary(char H) {
		HexidecimalValue = H;
	}
	
	public String BinaryValue() {
		return this.name().substring(1);
	}
	
	public int DecimalValue() {
		return this.ordinal();
	}
	
}
