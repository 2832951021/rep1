package molly;

public class Prosess {
	public static String Prosesskey(String key) {
		String keywords="";
		if(key!=null && !key.trim().equals("")) {
			keywords="%"+key+"%";	
		}else {
			keywords="%%";		
		}
		return keywords;
	}
}
