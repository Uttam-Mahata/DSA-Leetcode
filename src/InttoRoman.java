public class InttoRoman {
    public String intToRoman(int num) {
        int[] values = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (num > 0) {
            while (num >= values[index]) {
                sb.append(symbols[index]);
                num -= values[index];
            }
            index++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        InttoRoman itr = new InttoRoman();
        System.out.println(itr.intToRoman(3));
    }
    
}
