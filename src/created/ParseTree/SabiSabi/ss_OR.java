package created.ParseTree.SabiSabi;

import created.ParseTree.Array.*;
import created.ParseTree.Arte.*;
import created.ParseTree.Literals.*;
import created.ParseTree.Program.*;
import created.ParseTree.SubYaya.*;
import created.ParseTree.Utos.*;
import created.ParseTree.Yaya.*;

public abstract class ss_OR implements created.iNode
{
    public static class ssORExpansion extends ss_OR
    {
        public ss_AND a;
        public ss_OR o;
        
        public ssORExpansion(ss_AND a, ss_OR o)
        {
            this.a = a;
            this.o = o;
        }
        
        public String toString()
        {
            return a.toString() + " || " + o.toString();
        }
    }
    
    public static class ssOR extends ss_OR
    {
        public ss_AND a;
        
        public ssOR(ss_AND a)
        {
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString();
        }
    }
    
}
//ss_OR ::= ss_AND:a OR OR ss_OR:o {: RESULT = new ssORExpansion(a, o); :}
//		| ss_AND:a {: RESULT = new ssOR(a); :};