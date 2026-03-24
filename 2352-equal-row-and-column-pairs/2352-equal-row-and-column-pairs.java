class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map = new HashMap<>();

        int n = grid.length;
        for(int i = 0; i < n; i++) {
            String barkod = Arrays.toString(grid[i]);
            map.put(barkod, map.getOrDefault(barkod, 0) + 1);
        }
        int eslesmeSayisi = 0;
        //c: column
        for(int c = 0; c < n; c++) {
            int[] geciciSütun = new int[n];
            for(int r = 0; r < n; r++) {
                geciciSütun[r] =grid[r][c];

            }
            String sutunBarkodu = Arrays.toString(geciciSütun);
           eslesmeSayisi += map.getOrDefault(sutunBarkodu, 0);
        }
        return eslesmeSayisi;

        }
        
    }
