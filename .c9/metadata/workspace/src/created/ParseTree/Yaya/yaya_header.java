{"changed":true,"filter":false,"title":"yaya_header.java","tooltip":"/src/created/ParseTree/Yaya/yaya_header.java","value":"package created.parseTree.Yaya;\n\nabstract class yaya_header implements created.iNode  \n{\n    public static class yayaHeader extends yaya_header\n    {\n        public String name;\n        public yaya_param_sec yps;\n        public data_type dt;\n        public String ret;\n        \n        public yayaHeader(String name, yaya_param_sec yps, data_type, dt, String ret)\n        {\n            this.name = name;\n            this.yps = yps;\n            this.dt = dt;\n            this.ret = ret;\n        }\n        \n        public yayaHeader(String name, yaya_param_sec yps)\n        {\n            this.name = name;\n            this.yps = yps;\n            dt = null;\n            ret = null;\n        }\n        \n        public String toString()\n        {\n            if(dt == null)\n                return name + \": Parameters - \" + yps.toString();\n            else\n                return name + \": Parameters - \" + yps.toString() + \", Return - \" + dt.toString() + \" \" + ret; \n        }\n    }\n    \n}","undoManager":{"mark":-1,"position":0,"stack":[[{"group":"doc","deltas":[{"action":"insertText","range":{"start":{"row":0,"column":31},"end":{"row":1,"column":0}},"text":"\n"}]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":1,"column":0},"end":{"row":1,"column":0},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1416058375401}