package created.ParseTree.SubYaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class sy_opt implements created.iNode 
{
    public static class SubYayaOpt extends sy_opt
    {
        public sy_cont_list l;
        
        public SubYayaOpt(sy_cont_list l)
        {
            this.l = l;
        }
        
        public SubYayaOpt()
        {
            this.l = null;
        }
        
        public String toString()
        {
            if(l != null)
            return l.toString();
            else
            return null;
        }
    }
    
}

//sy_opt ::= sy_cont_list:l {: RESULT = new SubYayaBodyList(l); :}
//			| {: RESULT = new SubYayaBodyListEmpty(); :};