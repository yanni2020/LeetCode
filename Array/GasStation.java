package Array;
/**
 * #134. Gas Station
 * 
 * There are N gas stations along a circular route, where the amount of gas at 
 * station i is gas[i].You have a car with an unlimited gas tank and it costs 
 * cost[i] of gas to travel from station i to its next station (i+1). 
 * You begin the journey with an empty tank at one of the gas stations.Return 
 * the starting gas station's index if you can travel around the circuit once 
 * in the clockwise direction, otherwise return -1.
 */

 /**
  * SOLUTION
  * https://blog.csdn.net/cslbupt/article/details/54588090
  */


public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        //find starting station.
        int startingIndex=-1;
        int now;
        int next;
        int tank;
        if(gas.length==1){
            if(gas[0]>=cost[0]){
                startingIndex = 0;
            }
        }
        for(int i=0; i<gas.length; i++){
            if(gas[i]>cost[i]){
                //get start
                startingIndex = i;
                if(startingIndex!=-1){
                    
                    tank = gas[startingIndex];
                    for(int j=startingIndex; j<gas.length+startingIndex; j++){
        
                        //wrap
                        now = j;
                        if(now >= gas.length){
                            now -= gas.length;
                        }
                        next = now+1;
                        if(next>=gas.length){
                            next-=gas.length;
                        }
        
                        if(tank >= cost[now]){
                            tank = tank - cost[now] + gas[next];
                        }
                        else{
                            startingIndex = -1;
                            break;
                        }
                    }
                    
                    if(startingIndex!=-1){
                        break;
                    }
                }
            }
        }
        return startingIndex;
        
    }
    public static void main(String[] args) {
        int[] gas = {5,1,2,3,4};
        int[] cost = {4,4,1,5,1};
        int[] gas2 = {1,2,3,4,5};
        int[] cost2 = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }
}
