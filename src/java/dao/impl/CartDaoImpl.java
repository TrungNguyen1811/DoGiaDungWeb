/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

/**
 *
 * @author kuku123
 */
import Model.Cart;
import Model.User;
import Service.UserService;
import Service.impl.UserServiceImpl;
import Utility.DB_Utility;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.CartDao;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CartDaoImpl extends DB_Utility implements CartDao {
	UserService userS = new UserServiceImpl();

	@Override
	public void insert(Cart cart) {
		String sql = "INSERT INTO Cart(id,u_id, buyDate) VALUES (?,?,?)";
		Connection con = DB_Utility.getJDBCConnection();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cart.getId());
			ps.setInt(2, cart.getBuyer().getId());
			ps.setDate(3, new Date(cart.getBuyDate().getTime()));
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
                }
	}

	@Override
	public void edit(Cart cart) {
		String sql = "UPDATE cart SET id_user = ?, buyDate = ? WHERE id = ?";
		Connection con = DB_Utility.getJDBCConnection();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cart.getBuyer().getId());
			ps.setDate(2, new Date(cart.getBuyDate().getTime()));
			ps.setString(3, cart.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
                Logger.getLogger(CartDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM cart WHERE id = ?";
		Connection con = DB_Utility.getJDBCConnection();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
                }
	}

	@Override
	public Cart get(int id) {
		String sql = "SELECT cart.id, cart.buyDate, User.email, user.username, user.id AS user_id "
				+ "FROM cart INNER JOIN user " + "ON cart.id_user = user.id WHERE cart.id=?";
		Connection con = DB_Utility.getJDBCConnection();

		try {
                    
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User user = userS.get(rs.getInt("user_id"));

				Cart cart = new Cart();
				cart.setId(rs.getString("id"));
				cart.setBuyDate(rs.getDate("buyDate"));
				cart.setBuyer(user);
				return cart;
			}
		} catch (SQLException e) {
			e.printStackTrace();
                }
		return null;
	}

	@Override
	public List<Cart> getAll() {
		List<Cart> cartList = new ArrayList<Cart>();
		String sql = "SELECT cart.id, cart.buyDate, User.email, user.username, user.id AS user_id "
				+ "FROM cart INNER JOIN user " + "ON cart.id_user = user.id";
                Connection con = DB_Utility.getJDBCConnection();
		try {
                       
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User user = userS.get(rs.getInt("user_id"));

				Cart cart = new Cart();
				cart.setId(rs.getString("id"));
				cart.setBuyDate(rs.getDate("buyDate"));
				cart.setBuyer(user);

				cartList.add(cart);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                }
		return cartList;
	}

	public List<Cart> search(String name) {
		List<Cart> cartList = new ArrayList<Cart>();
		String sql = "SELECT cart.id, cart.buyDate, User.email, user.username, user.id AS user_id "
				+ "FROM cart INNER JOIN user " + "ON cart.id_user = user.id LIKE User.email = ?";
		Connection con = DB_Utility.getJDBCConnection();

		try {
                        
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User user = userS.get(rs.getInt("user_id"));
				Cart cart = new Cart();
				cart.setId(rs.getString("id"));
				cart.setBuyDate(rs.getDate("buyDate"));
				cart.setBuyer(user);
				cartList.add(cart);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                }
		return cartList;
	}

	@Override
	public Cart get(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}

