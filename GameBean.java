package Test.ProjectBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class GameBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer productId;
	String E_name;
    String C_name;
    String img_url;
	String G_maker;
    String iss;
    String info;
    Integer Price;
    
    public GameBean(Integer productId,String E_name,String C_name,String img_url,String G_maker,String iss,String info,String Price) {
    	this.productId=productId;
    	this.E_name=E_name;
    	this.C_name=C_name;
    	this.img_url=img_url;
    	this.G_maker=G_maker;
    	this.iss=iss;
    	this.info=info;
    	this.Price=Integer.parseInt(Price);
    }
    
  
	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public String getE_name() {
		return E_name;
	}


	public void setE_name(String e_name) {
		E_name = e_name;
	}


	public String getC_name() {
		return C_name;
	}


	public void setC_name(String c_name) {
		C_name = c_name;
	}


	public String getImg_url() {
		return img_url;
	}


	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}


	public String getG_maker() {
		return G_maker;
	}


	public void setG_maker(String g_maker) {
		G_maker = g_maker;
	}


	public String getIss() {
		return iss;
	}


	public void setIss(String iss) {
		this.iss = iss;
	}


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}


	public Integer getPrice() {
		return Price;
	}


	public void setPrice(Integer price) {
		Price = price;
	}


	public GameBean() {	
    }

}
