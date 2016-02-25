package labtest01;

public class ItemDecorator implements ItemInterface {
	private final ItemInterface aDecorated;
	private final String prefix = "ITEM-";
	
	
	public ItemDecorator(Item pItem)
	{
		aDecorated = pItem;
	}
	
	@Override
	public int getId()
	{
		return aDecorated.getId();
	}
	
	@Override
	public String getName(){
		return prefix + aDecorated.getName();
	}
}
