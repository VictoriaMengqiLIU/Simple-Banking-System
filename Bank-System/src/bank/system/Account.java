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
public class Account
        implements java.io.Serializable
{
    public Account(String id, String pin)
    {
        accNo = id;idNo = pin;
    }
    
    public String toString()
    {
        return "[ID]" + accNo + "\t" +
                "[PIN] " + idNo + "\n";
    }
    
    public String getAccNo() { return accNo; }
    public String getIdNo() { return idNo; }
    
    public void setAccNo(String value) { accNo = value; }
    public void setIdNo(String value) { idNo = value; }
    
    private String accNo = null;
    private String idNo = null;
}
