class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] arr1 = new Set[9];
        Set<Character>[] arr2 = new Set[9];
        Set<Character>[] arr3 = new Set[9];
        for(int i = 0;i<9;i++){
            arr1[i] = new HashSet<>();
            arr2[i] = new HashSet<>();
            arr3[i] = new HashSet<>();
        }
        for(int i = 0;i < 9;i++){
            for(int j = 0;j < 9;j++){
                char ch = board[i][j];
                if(ch == '.') continue;
                if(arr1[i%9].contains(ch) || arr2[j%9].contains(ch) || arr3[(i/3)*3 + (j/3)].contains(ch)) return false;
                arr1[i%9].add(ch);
                arr2[j%9].add(ch);
                arr3[(i/3)*3 + (j/3)].add(ch);

            }
        }
        return true;
    }
}
/* 
arr1[i%9] = board[i][j]
arr2[j%9] = board[i][j]
arr3[i/3][j/3] = board[i][j]
List<Set<Character>> arr3 = new ArrayList<>();

int[][] arr3 = new int[3][3]
[[],[],[],
 [],[],[],
 [],[],[]]
(0,0), (0,1), (0,2)
(1,0), (1,1), (1,2)
(2,0), (2,1), (2,2)
*/