class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int st = 0;
        int end = matrix.length*matrix[0].length-1;
        int r = 0, c = 0;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            r = mid /matrix[0].length;
            c = mid % matrix[0].length;
            if (matrix[r][c] == target)
                return true;
            else if (matrix[r][c] < target) {
                st = mid + 1;
            } else
                end = mid - 1;
        }
        return false;
    }
}