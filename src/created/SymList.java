package created;

import java.util.*;

/**
 * A class to act as a list of symbols (variables, functions, etc.).
 * Based on SymTab class by Klein and Rumpe. (jflex examples, interpreter)
 */
public class SymList 
{
    Map <String, SymEntry> m;
    SymList anc; //ancestor symlist
    
    /**
     * First constructor, no ancestor.
     */
    public SymList()
    {
        this(null);
    }
    
    /**
     * Second constructor, w/ ancestor.
     * @param anc Ancestor SymList.
     */
    public SymList(SymList anc)
    {
        m = new HashMap<String, SymEntry>();
        this.anc = anc;
    }
    
    /**
     * Add a new symbol to the list.
     * @param s Name of symbol.
     * @param se Symbol value.
     * @return 
     */
    public Boolean addToList(String s, SymEntry se)
    {
        SymEntry symbol = getSymbol(s);
        Boolean symbolAvail = (symbol == null); //if symbol is not taken
        if(symbolAvail)
        {
            m.put(s, se);
        }
        return symbolAvail;
    }
    
    /**
     * Get a symbol from the list.
     * @param s Name of symbol.
     * @return Symbol with matching name.
     */
    public SymEntry getSymbol(String s)
    {
        SymEntry symbol = m.get(s);
        if(symbol == null && anc != null) 
        {
            symbol = anc.getSymbol(s);
        }
        return symbol;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Iterator i = m.entrySet().iterator();
        while (i.hasNext()) 
        {
            Map.Entry inst = (Map.Entry)i.next();
            sb.append(inst.getKey()).append(" - ").append(inst.getValue()).append("\n");
        }
        return sb.toString();
    }
}
