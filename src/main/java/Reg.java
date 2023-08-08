/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manura
 */
public class Reg {
    public interface Registration {
    public String getName();
    public String getAddress();
    public int getTel();
    public String getEmail();
    public String getUsername();
    public String getPassword();
}

public class Register implements Registration {
    private String namereg;
    private String addressreg;
    private int telreg;
    private String emailreg;
    private String userreg;
    private String passreg;

    @Override
    public String getName() {
        return namereg;
    }

    @Override
    public String getAddress() {
        return addressreg;
    }

    @Override
    public int getTel() {
        return telreg;
    }

    @Override
    public String getEmail() {
        return emailreg;
    }

    @Override
    public String getUsername() {
        return userreg;
    }

    @Override
    public String getPassword() {
        return passreg;
    }

    // Other methods specific to Register class
}
    
}
