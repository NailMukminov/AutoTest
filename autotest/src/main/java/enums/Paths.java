package enums;

public enum Paths {
    CONFIG("../automationtest/src/main/resources/config.json");

    private final String code;

    Paths(String code){
        this.code = code;
    }

    public String getCode(){ return code;}
}
