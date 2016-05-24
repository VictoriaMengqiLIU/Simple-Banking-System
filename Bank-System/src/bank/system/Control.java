/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.system;

import java.io.File;

/**
 *
 * @author Victoria
 */
public class Control 
{
    public boolean depositFunds(String acc, String id, String funds)
    {   
        try {
            if (acc == "junior")
            {
                Junior j = (Junior) new Util().readObject("/junior/"+id);
                accNo = id;
                idNo = j.getIdNo();
                balance = j.getBalance() + Integer.parseInt(funds);
                limit = j.getLimit();
                name = j.getName();
                addr = j.getAddr();
                birth = j.getBirth();
                Junior jj = new Junior(accNo, idNo, balance, limit, name, addr, birth);
                new Util().writeObject("/junior/"+id, jj);
                return true;
            }
            else if (acc == "saver")
            {
                Saver s = (Saver) new Util().readObject("/saver/"+id);
                accNo = id;
                idNo = s.getIdNo();
                balance = s.getBalance() + Integer.parseInt(funds);
                limit = s.getLimit();
                name = s.getName();
                addr = s.getAddr();
                birth = s.getBirth();
                Saver ss = new Saver(accNo, idNo, balance, limit, name, addr, birth);
                new Util().writeObject("/saver/"+id, ss);
                return true;
            }
            else if (acc == "current")
            {
                Current c = (Current) new Util().readObject("/current/"+id);
                accNo = id;
                idNo = c.getIdNo();
                balance = c.getBalance() + Integer.parseInt(funds);
                limit = c.getLimit();
                name = c.getName();
                addr = c.getAddr();
                birth = c.getBirth();
                Current cc = new Current(accNo, idNo, balance, limit, name, addr, birth);
                new Util().writeObject("/current/"+id, cc);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return false;
    }
    
    public boolean clearFunds()
    {
        return false;
    }
    
    public boolean withdrawFunds(String acc, String id, String pin, String funds)
    {   
        try {
            if (acc == "junior")
            {
                Junior j = (Junior) new Util().readObject("/junior/"+id);
                accNo = id;
                idNo = j.getIdNo();
                int o = j.getBalance();
                int n = Integer.parseInt(funds);
                if (o >= n) {
                    balance = o - n;
                    limit = j.getLimit();
                    name = j.getName();
                    addr = j.getAddr();
                    birth = j.getBirth();
                    Junior jj = new Junior(accNo, idNo, balance, limit, name, addr, birth);
                    new Util().writeObject("/junior/"+id, jj);
                    return true;
                }
            }
            else if (acc == "saver")
            {
                Saver s = (Saver) new Util().readObject("/saver/"+id);
                accNo = id;
                idNo = s.getIdNo();
                int o = s.getBalance();
                int n = Integer.parseInt(funds);
                if (o >= n) {
                    balance = o - n;
                    limit = s.getLimit();
                    name = s.getName();
                    addr = s.getAddr();
                    birth = s.getBirth();
                    Saver ss = new Saver(accNo, idNo, balance, limit, name, addr, birth);
                    new Util().writeObject("/saver/"+id, ss);
                    return true;
                }
            }
            else if (acc == "current")
            {
                Current c = (Current) new Util().readObject("/current/"+id);
                accNo = id;
                idNo = c.getIdNo();
                int o = c.getBalance();
                int n = Integer.parseInt(funds);
                int li = c.getLimit();
                if ((o+li) >= n) {
                    if (o >= n) {
                        balance = o - n;
                        limit = li;
                    } else {
                        balance = 0;
                        limit = li + o - n;
                    }
                    name = c.getName();
                    addr = c.getAddr();
                    birth = c.getBirth();
                    Current cc = new Current(accNo, idNo, balance, limit, name, addr, birth);
                    new Util().writeObject("/current/"+id, cc);
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean suspendAcc(String acc, String id)
    {
        Object obj = new Util().readObject("/"+acc+"/"+id);
        if (acc == "junior")
        {
            Junior j = (Junior) obj;
            new Util().writeObject("/suspend/"+id, j);
            new File("./data/junior/"+id).delete();
            return true;
        }
        else if (acc == "saver")
        {
            Saver s = (Saver) obj;
            new Util().writeObject("/saver/"+id, s);
            new File("./data/saver/"+id).delete();
        }
        else if (acc == "current")
        {
            Current c = (Current) obj;
            new Util().writeObject("/current/"+id, c);
            new File("./data/current/"+id).delete();
        }
        return false;
    }
    
    public boolean closeAcc(String acc, String id)
    {
        Object obj = new Util().readObject("/"+acc+"/"+id);
        if(acc == "junior") 
        {
            Junior j = (Junior) obj;
            if (j.getBalance() == 0) {
                new File("./data/junior/"+id).delete();
                return true;
            }
        }
        else if(acc == "saver")
        {
            Saver s = (Saver) obj;
            if (s.getBalance() == 0) {
                new File("./data/saver/"+id).delete();
                return true;
            }
        }
        else if(acc == "current")
        {
            Current c = (Current) obj;
            if (c.getBalance() == 0 && c.getLimit() == 2000) {
                new File("./data/current/"+id).delete();
                return true;
            }
        }
        return false;
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
