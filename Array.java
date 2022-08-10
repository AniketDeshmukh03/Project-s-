
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = new int[3];
		byte byteArr[] = new byte[3];
		float floatArr[] = new float[9];
		short shrtArr[] = new short[90];
		long longArr[] = {39483948, 98989};
		char charArr[] = new char[900];
		boolean boolArr[] = new boolean[90];
		double dArr[] = new double[890];
		String strArr[] = new String[10];
		
		System.out.println(intArr.getClass().getSuperclass() );
		System.out.println(byteArr.getClass() );
		System.out.println(charArr.getClass().getSuperclass() );

		System.out.println(boolArr.getClass() );

		System.out.println(strArr.getClass().getSuperclass());
		
		System.out.println(intArr);
		System.out.println(intArr[0]);  
		
		System.out.println(intArr[0]== intArr[1]);
		//0 == 0 (value type)
		int intArr1[] = new int[8];
		System.out.println(intArr == intArr1);
		//checking address
		
		int arrayName[] = new int[5];
		int number = 2323;
		arrayName[0] =  number;
		arrayName[1] =  number+1;
		arrayName[2] =  number+2;
		arrayName[3] =  number+3;
		
		int copArr[] = 	new int[arrayName.length]	;
		copArr[0] = arrayName[0];
		copArr[1] = arrayName[1];
		
		
		int copArr1[] = arrayName.clone();
		System.out.println(copArr1[0]);
		System.out.println(copArr1[1]);
		System.out.println(copArr1[2]);
		System.out.println(copArr1[3]);
		System.out.println(copArr1[4]);
		
		
		//base adrs(even though you have copied the val's addrs are dif)
		System.out.println(copArr1 == arrayName);
		
	}

}
