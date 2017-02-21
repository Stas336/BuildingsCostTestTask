package main.workers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class Workers
{
    private static Map<String, int[]> workers = new HashMap<>();
    private static Workers instance;

    private Workers()
    {
        workers.put("Firefighter", new int[]{1,20});
        workers.put("Builder", new int[]{7,200});
        workers.put("Finisher", new int[]{2,100});
        workers.put("Engineer", new int[]{3,150});
        workers.put("Designer", new int[]{5,200});
        workers.put("Architect", new int[]{7,250});
    }
    public static Workers newInstance()
    {
        if (instance == null)
        {
            return instance = new Workers();
        }
        return instance;
    }
    public int[] getWorker(String profession)
    {
        return workers.get(profession);
    }
    public void addWorker(String profession, int[] info)
    {
        workers.put(profession, info);
    }
    public Set<String> getAllWorkerTypes()
    {
        return workers.keySet();
    }
    public int getAllWorkerTypesAmount()
    {
        return workers.size();
    }
}
