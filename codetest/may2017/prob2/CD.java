package codetest.may2017.prob2;

public class CD extends LendingItem {
	
	private String productId;
	private String title;
	private String company;
	
	public CD(String productId, String title, String company) {
		  
		this.productId = productId;
		this.title = title;
		this.company = company;
	}		
 
	@Override
	public boolean equals(Object obj) {
		
		if(obj.getClass()!=this.getClass())
			return false;
		
		CD cd=(CD)obj;
		
		return productId.equals(cd.productId) && title.equals(cd.title) && company.equals(cd.company);
	}
}
