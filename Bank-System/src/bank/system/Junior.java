/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.system;

/**
 *
 * @author Victoria
 */
public class Junior
        implements java.io.Serializable
{
    public Junior(String id, String pin, int ba, int li, String name, String addr, String birth)
    {
        accNo = id;idNo = pin; balance = ba; li = limit; this.name = name; this.addr = addr; this.birth = birth;
    }

    Junior(String accNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString()
    {
        return "[Jounior account]" + "\n\t" +
                "[Account Number] " + accNo + "\n\t" +
                "[Identifiction Number] " + idNo + "\n\t" +
                "[Account balance] " + balance + "\n\t" +
                "[Overdraft Limit] " + limit + "\n\t" +
                "[name] " + name + "\n\t" +
                "[address] " + addr + "\n\t" + 
                "[date of birth]" + birth + "\n";
    }
    
    public String getAccNo() { return accNo; }
    public String getIdNo() { return idNo; }
    public String getName() { return name; }
    public String getAddr() { return addr; }
    public String getBirth() { return birth; }
    public int getBalance() { return balance; }
    public int getLimit() { return limit; }
    
    public void setAccNo(String value) { accNo = value; }
    public void setIdNo(String value) { idNo = value; }
    public void setName(String value) { name = value; }
    public void setAddr(String value) { addr = value; }
    public void setBirth(String value) { birth = value; }
    
    private String accNo = null;
    private String idNo = null;
    private int balance = 0;
    private int limit = 0;
    private String name = null;
    private String addr = null;
    private String birth = null;
}
