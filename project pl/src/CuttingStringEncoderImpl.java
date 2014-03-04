import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.List;

public class CuttingStringEncoderImpl implements CuttingStringEncoder {

	@Override
	public List<byte[]> cutAndEncode(String source, Charset charset,
			int maxSegLen) throws IllegalArgumentException {
		
		List<byte[]> res = null;; // результат
		
			// проверка вход€щих параметров (не примитивов) на null
			if (source == null || charset == null) {
				throw new IllegalArgumentException("≈сть пустые параметры!");
			} else {
				System.out.println("Ќачинаем резать и кодировать!");
				
				//кодируем исходную строку в нужную кодировку
				byte[] encodesource = source.getBytes(charset);
				
				BufferedReader str = new BufferedReader(new StringReader(source));
				
				//OutputStreamWriter osw = new OutputStreamWriter((OutputStream) res, charset);
				
				int ch;
				StringBuffer buffer = new StringBuffer();
				try {
					while ((ch = str.read())> -1){
						//res.add((byte)((char)ch));
						buffer.append((char)ch);
						System.out.println((char)ch);
						//osw.write(ch);
						//((char)ch);
						byte[] tmp = new byte[1];
						tmp[0] = (byte)ch;
						System.out.println(tmp[0]);
						//res.add(tmp);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(buffer);
				
				return null;
			}

	}

}
