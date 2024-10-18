package utsprakpbo;

public class Komputer {
    public String merk;
    public int kecProcessor;
    public int sizeMemory;
    public String jnsProcessor;


    public Komputer() {
    }

    public Komputer(String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        this.merk = merk;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
        this.jnsProcessor = jnsProcessor;
    }

    public void tampilData() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Processor: " + kecProcessor + " GHz");
        System.out.println("Size Memory: " + sizeMemory + " GB");
        System.out.println("Jenis Processor: " + jnsProcessor);
    }
}
