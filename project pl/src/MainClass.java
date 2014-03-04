import java.util.List;


public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Начало!");
		
		CuttingStringEncoderImpl csei = new CuttingStringEncoderImpl();
		
		List<byte[]> res = csei.cutAndEncode(args[0], java.nio.charset.Charset.forName(args[1]), Integer.parseInt(args[2]));
		
		System.out.println("Конец!");
		
	}

}
