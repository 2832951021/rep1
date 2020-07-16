package molly;

import java.io.*;

public class Nian {
	public void cut(){
		FileReader fis=null;
		FileWriter fos=null;
		BufferedReader bis=null;
		BufferedWriter bos=null;
		try{
			fis=new FileReader("D:\\java\\molly\\Nian1.txt");
			fos=new FileWriter("D:\\java\\molly\\Nian1.txt");
			bis=new BufferedReader(fis);
			bos=new BufferedWriter(fos);
			int l;
			while((l = bis.read())!= -1) {
				bos.write(l);
				bos.flush();
			}
			}
		catch(FileNotFoundException a){
			a.printStackTrace();
			}
		catch(IOException a){
			a.printStackTrace();
		}
		finally{
			try{
				if(bos !=null)
					bos.close();
			}catch(IOException a){
				a.printStackTrace();
			}finally{
				try{
					if(bis != null){
						bis.close();
	    			}
				}catch(IOException a){
					a.printStackTrace();
				}
			}
		}
	}
}
