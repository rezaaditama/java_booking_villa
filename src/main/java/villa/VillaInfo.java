/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package villa;

public abstract class VillaInfo {

    protected String[] namaVilla = {
        "Villa Seruni", 
        "Villa Victiorian", 
        "Villa Nevada"
    };
    
    protected int[] hargaVilla = {
        3500000, 4000000, 3800000
    };
    
    protected String[] deskripsiVilla = {
        "Full AC, Free wifi, TV cable, Heater Water, Refrigerator, Washing machine, Kitchen utensils, Security 24, max capacity 20 persons",
        "Swimming Pool, Free Wifi, AC, LCD TV, Karaoke, Heater Water, Refrigerator, Microwave, Magic com, Kitchen Utensils, Washing Machine, Garage, 24 Hours, Capacity 15 persons",
        "Swimming Pool, Free Wifi, AC, LCD TV (international channel), Sound system, Karaoke, Heater water, Refrigerator, Microwave, Magic Com, Dispenser, Kitchen Utensils, BBQ, Washing Machine, Garage, 24 hours, Capacity 20 persons"
    };

    public abstract String getImageLeft(int index);
    public abstract String getImageRight(int index);

    // Get Villa By Id
    public String getNamaVilla(int index) {
        return index >= 0 && index < namaVilla.length ? namaVilla[index] : "Index out of bounds";
    }

    public int getHargaVilla(int index) {
        return index >= 0 && index < hargaVilla.length ? hargaVilla[index] : -1;
    }

    public String getDeskripsiVilla(int index) {
        return index >= 0 && index < deskripsiVilla.length ? deskripsiVilla[index] : "Index out of bounds";
    }
}
