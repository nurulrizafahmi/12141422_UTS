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
    
    public void Score() {
        if (banyak>0){
            score= 100*level;
        }
        if (banyak>1){
            score= 70*level;
        }
        if (banyak>2){
            score= 50*level;
        }
        if (banyak>3){
            score= 30*level;
        }
        System.out.println(nama + "\t: " + score);
        System.out.println("nurul\t: 70");
        System.out.println("riza\t: 50");
        System.out.println("fahmi\t: 100");
        System.out.println("ahmad\t: 100");
    }
    
    
}
