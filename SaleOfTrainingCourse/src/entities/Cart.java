package entities;

import java.util.List;

public class Cart {
	
	private int idCart;
	private List<Order> orders;
	/**
	 * @param idCart
	 * @param orders
	 */
	public Cart(int idCart, List<Order> orders) {
		super();
		this.idCart = idCart;
		this.orders = orders;
	}
	/**
	 * @return the idCart
	 */
	public int getIdCart() {
		return idCart;
	}
	/**
	 * @param idCart the idCart to set
	 */
	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}
	/**
	 * @return the orders
	 */
	public List<Order> getOrders() {
		return orders;
	}
	/**
	 * @param orders the orders to set
	 */
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Cart [idCart=" + idCart + ", orders=" + orders + "]";
	}
}
