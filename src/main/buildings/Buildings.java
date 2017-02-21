package main.buildings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class Buildings
{
    private static Map<String, String[]> buildings = new HashMap<>();
    private static Buildings instance;

    private Buildings()
    {
        buildings.put("Cab", new String[]{"Builder"});
        buildings.put("Cottage", new String[]{"Builder", "Finisher", "Designer"});
        buildings.put("Mansion", new String[]{"Builder", "Finisher", "Engineer", "Designer", "Architect"});
        buildings.put("Dwelling House", new String[]{"Firefighter", "Builder", "Finisher", "Engineer", "Designer", "Architect"});
    }
    public static Buildings newInstance()
    {
        if (instance == null)
        {
            return instance = new Buildings();
        }
        return instance;
    }
    public String[] getBuilding(String building)
    {
        return buildings.get(building);
    }
    public void addBuilding(String building, String[] info)
    {
        buildings.put(building, info);
    }
    public Set<String> getAllBuildingTypes()
    {
        return buildings.keySet();
    }
    public int getAllBuildingTypesAmount()
    {
        return buildings.size();
    }
}
