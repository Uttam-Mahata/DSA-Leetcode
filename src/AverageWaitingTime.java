class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        int i = 0;
        int time = 0;
        double waitingTime = 0;
        while(i < n) {
            if(customers[i][0] >= time) {
                time = customers[i][0] + customers[i][1];
                waitingTime += customers[i][1];
                i++;
            } else {
                waitingTime += time - customers[i][0] + customers[i][1];
                time += customers[i][1];
                i++;
            }
        }
        return waitingTime / n;
        
    }

    public static void main(String[] args) {
        int[][] customers = {{1, 2}, {2, 5}, {4, 3}};
        AverageWaitingTime averageWaitingTime = new AverageWaitingTime();
        System.out.println(averageWaitingTime.averageWaitingTime(customers));
    }
}