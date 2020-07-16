package molly;

import java.io.*;

public class molly {
	public void cut(){
		FileInputStream fis=null;
		FileOutputStream fos=null;
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try{
			fis=new FileInputStream("D:\\java\\molly\\lyf1.txt");
			fos=new FileOutputStream("D:\\java\\molly\\lyf2.txt");
			bis=new BufferedInputStream(fis);
			bos=new BufferedOutputStream(fos);
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
