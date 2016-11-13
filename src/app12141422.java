public class app12141422 {
    String nama;
    byte level = 1;
    byte kesempatan = 5;
    short tebak;
    short banyak=0;
    int random, score=0;
    char jawab;
    
    public void setPilih(String nama) {
        this.nama = nama;
    }
    
    public void setTebak(short tebak) {
        this.tebak = tebak;
    }
    
    public int Level(){
        return level*5;
    }
    
    public void hasilTebakan() {
      kesempatan--;
      banyak++;
      
    
}
