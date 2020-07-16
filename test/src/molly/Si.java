package molly;

import java.io.File;

public class Si {
	public void getFileInfo(String dir){
		File p = new File(dir);
		File[] a = p.listFiles();
		if(a != null && a.length>0){
			for(File file : a){
				if(file.isDirectory()){
					System.out.println("Ä¿Â¼£º" + file.getName());
	                   getFileInfo(file.getAbsolutePath());   
				}
	        	else{
	        		System.out.println("ÎÄ¼þ£º" + file.getName());
	        	}
	        }
	    }
	}
}
