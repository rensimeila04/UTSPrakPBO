package utsprakpbo;

public class Windows extends Laptop {
    public String fitur;

    public Windows() {
    }

    public Windows(String merk, int kecProcessor, int sizeMemory, String jenProcessor, String jnsBaterai,
            String fitur) {
        super(merk, kecProcessor, sizeMemory, jenProcessor, jnsBaterai);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        super.tampilLaptop();
        System.out.println("Fitur: " + fitur);
        System.out.println("------------------------");
    }

}
