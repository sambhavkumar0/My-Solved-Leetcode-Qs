class Profit{

    public static int MaxProfit(int[]prices){
        int lsf=Integer.MAX_VALUE;
        int op=0;
        int pist=0;
        for(int i=0 ; i<prices.length ; i++){
            if(prices[i]<lsf){
                lsf=prices[i];
            }
            pist=prices[i]-lsf;
            if(op<pist){
                op=pist;
            }
        }
        return op;

    }

    
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};//expected outcome:6-1=5(max profit)
        int result=MaxProfit(prices);
        System.out.println("the max profit is " + result);
    }
}
