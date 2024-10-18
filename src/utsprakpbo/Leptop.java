package utsprakpbo;

class Laptop extends Komputer {
    public String jnsBaterai;

    public Laptop() {
    }

    public Laptop(String merk, int kecProcessor, int sizeMemory, String jenProcessor, String jnsBaterai) {
        super(merk, kecProcessor, sizeMemory, jenProcessor);
        this.jnsBaterai = jnsBaterai;
    }

    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai: " + jnsBaterai);
    }
}
