package created.ParseTree.Yaya;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;

public abstract class yaya_param_list implements created.iNode 
{
    public static class yayaParamList extends yaya_param_list
    {
        public yaya_param yp;
        public yaya_param_list ypl;
        
        public yayaParamList(yaya_param yp, yaya_param_list ypl)
        {
            this.yp = yp;
            this.ypl = ypl;
        }
        
        public yayaParamList(yaya_param yp)
        {
            this.yp = yp;
            this.ypl = null;
        }
        
        public String toString()
        {
            if(ypl == null)
                return yp.toString();
            else
                return yp.toString() + ", " + ypl.toString();
        }
    }
    
}