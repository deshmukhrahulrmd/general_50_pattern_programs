package patternsPrograms;

public class ImplementationOfPatterns implements RequerimentsOfPatterns {

	@Override
	public final void starPatterns(int num, char symbol) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}

		System.out.println(" ===== Rhombus Pattern- I =====");
		ImplementationOfPatterns.rhombusPatternI(num, symbol);

		System.out.println(" ===== Rhombus Pattern- II =====");
		ImplementationOfPatterns.rhombusPatternII(num, symbol);
	}

	public final static void rhombusPatternI(int num, char symbol) {
		for (int i = 1; i <= num; i++) {
			for (int s = 1; s <= (num - i); s++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= num; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
	}

	public static final void rhombusPatternII(int num, char symbol) {
		for (int i = num; i >= 1; i--) {
			for (int s = 1; s <= (num - i); s++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= num; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
	}

	@Override
	public final void rightAngledTriangle(int num, char symbol) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
		System.out.println("3) ===== Right Angle Triangle Pattern- II =====");
		ImplementationOfPatterns.rightAngledTriangleI(num);

		System.out.println("4) ===== Right Angle Triangle Pattern- III =====");
		ImplementationOfPatterns.rightAngledTriangleII(num);

		System.out.println("5) ===== Odd Serise Right Angle Triangle Pattern- I =====");
		ImplementationOfPatterns.oddSeriseRightAngledTriangleI(num, symbol);

		System.out.println("6) ===== Odd Serise Right Angle Triangle Pattern- II =====");
		ImplementationOfPatterns.oddSeriseRightAngledTriangleII(num);

		System.out.println("7) ===== Odd Serise Right Angle Triangle Pattern- III =====");
		ImplementationOfPatterns.oddSeriseRightAngledTriangleIII(num);

		System.out.println("8) ===== Odd Serise with No Head Right Angle Triangle Pattern- I =====");
		ImplementationOfPatterns.oddSeriseNoHeadRightAngledTriangleI(num, symbol);

		System.out.println("9) ===== Odd Serise with No Head Right Angle Triangle Pattern- II =====");
		ImplementationOfPatterns.oddSeriseNoHeadRightAngledTriangleII(num);

		System.out.println("10) ===== Odd Serise with No Head Right Angle Triangle Pattern- III =====");
		ImplementationOfPatterns.oddSeriseNoHeadRightAngledTriangleIII(num);

		System.out.println("11) ===== Odd Serise with No Head Right Angle Triangle Pattern- III =====");
		ImplementationOfPatterns.oddSeriseNoHeadRightAngledTriangleIII(num);

		System.out.println("12) ===== Character Right Angle Triangle Pattern- I =====");
		ImplementationOfPatterns.characterPatternRightAngledTriangleI(num);

		System.out.println("13) ===== Character Right Angle Triangle Pattern- II =====");
		ImplementationOfPatterns.characterPatternRightAngledTriangleII(num);

		System.out.println("14) ===== Character Right Angle Triangle Pattern- III =====");
		ImplementationOfPatterns.characterPatternRightAngledTriangleIII(num);

	}

	private static final void rightAngledTriangleI(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static final void rightAngledTriangleII(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static final void oddSeriseRightAngledTriangleI(int num, char symbol) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
	}

	private static final void oddSeriseRightAngledTriangleII(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static final void oddSeriseRightAngledTriangleIII(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static final void oddSeriseNoHeadRightAngledTriangleI(int num, char symbol) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= (i * 2); j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
	}

	private static final void oddSeriseNoHeadRightAngledTriangleII(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= (i * 2); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static final void oddSeriseNoHeadRightAngledTriangleIII(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= (i * 2); j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static final void characterPatternRightAngledTriangleI(int num) {
		for (int i = 1; i <= num; i++) {
			char symbol = 'a';
			for (int j = 1; j <= i; j++) {
				System.out.print(symbol++ + " ");
//				System.out.print((char)(96+j));
			}
			System.out.println();
		}
	}

	private static final void characterPatternRightAngledTriangleII(int num) {
		char symbol = 'a';
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(symbol++ + " ");
			}
			System.out.println();
		}
	}

	private static final void characterPatternRightAngledTriangleIII(int num) {
		char symbol = 'a';
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(symbol + " ");
			}
			symbol++;
			System.out.println();
		}
	}

	@Override
	public final void inversOfRightAngledTriangle(int num, char symbol) {
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}

		System.out.println("15) ===== Inverse of Right Angle Triangle Pattern- II =====");
		ImplementationOfPatterns.inversOfRightAngledTriangleI(num);

		System.out.println("16) ===== Inverse of Right Angle Triangle Pattern- III =====");
		ImplementationOfPatterns.inversOfRightAngledTriangleII(num);

		System.out.println("17) ===== Inverse of Odd Serise Right Angle Triangle Pattern- I =====");
		ImplementationOfPatterns.inversOfOddSeriseRightAngledTriangleI(num, symbol);

		System.out.println("18) ===== Inverse of Odd Serise Right Angle Triangle Pattern- II =====");
		ImplementationOfPatterns.inversOfOddSeriseRightAngledTriangleII(num);

		System.out.println("19) ===== Inverse of Odd Serise Right Angle Triangle Pattern- III =====");
		ImplementationOfPatterns.inversOfOddSeriseRightAngledTriangleIII(num);

		System.out.println("20) ===== Inverse of Odd Serise with No Head Right Angle Triangle Pattern- I =====");
		ImplementationOfPatterns.inversOfOddSeriseNoHeadRightAngledTriangleI(num, symbol);

		System.out.println("21) ===== Inverse of Odd Serise with No Head Right Angle Triangle Pattern- II =====");
		ImplementationOfPatterns.inversOfOddSeriseNoHeadRightAngledTriangleII(num);

		System.out.println("22) ===== Inverse of Odd Serise with No Head Right Angle Triangle Pattern- III =====");
		ImplementationOfPatterns.inversOfOddSeriseNoHeadRightAngledTriangleIII(num);

		System.out.println("23) ===== Inverse of Character Right Angle Triangle Pattern- I =====");
		ImplementationOfPatterns.inversOfCharacterRightAngledTriangleI(num);

		System.out.println("24) ===== Inverse of Character Right Angle Triangle Pattern- II =====");
		ImplementationOfPatterns.inversOfCharacterRightAngledTriangleII(num);

		System.out.println("25) ===== Inverse of Character Right Angle Triangle Pattern- III =====");
		ImplementationOfPatterns.inversOfCharacterRightAngledTriangleIII(num);
	}

	private static final void inversOfRightAngledTriangleI(int num) {
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static final void inversOfRightAngledTriangleII(int num) {
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static final void inversOfOddSeriseRightAngledTriangleI(int num, char symbol) {
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
	}

	private static final void inversOfOddSeriseRightAngledTriangleII(int num) {
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static final void inversOfOddSeriseRightAngledTriangleIII(int num) {
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static final void inversOfOddSeriseNoHeadRightAngledTriangleI(int num, char symbol) {
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= (i * 2); j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
	}

	private static final void inversOfOddSeriseNoHeadRightAngledTriangleII(int num) {
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= (i * 2); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static final void inversOfOddSeriseNoHeadRightAngledTriangleIII(int num) {
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= (i * 2); j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static final void inversOfCharacterRightAngledTriangleI(int num) {
		for (int i = num; i >= 1; i--) {
			char symbol = 'a';
			for (int j = 1; j <= i; j++) {
				System.out.print(symbol++ + " ");
//				System.out.print((char)(96+j));
			}
			System.out.println();
		}
	}

	private static final void inversOfCharacterRightAngledTriangleII(int num) {
		char symbol = 'a';
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(symbol++ + " ");
			}
			System.out.println();
		}
	}

	private static final void inversOfCharacterRightAngledTriangleIII(int num) {
		char symbol = 'a';
		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(symbol + " ");
			}
			symbol++;
			System.out.println();
		}
	}

	@Override
	public final void firstSpaceRightAngledTriangle(int num, char symbol) {
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}

		System.out.println("27) ===== First Space then Right Angle Triangle- II =====");
		ImplementationOfPatterns.firstSpaceRightAngledTriangleII(num);

		System.out.println("28) ===== First Space then Right Angle Triangle- III =====");
		ImplementationOfPatterns.firstSpaceRightAngledTriangleIII(num);

		System.out.println("29) ===== First Space then Right Angle Triangle (Space=2) - IV =====");
		ImplementationOfPatterns.firstSpaceRightAngledTriangleIV(num);

		System.out.println("30) ===== First Space then Right Angle Triangle- V =====");
		ImplementationOfPatterns.firstSpaceRightAngledTriangleV(num);

	}

	private static final void firstSpaceRightAngledTriangleII(int num) {
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static final void firstSpaceRightAngledTriangleIII(int num) {
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static final void firstSpaceRightAngledTriangleIV(int num) {
		int n = 1;
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" " + "  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(n++ + "  ");
			}
			System.out.println();
		}
	}

	private static final void firstSpaceRightAngledTriangleV(int num) {
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" " + " ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	@Override
	public final void inversOfFirstSpaceRightAngledTriangle(int num, char symbol) {
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}

		System.out.println("32) ===== First Space then Right Angle Triangle- II =====");
		ImplementationOfPatterns.inversOfFirstSpaceRightAngledTriangleII(num);

		System.out.println("33) ===== First Space then Right Angle Triangle- III =====");
		ImplementationOfPatterns.inversOfFirstSpaceRightAngledTriangleIII(num);

		System.out.println("34) ===== First Space then Right Angle Triangle (Space=2) - IV =====");
		ImplementationOfPatterns.inversOfFirstSpaceRightAngledTriangleIV(num);
	}

	private static final void inversOfFirstSpaceRightAngledTriangleII(int num) {
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static final void inversOfFirstSpaceRightAngledTriangleIII(int num) {
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static final void inversOfFirstSpaceRightAngledTriangleIV(int num) {
		int n = 1;
		for (int i = num; i >= 1; i--) {
			for (int k = 0; k <= (num - i); k++) {
				System.out.print(" " + "  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(n++ + "  ");
			}
			System.out.println();
		}
	}

	@Override
	public final void pyramidPattern(int num, char symbol) {
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}

		System.out.println("36) ===== Pyramid Pattern- II =====");
		ImplementationOfPatterns.pyramidPatternII(num);

		System.out.println("37) ===== Pyramid Pattern- III =====");
		ImplementationOfPatterns.pyramidPatternIII(num);

		System.out.println("38) ===== Pyramid Pattern- IV =====");
		ImplementationOfPatterns.pyramidPatternIV(num);

		System.out.println("39) ===== Pyramid Pattern- V =====");
		ImplementationOfPatterns.pyramidPatternV(num);

	}

	private static final void pyramidPatternII(int num) {
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static final void pyramidPatternIII(int num) {
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static final void pyramidPatternIV(int num) {
		int n = 1;
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(n++ + "  ");
			}
			System.out.println();
		}
	}

	private static final void pyramidPatternV(int num) {
		char ch = 'A';
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

	@Override
	public final void inversOfPyramidPattern(int num, char symbol) {
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}

		System.out.println("41) ===== Invers of Pyramid Pattern- II =====");
		ImplementationOfPatterns.inversOfPyramidPatternII(num);

		System.out.println("42) ===== Invers of Pyramid Pattern- III =====");
		ImplementationOfPatterns.inversOfPyramidPatternIII(num);

		System.out.println("43) ===== Invers of Pyramid Pattern- IV =====");
		ImplementationOfPatterns.inversOfPyramidPatternIV(num);

		System.out.println("44) ===== Invers of Pyramid Pattern- V =====");
		ImplementationOfPatterns.inversOfPyramidPatternV(num);
	}

	private static final void inversOfPyramidPatternII(int num) {
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static final void inversOfPyramidPatternIII(int num) {
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static final void inversOfPyramidPatternIV(int num) {
		int n = 1;
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(n++ + "   ");
			}
			System.out.println();
		}
	}

	private static final void inversOfPyramidPatternV(int num) {
		char ch = 'A';
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= (num - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

	@Override
	public void diamondPattern(int num, char symbol) {
		for (int i = 1; i <= num; i++) {
			for (int s = 1; s <= (num - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}
		for (int i = num - 1; i >= 1; i--) {
			for (int s = 1; s <= (num - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}

		System.out.println("46) ===== Daimond Pattern- II =====");
		ImplementationOfPatterns.diamondPatternII(num);

		System.out.println("47) ===== Daimond Pattern- III =====");
		ImplementationOfPatterns.diamondPatternIII(num);

		System.out.println("48) ===== Daimond Pattern- IV =====");
		ImplementationOfPatterns.diamondPatternIV(num);

		System.out.println("49) ===== Daimond Pattern- V =====");
		ImplementationOfPatterns.diamondPatternV(num, symbol);

	}

	private static final void diamondPatternII(int num) {
		for (int i = 1; i <= num; i++) {
			for (int s = 1; s <= (num - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = num - 1; i >= 1; i--) {
			for (int s = 1; s <= (num - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static final void diamondPatternIII(int num) {
		for (int i = 1; i <= num; i++) {
			for (int s = 1; s <= (num - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (int i = num - 1; i >= 1; i--) {
			for (int s = 1; s <= (num - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static final void diamondPatternIV(int num) {
		char ch = 'A';
		for (int i = 1; i <= num; i++) {
			for (int s = 1; s <= (num - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		for (int i = num - 1; i >= 1; i--) {
			for (int s = 1; s <= (num - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}

	private static final void diamondPatternV(int num, char symblo) {
		for (int i = 1; i <= num; i++) {
			for (int s1 = 1; s1 <= num; s1++) {
				System.out.print(" " + " ");
			}
			for (int s = 1; s <= (num - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(symblo + " ");
			}
			System.out.println();
		}
		for (int i = num; i >= 1; i--) {
			for (int s = 1; s <= (num - i); s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(symblo + " ");
			}
			System.out.println();
		}
	}

	@Override
	public void swastikaPattern(int num, char symbol) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if ((j == num / 2 + 1 && i >= 1) || // Vertical line in the center
						(i == num / 2 + 1 && j >= 1) || // Horizontal line in the center
						(j == 1 && i < num / 2 + 1) || // Top-left vertical line
						(i == 1 && j > num / 2 + 1) || // Top-right horizontal line
						(i == num && j < num / 2 + 1) || // Bottom-left horizontal line
						(j == num && i > num / 2 + 1)) { // Bottom-right vertical line
					System.out.print(symbol + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
