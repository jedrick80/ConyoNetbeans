package created.parseTree.Utos;

abstract class utos_makeArte implements created.iNode  
{
    public static class makeArte extends utos_makeArte
    {
        public arte_dec a; 
        
        public makeArte(arte_dec a)
        {
            this.a = a;
        }
        
        public String toString()
        {
            return a.toString();
        }
    }
}