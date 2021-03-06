package created.ParseTree.SubYaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class sy_cont_list implements created.iNode 
{
    public static class SubYayaContList extends sy_cont_list
    {
        public sy_cont c;
        public sy_cont_list l;
        
        public SubYayaContList(sy_cont c, sy_cont_list l)
        {
            this.c = c;
            this.l = l;
        }
        
         public SubYayaContList(sy_cont c)
        {
            this.c = c;
            this.l = null;
        }
        
        public String toString()
        {
            if(l != null)
            return c.toString() + l.toString();
            else
            return c.toString();
            
        }
    }
    
}
