{"filter":false,"title":"SabiSabiInsideParenthesis2.java","tooltip":"/src/created/sabisabi/SabiSabiInsideParenthesis2.java","undoManager":{"mark":5,"position":5,"stack":[[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":0,"column":0},"end":{"row":0,"column":50}},"text":"class SabiSabiInsideParenthesis implements iNode {"},{"action":"insertText","range":{"start":{"row":0,"column":50},"end":{"row":1,"column":0}},"text":"\n"},{"action":"insertLines","range":{"start":{"row":1,"column":0},"end":{"row":28,"column":0}},"lines":["  SabiSabi exp1, exp2;            // left and right subexpression ","  String kind;                  // comparison operator","","  public SabiSabiInsideParenthesis1(SabiSabi e1, String type, SabiSabi e2) {","    exp1=e1;","    kind=type;","    exp2=e2;","  }","","  public String toString() {","      return \"(\"+exp1+kind+exp2+\")\";","","  }","","  public boolean interpret(int[] in, int[] par) {","    //int e1 = exp1.interpret();","    //int e2 = exp2.interpret();","    switch(kind) {","    case \"+\": return(e1+e2);","    case \"-\": return(e1-e2);","    case \"*\": return(e1*e2);","    case \"/\": return(e1/e2);","    case \"%\": return(e1%e2);","    }","","    return(false);     // error","  }"]},{"action":"insertText","range":{"start":{"row":28,"column":0},"end":{"row":28,"column":1}},"text":"}"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":20,"column":0},"end":{"row":20,"column":28}},"text":"    case \"-\": return(e1-e2);"},{"action":"removeLines","range":{"start":{"row":19,"column":0},"end":{"row":20,"column":0}},"nl":"\n","lines":["    case \"+\": return(e1+e2);"]}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":18,"column":18},"end":{"row":19,"column":0}},"text":"\n"}]}],[{"group":"doc","deltas":[{"action":"removeText","range":{"start":{"row":4,"column":34},"end":{"row":4,"column":35}},"text":"1"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":4,"column":34},"end":{"row":4,"column":35}},"text":"2"}]}],[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":0,"column":31},"end":{"row":0,"column":32}},"text":"2"}]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":26,"column":1},"end":{"row":26,"column":1},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1416030735000,"hash":"69e07d02579deda05d9a908c57efca49781c5761"}