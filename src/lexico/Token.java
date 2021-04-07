package lexico;

public class Token {
	public static final int TK_identifier = 0;
	public static final int TK_number = 1;
	public static final int TK_operator = 2;
	public static final int TK_ponctuation = 3;
	public static final int TK_assign = 4;
	
	private int type;
	private String text;
	
	public Token(int type, String text) {
		super();
		this.type = type;
		this.text = text;
	}
	public Token() {
		super();
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Token [type=" + type + ", text=" + text + "]";
	}
	
	

}
