package ExeceptionDemoPk;

public class MyExeception extends Exception {
	
	String msgAtt;
	public MyExeception(String msgAtt) {
		// TODO Auto-generated constructor stub
		this.msgAtt = msgAtt;
	}

}
