package com.sayem.head_first_java.simple_dotcom;

public class SimpleDotCom {
    int [] locationCells;
    int numberOfHits = 0;


    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourSelf(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells){
            if (guess == cell){
                result = "hit";
                numberOfHits++;
                break;
            }
        }

        if (numberOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
