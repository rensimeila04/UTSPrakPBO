package utsprakpbo;

class Pc extends Komputer {
    public String ukuranMonitor;

    public Pc(String merk, int kecProcessor, int sizeMemory, String jenProcessor, String ukuranMonitor) {
        super(merk, kecProcessor, sizeMemory, jenProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        super.tampilData();
        System.out.println("Ukuran Monitor: " + ukuranMonitor);
        System.out.println("------------------------");
    }
}
