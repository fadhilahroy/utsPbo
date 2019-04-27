package uts;

class Komputer {
    private CPU cpu;
    public Komputer(CPU cpu){
        this.cpu = cpu;
    }
    public Komputer(){
    }
    public void memasang(CPU cpu){
        System.out.println("CPU: "+cpu.getCPUDAta()+" dipasang");
    }
    public void melepas(CPU cpu){
        System.out.println("CPU: "+cpu.getCPUDAta()+" dilepas");
    }
    public void cetakInfo(CPU cpu){
        System.out.println("Spesifikasi: CPU: "+cpu.getCPUDAta()+" dipasang");
    }   
}

class CPU {
    protected String nama;
    protected int kecepatan;
    
    public CPU(String nama,int kecepatan){
       this.nama=nama;
       this.kecepatan=kecepatan;
    }
    public String getCPUDAta(){
        return(this.nama+" "+this.kecepatan+" GHZ");
    }
}

class AMD extends CPU{

    public AMD(int kecepatan) {
        super("AMD", 3);
    }
}

class intel extends CPU{
    public intel(int kecepatan) {
        super("Intel", 2);
    }
}

public class UTS {

        public static void main(String[] args) {
        AMD amd1 = new AMD(0);
        intel intel1 = new intel(0);
        Komputer komputer1 = new Komputer();
        komputer1.cetakInfo(intel1);
        komputer1.memasang(amd1);
        komputer1.melepas(intel1);
        komputer1.cetakInfo(amd1);
    }
}
    


