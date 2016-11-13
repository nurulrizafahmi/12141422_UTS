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
      
      System.out.println("Tebakan anda berapa ? " + tebak);
        if (tebak<random){
            System.out.print("Tebakan Anda telalu kecil!");
        }
        if (tebak>random){
            System.out.print("Tebakan Anda telalu besar!");
        }
        if (tebak==random){
            System.out.print("Selamat Anda berhasil menebak sebanyak " + banyak + " kali tebakan");
        }
        
        if (kesempatan>0){
            System.out.println("Anda mempunyai kesempatan " + kesempatan + " kali lagi.");
        }
        else {
            System.out.println("Game Over");
        }
    }
    
    
}
