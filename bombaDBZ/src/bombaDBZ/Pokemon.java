package bombaDBZ;

public class Pokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String palabracodif;
String palabra;

palabra="";
palabracodif= "Paco@es@un c1ch4nd4";

int j;
		j= (palabracodif.length()/2);
		for(int i=0;i<j;i++){
			if (palabracodif.charAt(i)=='@' ) {
			
			palabra= palabra+" ";
			}
		
		
		else{
			palabra= palabra+palabracodif.charAt(i);
		}
		}
	
			for(int k=j;k<palabracodif.length();k++){
				if (palabracodif.charAt(k)=='1' ) {
				
				palabra= palabra+"a";
				}
				else if (palabracodif.charAt(k)=='4' ) {
					
					palabra= palabra+"o";
					}
			
				else{
				palabra= palabra+palabracodif.charAt(k);
			
			}
			
	}

		System.out.println(palabra);
	}
}