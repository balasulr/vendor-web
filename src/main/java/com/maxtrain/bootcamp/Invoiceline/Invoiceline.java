package com.maxtrain.bootcamp.Invoiceline;

import javax.persistence.*;

import com.maxtrain.bootcamp.invoice.Invoice;
import com.maxtrain.bootcamp.product.Product;

@Entity
public class Invoiceline {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int quantity;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="invoiceId",columnDefinition="int")
	private Invoice invoice; // FK to Invoice
	
	@ManyToOne(optional=false)
	@JoinColumn(name="productId",columnDefinition="int")
	private Product product; // FK to Product
	
	public Invoiceline() {}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}