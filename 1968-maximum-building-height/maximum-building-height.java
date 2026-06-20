class Solution {
    public int maxBuilding(int n, int[][] r) {
        int m = r.length;
        if (m == 0) return n - 1;
        Arrays.sort(r, (a, b) -> Integer.compare(a[0], b[0]));
        r[0][1] = Math.min(r[0][1], r[0][0] - 1);
        for (int i = 1; i < m; i++) {
            int gap = r[i][0] - r[i - 1][0];
            r[i][1] = Math.min(
                r[i][1],
                r[i - 1][1] + gap
            );
        }
        for (int i = m - 2; i >= 0; i--) {
            int gap = r[i + 1][0] - r[i][0];
            r[i][1] = Math.min(
                r[i][1],
                r[i + 1][1] + gap
            );
        }
        int maxHeight = 0;
        int firstPos = r[0][0];
        int gap = firstPos - 1;
        int firstHeight = r[0][1];
        int peakHeight = (0 + firstHeight + gap) / 2;
        maxHeight = Math.max(
            maxHeight,
            peakHeight 
        );
        int stPos = r[0][0];
        int stHeight = r[0][1];
        for (int i = 1; i < m; i++) {
            int endPos = r[i][0];
            int endHeight = r[i][1];
            gap = endPos - stPos;
            peakHeight = (stHeight + endHeight + gap) / 2;
            maxHeight = Math.max(maxHeight, peakHeight);
            // System.out.println(stHeight+" "+endHeight+" "+gap+" "+peakHeight);
            stPos = endPos;
            stHeight = endHeight;
        }
        maxHeight = Math.max(
            maxHeight,
            stHeight+(n-stPos)
        );
        return maxHeight;
    }
}