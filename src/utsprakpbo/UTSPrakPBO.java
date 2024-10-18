/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsprakpbo;

/**
 *
 * @author ASUS
 */
public class UTSPrakPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mac mac = new Mac("MacBook Pro", 4, 16, "M1", "Lithium", "TouchID");
        System.out.println("=======================");
        System.out.println("Data Mac");
        System.out.println("=======================");
        mac.tampilMac();

        Windows windows = new Windows("Asus Vivobook", 3, 8, "Ryzen 5", "Li-ion", "Windows 11");
        System.out.println("=======================");
        System.out.println("Data Windows:");
        System.out.println("=======================");
        windows.tampilWindows();

        Pc pc = new Pc("Dell", 4, 32, "Intel i7", "24 inch");
        System.out.println("=======================");
        System.out.println("Data PC:");
        System.out.println("=======================");
        pc.tampilPc();
    }
    
}
