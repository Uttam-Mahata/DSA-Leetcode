class AlternatingGroupsI {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[(i + 1) % n] && colors[(i + 1) % n] != colors[(i + 2) % n]) {
                count++;
            }
        }
        
        return count;
        
    }

    public static void main(String[] args) {
        int[] colors = {1, 2, 1, 2, 1};
        AlternatingGroupsI alternatingGroupsI = new AlternatingGroupsI();
        System.out.println(alternatingGroupsI.numberOfAlternatingGroups(colors));
    }
}