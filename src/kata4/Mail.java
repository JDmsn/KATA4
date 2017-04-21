package kata4;

public class Mail {
    private final String ml;

    public Mail(String ml) {
        this.ml = ml;
    }
    
    public String getDomain(){
        return ml.split("@")[1];
    }
}
