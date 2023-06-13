package com.scotiabankcolpatria.hiring;

public class CreditRiskAssessment {
    
    public double standardDeviation(int[] paymentDelays) {
        int total = 0;
        double media = 0;
        double desviation= 0;

        for(int i = 0; i < paymentDelays.length; i++) {
            total += paymentDelays[i];
        }
        
        media = total / paymentDelays.length;

        for(int i = 0; i < paymentDelays.length; i++) {
            desviation = Math.pow(paymentDelays[i] - media, 2);
        }

        return Math.sqrt(desviation / paymentDelays.length);
    }

   
    public int paymentDelayMaxPeakIndex(int[] paymentDelays) {
        int max = 0;
        int index = 0;

        for(int i = 0; i < paymentDelays.length; i++) {
            if(paymentDelays[i] > max) {
                max = paymentDelays[i];
                index = i;
            }
        }
        return index;
    }

    public double[] latePaymentProbabilityByPeriod(int[][] paymentDelays) {
        
        double[] probability = new double[paymentDelays.length];

        for(int i = 0; i < paymentDelays.length; i++) {

            int total = 0;
            for(int j = 0; j < paymentDelays[i].length; j++) {
                total += paymentDelays[i][j];
            }

            probability[i] = total / paymentDelays[i].length;
        }
        
        return probability;
    }
}
