public abstract class Motor {
    protected String jenis  = "Sport";
    protected String merk = "Kawasaki Ninja";

    protected String getJenis(){
        return jenis;
    }
    protected String getMerk(){
        return merk;
    }    
    protected abstract void printJenis();
	
    protected abstract void printMerk();
}