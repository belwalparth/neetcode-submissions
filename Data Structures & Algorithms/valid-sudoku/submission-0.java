class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Map<Character, Integer>> row = new HashMap<>();
        Map<Integer, Map<Character, Integer>> col = new HashMap<>();
        Map<Integer, Map<Character, Integer>> box = new HashMap<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                continue;
                int bp=0;
                switch (i/3){
                    case 0: 
                    switch(j/3){
                        case 0:
                        bp=0;
                        break;
                        case 1:
                        bp=1;
                        break;
                        case 2:
                        bp=2;
                        break;
                    }
                    break;
                    case 1: 
                    switch(j/3){
                        case 0:
                        bp=3;
                        break;
                        case 1:
                        bp=4;
                        break;
                        case 2:
                        bp=5;
                        break;
                    }
                    break;
                    case 2: 
                    switch(j/3){
                        case 0:
                        bp=6;
                        break;
                        case 1:
                        bp=7;
                        break;
                        case 2:
                        bp=8;
                        break;
                    }
                    break;
                } 
                row.putIfAbsent(i, new HashMap<>());
                col.putIfAbsent(j, new HashMap<>());
                box.putIfAbsent(bp, new HashMap<>());
                Map<Character,Integer> r= row.get(i);
                Map<Character,Integer> c= col.get(j);
                Map<Character,Integer> b= box.get(bp);
                r.put(board[i][j],r.getOrDefault(board[i][j],0)+1);
                c.put(board[i][j],c.getOrDefault(board[i][j],0)+1);
                b.put(board[i][j],b.getOrDefault(board[i][j],0)+1);
                row.put(i,r);
                col.put(j,c);
                box.put(bp,b);

            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                continue;
                int bp=0;
                switch (i/3){
                    case 0: 
                    switch(j/3){
                        case 0:
                        bp=0;
                        break;
                        case 1:
                        bp=1;
                        break;
                        case 2:
                        bp=2;
                        break;
                    }
                    break;
                    case 1: 
                    switch(j/3){
                        case 0:
                        bp=3;
                        break;
                        case 1:
                        bp=4;
                        break;
                        case 2:
                        bp=5;
                        break;
                    }
                    break;
                    case 2: 
                    switch(j/3){
                        case 0:
                        bp=6;
                        break;
                        case 1:
                        bp=7;
                        break;
                        case 2:
                        bp=8;
                        break;
                    }
                    break;
                } 
                Map<Character,Integer> r= new HashMap<>();
                Map<Character,Integer> c= new HashMap<>();
                Map<Character,Integer> b= new HashMap<>();
                r=row.get(i);
                c=col.get(j);
                b=box.get(bp);
                if(r.get(board[i][j])+c.get(board[i][j])+b.get(board[i][j])>3)
                return false;
            }
        }
        return true;
    }
}
