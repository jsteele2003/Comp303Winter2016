package labtest01;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public class Corporation
{
	private static Corporation instance = null;
	protected Corporation()
	{
		
	}
	
	public static Corporation getInstance() 
	{
		if(instance == null)
		{
			instance = new Corporation();
		}
		return instance;
	}
	
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
	
	/**
	 * @param pInventory An inventory to add to the corporation.
	 */
	public void addInventory(Inventory pInventory)
	{
		aInventories.put(pInventory.getName(), pInventory);
	}
}
