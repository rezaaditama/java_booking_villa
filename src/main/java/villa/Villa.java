/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package villa;

public class Villa {
    protected String nama;
    protected String noTelp;
    protected String email;
    protected int villaId;
    protected String checkIn;

    
    public Villa (String nama, String noTelp, String email, int villaId, String checkIn) {
        this.nama = nama;
        this.noTelp = noTelp;
        this.email = email;
        this.villaId = villaId;
        this.checkIn = checkIn;
    }
    
    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk noTelp
    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    // Getter dan Setter untuk email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter dan Setter untuk villaId
    public int getVillaId() {
        return villaId;
    }

    public void setVillaId(int villaId) {
        this.villaId = villaId;
    }
    
    // Getter dan Setter Check In
    public String getCheckIn() {
        return checkIn;
    }
    
    
    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }
}