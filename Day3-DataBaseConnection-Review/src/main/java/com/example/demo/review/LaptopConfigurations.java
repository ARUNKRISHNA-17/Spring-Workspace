package com.example.demo.review;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Laptop_Configurations")
public class LaptopConfigurations 
{
	@Id
	private int Laptop_Id;
	private String A_Laptop_Name;
	private String B_Ram_Capacity;
	private String C_Ram_Type; 
	private String D_Storage_Capacity;
	private String E_Storage_Type;
	private String F_Additional_Storage_Present;
	private String G_Additional_Features;
	private String H_Amenities_Provided;
	private String I_Laptop_Total_Price;
	
	public int getLaptop_Id() {
		return Laptop_Id;
	}
	public void setLaptop_Id(int laptop_Id) {
		Laptop_Id = laptop_Id;
	}
	public String getA_Laptop_Name() {
		return A_Laptop_Name;
	}
	public void setA_Laptop_Name(String a_Laptop_Name) {
		A_Laptop_Name = a_Laptop_Name;
	}
	public String getB_Ram_Capacity() {
		return B_Ram_Capacity;
	}
	public void setB_Ram_Capacity(String b_Ram_Capacity) {
		B_Ram_Capacity = b_Ram_Capacity;
	}
	public String getC_Ram_Type() {
		return C_Ram_Type;
	}
	public void setC_Ram_Type(String c_Ram_Type) {
		C_Ram_Type = c_Ram_Type;
	}
	public String getD_Storage_Capacity() {
		return D_Storage_Capacity;
	}
	public void setD_Storage_Capacity(String d_Storage_Capacity) {
		D_Storage_Capacity = d_Storage_Capacity;
	}
	public String getE_Storage_Type() {
		return E_Storage_Type;
	}
	public void setE_Storage_Type(String e_Storage_Type) {
		E_Storage_Type = e_Storage_Type;
	}
	public String getF_Additional_Stroage_Present() {
		return F_Additional_Storage_Present;
	}
	public void setF_Additional_Stroage_Present(String f_Additional_Stroage_Present) {
		F_Additional_Storage_Present = f_Additional_Stroage_Present;
	}
	public String getG_Additional_Features() {
		return G_Additional_Features;
	}
	public void setG_Additional_Features(String g_Additional_Features) {
		G_Additional_Features = g_Additional_Features;
	}
	public String getH_Amenities_Provided() {
		return H_Amenities_Provided;
	}
	public void setH_Amenities_Provided(String h_Amenities_Provided) {
		H_Amenities_Provided = h_Amenities_Provided;
	}
	public String getI_Laptop_Total_Price() {
		return I_Laptop_Total_Price;
	}
	public void setI_Laptop_Total_Price(String i_Laptop_Total_Price) {
		I_Laptop_Total_Price = i_Laptop_Total_Price;
	}
	
	
}
