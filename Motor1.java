public class Motor1 {
    private int cc;
    private String merk;
    
    //konstruktor
    public Motor1(){
        this.cc=0;
        this.merk="Merk Motor";
    }
    public Motor1(int c, String m){
        this.cc = c;
        this.merk = m;
    }    
    public void setCc(int c){
        this.cc=c;
    }
    public void setMerk(String m){
        this.merk = m;        
    }
    public int getCc(){
        return this.cc;
    }
    public String getMerk(){
        return this.merk;
    }    
}