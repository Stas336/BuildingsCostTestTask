package main.main;

import main.buildings.Buildings;
import main.workers.Workers;

public class Main
{
    private static Workers workers = Workers.newInstance();
    private static Buildings buildings = Buildings.newInstance();

    public static void main(String[] args)
    {
        countSumTime();
    }

    private static void countSumTime()
    {
        for (String building:buildings.getAllBuildingTypes())
        {
            int maxDays = 0;
            int sum = 0;
            for (String profession:buildings.getBuilding(building))
            {
                int[] workerInfo = workers.getWorker(profession);
                if (workerInfo[0] > maxDays)
                {
                    maxDays = workerInfo[0];
                }
                sum += workerInfo[1];
            }
            System.out.printf("%s: Cost: %d, Days: %d\n", building, sum, maxDays);
        }
    }
}