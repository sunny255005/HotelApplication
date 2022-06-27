package com.hotelapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Menu {
	@Id
	@GeneratedValue(generator="menu_id",strategy=GenerationType.IDENTITY)
	@SequenceGenerator(name="menu_id",sequenceName="menu_id")
	private Integer menuId;
	private String menuName;
	private String menuPrice;
	@ManyToOne
	private Hotel hotel;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(String menuName, String menuPrice) {
		super();
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}
	@Override
	public String toString() {
		return "Menu [menuName=" + menuName + ", menuPrice=" + menuPrice + "]";
	}
	
	
	
}
