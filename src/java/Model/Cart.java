/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class Cart implements Serializable {
	private String id;
	private User buyer;
	private Date buyDate;
	public Cart() {
		super();
	}
	public Cart(String id, User buyer, Date buyDate) {
		super();
		this.id = id;
		this.buyer = buyer;
		this.buyDate = buyDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getBuyer() {
		return buyer;
	}
	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}
	public Date getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	
}
