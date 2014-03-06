import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class CuttingStringEncoderImpl implements CuttingStringEncoder {

	@Override
	public List<String> cutAndEncode(String source, Charset charset,
			int maxSegLen) throws IllegalArgumentException {
		
                //List<byte[]> res = new ArrayList<byte[]>(); // ���������
		  List<String> res = new ArrayList<String>(); // ���������
		
			// �������� �������� ���������� (�� ����������) �� null
			if (source == null || charset == null) {
				throw new IllegalArgumentException("���� ������ ���������!");
			} else {
				System.out.println("�������� ������ � ����������!");
				
				//�������� �������� ������ � ������ ���������
				//byte[] encodesource = source.getBytes(/*charset*/);
                                //ByteBuffer bb = ByteBuffer.wrap(encodesource);
                                
                                //���� �� ��������, �� ��������� � ����� � ������������ ������ �������� ������� � ��������
				
                                //��������� �������� ������ �� ������ ����
                                String[] sourcespl = source.split(" ");
                                
                                String tmp = "";                                // ����� ��������� ������ ��� ������������ �������� 
                                String lsource = "";                            // ����� ������ ������ ����� � ���������
                                // �������� ��������� �� ���� (��� �������)
                                /*for (int i=0; i<sourcespl.length ;i++){
                                    if (!sourcespl[i].isEmpty()) {          // � ���������� ������ ����� ���� ������ ����� - �� �� �������
                                
                                        System.out.println("tmp: " + tmp);       
                                        
                                        if (((tmp.isEmpty()?tmp:(tmp + " ")) + sourcespl[i]).length() <= maxSegLen) {
                                            tmp = (tmp.isEmpty()?tmp:(tmp + " ")) + sourcespl[i];
                                        }else{                              // ���� ������� �� ������� �������� 
                                            if (tmp.isEmpty()) {                // ���� ��� ������������ ����� � ��������, 
                                                                                // �� ��� ��������� � ����� �������� ���� ����� �� ��������. � ������� �������� ������
                                                for (int j=0; j<(sourcespl[i].length())/maxSegLen; j++){
                                                    res.add(sourcespl[i].substring(j*maxSegLen,j*maxSegLen+maxSegLen));
                                                }
                                                tmp = sourcespl[i].substring(sourcespl[i].length()-((sourcespl[i].length())%maxSegLen));
                                            }else{
                                                res.add(tmp);                   // ���������� ������� � ������������
                                                i--;
                                                tmp = "";
                                            }
                                        }
                                        
                                    }
                                }*/
                                
                                // �������� ��������� �� ���� (� �������� (Y ���� ���������))
                                for (int i=0; i<sourcespl.length ;i++){
                                    if (!sourcespl[i].isEmpty()) {          // � ���������� ������ ����� ���� ������ ����� - �� �� �������
                                
                                        System.out.println("tmp: " + tmp);       
                                        
                                        if (((tmp.isEmpty()?tmp:(tmp + " ")) + sourcespl[i]).length() <= (maxSegLen-((res.size())/10)-4)) {
                                            tmp = (tmp.isEmpty()?tmp:(tmp + " ")) + sourcespl[i];
                                        }else{                              // ���� ������� �� ������� �������� 
                                            if (tmp.isEmpty()) {                // ���� ��� ������������ ����� � ��������, 
                                                                                // �� ��� ��������� � ����� �������� ���� ����� �� ��������. � ������� �������� ������
                                                if (res.size()>0) {                 // ���� ������� ��� �� ������, �� ����� ������ ���������� ������ ����� ������
                                                    for (int k=0; k<(sourcespl[i].length())/maxSegLen; k++){    // ����������� ������� ����� � lsource
                                                        lsource = lsource + (res.size()>0?(res.size() + "/Y "):"") + "";
                                                    }
                                                    
                                                    System.out.println("lsource: " + lsource);
                                                            
                                                    for (int j=0; j<(lsource.length())/maxSegLen; j++){
                                                        res.add(lsource.substring(j*maxSegLen,j*maxSegLen+maxSegLen));
                                                    }
                                                    tmp = lsource.substring(lsource.length()-((lsource.length())%maxSegLen));
                                                }else{
                                                    for (int j=0; j<(sourcespl[i].length())/maxSegLen; j++){
                                                        res.add(sourcespl[i].substring(j*maxSegLen,j*maxSegLen+maxSegLen));
                                                    }
                                                    tmp = sourcespl[i].substring(sourcespl[i].length()-((sourcespl[i].length())%maxSegLen));
                                                }
                                            }else{                              // ���������� ������� � ������������
                                                if (res.size()>0) {                 // ���� ������� ��� �� ������, �� ����� ������
                                                    res.add(res.size() + "/Y " + tmp);
                                                }else{								// ���� ������� ������
                                                    if (tmp.length() == maxSegLen){ 	// ���� �������
                                                    	res.add(tmp);					// ���� ������� ������, �� ����� ������
                                                    }else{
                                                    	
                                                    }
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
