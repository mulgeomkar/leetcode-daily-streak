class Solution {
    public int maxDistance(String s, int k) {
        int result = 0;
        int northSteps = 0, southSteps = 0, eastSteps = 0, westSteps = 0;

        for (int index = 0; index < s.length(); index++) {
            char direction = s.charAt(index);

            if (direction == 'N') northSteps++;
            else if (direction == 'S') southSteps++;
            else if (direction == 'E') eastSteps++;
            else if (direction == 'W') westSteps++;

            int vertical = Math.abs(northSteps - southSteps);
            int horizontal = Math.abs(eastSteps - westSteps);
            int manhattanDist = vertical + horizontal;

            int totalDist = manhattanDist + Math.min(2 * k, index + 1 - manhattanDist);
            result = Math.max(result, totalDist);
        }

        return result;
    }
}
