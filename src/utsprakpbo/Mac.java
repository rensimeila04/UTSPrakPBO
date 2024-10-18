package utsprakpbo;

public class Mac extends Laptop {
    public String security;

    public Mac(){
    }
    
    public Mac(String merk, int kecProcessor, int sizeMemory, String jenProcessor, String jnsBaterai, String security) {
        super(merk, kecProcessor, sizeMemory, jenProcessor, jnsBaterai);
        this.security = security;
    }
    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Security: " + security);
        System.out.println("------------------------");
    }
}
