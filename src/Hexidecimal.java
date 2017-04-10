
public enum Hexidecimal {

	/** 0 */
	x0("0000"),
	/** 1 */
	x1("0001"),
	/** 2 */
	x2("0010"),
	/** 3 */
	x3("0011"),
	/** 4 */
	x4("0100"),
	/** 5 */
	x5("0101"),
	/** 6 */
	x6("0110"),
	/** 7 */
	x7("0111"),
	/** 8 */
	x8("1000"),
	/** 9 */
	x9("1001"),
	/** 10 */
	xA("1010"),
	/** 11 */
	xB("1011"),
	/** 12 */
	xC("1100"),
	/** 13 */
	xD("1101"),
	/** 14 */
	xE("1110"),
	/** 15 */
	xF("1111");

	String BinaryNumber;

	Hexidecimal(String B) {
		BinaryNumber = B;
	}

	public static String BinaryValue(char H) {
		String HexString = "x" + H;
		return Hexidecimal.valueOf(HexString).BinaryNumber;
	}

	public char HexValue() {
		return this.name().charAt(1);
	}

	private static Hexidecimal CharToHex(char C) {
		switch (C) {
		case '0':
			return Hexidecimal.x0;
		case '1':
			return Hexidecimal.x1;
		case '2':
			return Hexidecimal.x2;
		case '3':
			return Hexidecimal.x3;
		case '4':
			return Hexidecimal.x4;
		case '5':
			return Hexidecimal.x5;
		case '6':
			return Hexidecimal.x6;
		case '7':
			return Hexidecimal.x7;
		case '8':
			return Hexidecimal.x8;
		case '9':
			return Hexidecimal.x9;
		case 'A':
			return Hexidecimal.xA;
		case 'B':
			return Hexidecimal.xB;
		case 'C':
			return Hexidecimal.xC;
		case 'D':
			return Hexidecimal.xD;
		case 'E':
			return Hexidecimal.xE;
		case 'F':
			return Hexidecimal.xF;
		default:
			return Hexidecimal.x0;
		}
	}
	
	private static Hexidecimal intToHex(int i) {
		switch (i) {
		case 0:
			return Hexidecimal.x0;
		case 1:
			return Hexidecimal.x1;
		case 2:
			return Hexidecimal.x2;
		case 3:
			return Hexidecimal.x3;
		case 4:
			return Hexidecimal.x4;
		case 5:
			return Hexidecimal.x5;
		case 6:
			return Hexidecimal.x6;
		case 7:
			return Hexidecimal.x7;
		case 8:
			return Hexidecimal.x8;
		case 9:
			return Hexidecimal.x9;
		case 10:
			return Hexidecimal.xA;
		case 11:
			return Hexidecimal.xB;
		case 12:
			return Hexidecimal.xC;
		case 13:
			return Hexidecimal.xD;
		case 14:
			return Hexidecimal.xE;
		case 15:
			return Hexidecimal.xF;
		default:
			return Hexidecimal.x0;
		}
	}

	public int DecimalValue() {
		return this.ordinal();
	}

	public static int ToDecimal(String H) {
		int Total = 0;
		for (int i = 0; i < H.length(); ++i) {
			Total = (Total << 4) | CharToHex(H.charAt(i)).ordinal();
		}
		return Total;
	}
	
	public static String FromDecimal(String D) {
		
		String Hex = "";
		int Val = Integer.parseInt(D);
		
		while (Val > 0) {
			Hex = intToHex((Val & 15)).HexValue() + Hex;
			Val = Val >> 4;
		}
		return Hex;
	}

}
