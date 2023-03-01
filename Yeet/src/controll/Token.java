package controll;

public class Token {
    String code;
    String type;

    public Token(String code, String type){
        this.code = code;
        this.type = type;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
