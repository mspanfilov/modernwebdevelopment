import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class CuttingStringEncoderImpl implements CuttingStringEncoder {

	@Override
	public List<String> cutAndEncode(String source, Charset charset,
			int maxSegLen) throws IllegalArgumentException {
		
                //List<byte[]> res = new ArrayList<byte[]>(); // результат
		  List<String> res = new ArrayList<String>(); // результат
		
			// проверка входящих параметров (не примитивов) на null
			if (source == null || charset == null) {
				throw new IllegalArgumentException("Есть пустые параметры!");
			} else {
				System.out.println("Начинаем резать и кодировать!");
				
				//кодируем исходную строку в нужную кодировку
				//byte[] encodesource = source.getBytes(/*charset*/);
                                //ByteBuffer bb = ByteBuffer.wrap(encodesource);
                                
                                //пока не кодируем, не переводим в байты и маскимальную длинну сегмента считаем в символах
				
                                //разбиваем исходную строку на массив слов
                                String[] sourcespl = source.split(" ");
                                
                                String tmp = "";                                // здесь сохраняем данные для формирования сегмента 
                                String lsource = "";                            // здесь храним длиное слово с индексами
                                // собираем результат (без индекса)
                                /*for (int i=0; i<sourcespl.length ;i++){
                                    if (!sourcespl[i].isEmpty()) {          // в результате сплита могут быть пустые слова - их не смотрим
                                
                                        System.out.println("tmp: " + tmp);       
                                        
                                        if (((tmp.isEmpty()?tmp:(tmp + " ")) + sourcespl[i]).length() <= maxSegLen) {
                                            tmp = (tmp.isEmpty()?tmp:(tmp + " ")) + sourcespl[i];
                                        }else{                              // если вылазим за границы сегмента 
                                            if (tmp.isEmpty()) {                // если это единственное слово в сегменте, 
                                                                                // то его разбиваем и пишем сегменты пока слово не кончится. а остаток передаем дальше
                                                for (int j=0; j<(sourcespl[i].length())/maxSegLen; j++){
                                                    res.add(sourcespl[i].substring(j*maxSegLen,j*maxSegLen+maxSegLen));
                                                }
                                                tmp = sourcespl[i].substring(sourcespl[i].length()-((sourcespl[i].length())%maxSegLen));
                                            }else{
                                                res.add(tmp);                   // записываем сегмент и откатываемся
                                                i--;
                                                tmp = "";
                                            }
                                        }
                                        
                                    }
                                }*/
                                
                                // собираем результат (с индексом (Y пока константа))
                                for (int i=0; i<sourcespl.length ;i++){
                                    if (!sourcespl[i].isEmpty()) {          // в результате сплита могут быть пустые слова - их не смотрим
                                
                                        System.out.println("tmp: " + tmp);       
                                        
                                        if (((tmp.isEmpty()?tmp:(tmp + " ")) + sourcespl[i]).length() <= (res.size()>0?maxSegLen-((res.size())/10)-4:maxSegLen)) {
                                            tmp = (tmp.isEmpty()?tmp:(tmp + " ")) + sourcespl[i];
                                        }else{                              // если вылазим за границы сегмента 
                                            if (tmp.isEmpty()) {                // если это единственное слово в сегменте, 
                                                                                // то его разбиваем и пишем сегменты пока слово не кончится. а остаток передаем дальше
                                                if (res.size()>0) {                 // если сегмент уже не первый, то нужен индекс ПОЛУЧАЕТСЯ ИНДЕКС НУЖЕН ВСЕГДА
                                                    for (int k=0; k<(sourcespl[i].length())/maxSegLen; k++){    // преобразуем длинное слово в lsource
                                                        lsource = lsource + (res.size()>0?(res.size() + "/Y "):"") + "";
                                                    }
                                                    
                                                    System.out.println("lsource: " + lsource);
                                                            
                                                    for (int j=0; j<(lsource.length())/maxSegLen; j++){
                                                        res.add(lsource.substring(j*maxSegLen,j*maxSegLen+maxSegLen));
                                                    }
                                                    //???tmp = lsource.substring(lsource.length()-((lsource.length())%maxSegLen));
                                                }else{
                                                    for (int j=0; j<(sourcespl[i].length())/maxSegLen; j++){
                                                        res.add(sourcespl[i].substring(j*maxSegLen,j*maxSegLen+maxSegLen));
                                                    }
                                                    tmp = sourcespl[i].substring(sourcespl[i].length()-((sourcespl[i].length())%maxSegLen));
                                                }
                                            }else{                              // записываем сегмент и откатываемся
                                                if (res.size()>0) {                 // если сегмент уже не первый, то нужен индекс
                                                    res.add(res.size() + "/Y " + tmp);
                                                }else{
                                                    res.add(tmp);
                                                }                   
                                                i--;
                                                tmp = "";
                                            }
                                        }
                                        
                                    }
                                }
                                
				//BufferedReader str = new BufferedReader(new StringReader(source));
                                
                                
				
                                /*byte[] tmp = new byte[3]; 
                                bb.get(tmp, 0, maxSegLen+1);
                                res.add(tmp);
                                
                                bb.get(tmp, 0, 0);
                                res.add(tmp);*/
                                
				//OutputStreamWriter osw = new OutputStreamWriter((OutputStream) res, charset);
				
				/*int ch;
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
				System.out.println(buffer);*/
				
				return res;
			}

	}

}
