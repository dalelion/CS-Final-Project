
public enum Hexidecimal {
	
	/**0*/  x0("0000"),
	/**1*/  x1("0001"),
	/**2*/  x2("0010"),
	/**3*/  x3("0011"),
	/**4*/  x4("0100"),
	/**5*/  x5("0101"),
	/**6*/  x6("0110"),
	/**7*/  x7("0111"),
	/**8*/  x8("1000"),
	/**9*/  x9("1001"),
	/**10*/ xA("1010"),
	/**11*/ xB("1011"),
	/**12*/ xC("1100"),
	/**13*/ xD("1101"),
	/**14*/ xE("1110"),
	/**15*/ xF("1111");
	
	String BinaryNumber;
	
	Hexidecimal(String B) {
		BinaryNumber = B;
	}
	
	public static String ToBinary(char H) {
		String HexString = "x" + H;
		return Hexidecimal.valueOf(HexString).BinaryNumber;
	}
	
	public char HexValue() {
		return this.name().charAt(1);
	}
	
	public int DecimalValue() {
		return this.ordinal();
	}

}
