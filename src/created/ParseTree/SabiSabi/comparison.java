package created.ParseTree.SabiSabi;

abstract class comparison implements created.iNode
{
    public static class compare extends comparison
    {
        public String kind; // will contain either <, <=, >= or >
        
        public arithmetic1(String type)
        {
            kind = type;
        }
        
        public String toString()
        {
            return kind;
        }
    }
}