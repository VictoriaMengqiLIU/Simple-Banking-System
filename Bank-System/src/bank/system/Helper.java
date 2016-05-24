/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.system;

import java.io.File;
import java.util.Objects;

/**
 *
 * @author Victoria
 */
public class Helper {
    
    
    public boolean isQualified() { return true; }
    
    public int getFileCount(String dir)
    {
        String[] str = new File("./data" + dir).list();
        
        int i = 0;
        for (String s : str)
        {
            i++;
        }
        return i;
    }
    
    public boolean jExists(String name, String addr, String birth)
    {
        Junior j;
        
        for (Object obj :  new Util().getObj("/junior/"))
        {
            j = (Junior) obj;
            if (Objects.equals(j.getName(), name)
                    && Objects.equals(j.getAddr(), addr)
                    && Objects.equals(j.getBirth(), birth))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean sExists(String name, String addr, String birth)
    {
        Saver s;
        
        for (Object obj :  new Util().getObj("/saver/"))
        {
            s = (Saver) obj;
            if (Objects.equals(s.getName(), name)
                    && Objects.equals(s.getAddr(), addr)
                    && Objects.equals(s.getBirth(), birth))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean cExists(String name, String addr, String birth)
    {
        Current c;
        
        for (Object obj :  new Util().getObj("/current/"))
        {
            c = (Current) obj;
            if (Objects.equals(c.getName(), name)
                    && Objects.equals(c.getAddr(), addr)
                    && Objects.equals(c.getBirth(), birth))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean jValid(String id, String pin)
    {
        Junior j;
        
        for (Object obj :  new Util().getObj("/junior/"))
        {
            j = (Junior) obj;
            if (Objects.equals(j.getAccNo(), id)
                    && Objects.equals(j.getIdNo(), pin))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean sValid(String id, String pin)
    {
        Saver s;
        
        for (Object obj :  new Util().getObj("/saver/"))
        {
            s = (Saver) obj;
            if (Objects.equals(s.getAccNo(), id)
                    && Objects.equals(s.getIdNo(), pin))
            {
                return true;
            }
        }
        return false;
    }
    
    public boolean cValid(String id, String pin)
    {
        Current c;
        
        for (Object obj :  new Util().getObj("/current/"))
        {
            c = (Current) obj;
            if (Objects.equals(c.getAccNo(), id)
                    && Objects.equals(c.getIdNo(), pin))
            {
                return true;
            }
        }
        return false;
    }
}
