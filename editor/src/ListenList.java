
public class ListenList extends java.util.Observable {
	
	private String item;
	
	public String getItem(){
		return item;
	}
	
	public void setItem(String item){
		
		this.item = item;
		notifyObservers();
	}

}

