package created.ParseTree.Utos;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SabiSabi.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Yaya.*;

public abstract class utos_dec_db implements created.iNode  
{
    public static class utosMakeKuha extends utos_dec_db
    {
        public utos_makeKuha uk; 
        
        public utosMakeKuha(utos_makeKuha uk)
        {
            this.uk = uk;
        }
        
        public String toString()
        {
            return uk.toString() + " db";
        }
    }
    
    public static class utosMakeSulat extends utos_dec_db
    {
        public utos_makeSulat usu; 
        
        public utosMakeSulat(utos_makeSulat usu)
        {
            this.usu = usu;
        }
        
        public String toString()
        {
            return usu.toString() + " db";
        }
    }
    
    public static class utosMakeSabi extends utos_dec_db
    {
        public utos_makeSabi usa; 
        
        public utosMakeSabi(utos_makeSabi usa)
        {
            this.usa = usa;
        }
        
        public String toString()
        {
            return usa.toString() + " db";
        }
    }
    
    public static class breakup extends utos_dec_db
    {
        public breakup()
        {
        }
        
        public String toString()
        {
            return "breakup db";
        }
    }
    
    public static class makeup extends utos_dec_db
    {
        public makeup()
        {
        }
        
        public String toString()
        {
            return "makeup db";
        }
    }
}