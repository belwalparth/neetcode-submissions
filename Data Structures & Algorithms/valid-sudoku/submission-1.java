
class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<Integer, Map<Character, Integer>> row = new HashMap<>();
        Map<Integer, Map<Character, Integer>> col = new HashMap<>();
        Map<Integer, Map<Character, Integer>> box = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                char ch = board[i][j];
                int bp = (i / 3) * 3 + (j / 3);

                row.putIfAbsent(i, new HashMap<>());
                col.putIfAbsent(j, new HashMap<>());
                box.putIfAbsent(bp, new HashMap<>());

                Map<Character, Integer> r = row.get(i);
                Map<Character, Integer> c = col.get(j);
                Map<Character, Integer> b = box.get(bp);

                // Check duplicates
                if (r.containsKey(ch) ||
                    c.containsKey(ch) ||
                    b.containsKey(ch)) {
                    return false;
                }

                // Store the number
                r.put(ch, 1);
                c.put(ch, 1);
                b.put(ch, 1);
            }
        }

        return true;
    }
}
