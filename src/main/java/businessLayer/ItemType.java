package businessLayer;

public enum ItemType {
	RAW("Raw"),
	MANUFACTURED("Manufactured"),
	IMPORTED("Imported");
	
	private String itemTypeValue;
	
	private ItemType(String itemTypeValue){
		this.itemTypeValue = itemTypeValue;
	}

	public String getItemTypeValue() {
		return itemTypeValue;
	}

	public void setItemTypeValue(String itemTypeValue) {
		this.itemTypeValue = itemTypeValue;
	}
		
}
