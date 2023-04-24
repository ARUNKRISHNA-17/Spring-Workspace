package com.example.demo.review;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Laptop_DBMS")
public class Laptop_DBMS 
{
	@Id    
	private int Laptop_Id;
	private String A_Laptop_Name;
	private String B_CPU;
	private String C_GPU;
	private String D_Ram;
	private String E_Storage;
	private String F_Additional_Features;
	private String G_Amenities_Provided;
	private String H_Laptop_Total_Price;
	private int I_Customer_Ratings;
	private int J_No_of_Laptops_in_Stock;
	private int K_No_of_Laptops_to_be_Ordered;
	private int L_No_of_Laptops_in_for_Service;
	private int M_No_of_Laptops_to_be_out_for_delivery;
	
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
	public String getB_CPU() {
		return B_CPU;
	}
	public void setB_CPU(String b_CPU) {
		B_CPU = b_CPU;
	}
	public String getC_GPU() {
		return C_GPU;
	}
	public void setC_GPU(String c_GPU) {
		C_GPU = c_GPU;
	}
	public String getD_Ram() {
		return D_Ram;
	}
	public void setD_Ram(String d_Ram) {
		D_Ram = d_Ram;
	}
	public String getE_Storage() {
		return E_Storage;
	}
	public void setE_Storage(String e_Storage) {
		E_Storage = e_Storage;
	}
	public String getF_Additional_Features() {
		return F_Additional_Features;
	}
	public void setF_Additional_Features(String f_Additional_Features) {
		F_Additional_Features = f_Additional_Features;
	}
	public String getG_Amenities_Provided() {
		return G_Amenities_Provided;
	}
	public void setG_Amenities_Provided(String g_Amenities_Provided) {
		G_Amenities_Provided = g_Amenities_Provided;
	}
	public String getH_Laptop_Total_Price() {
		return H_Laptop_Total_Price;
	}
	public void setH_Laptop_Total_Price(String h_Laptop_Total_Price) {
		H_Laptop_Total_Price = h_Laptop_Total_Price;
	}
	public int getI_Customer_Ratings() {
		return I_Customer_Ratings;
	}
	public void setI_Customer_Ratings(int i_Customer_Ratings) {
		I_Customer_Ratings = i_Customer_Ratings;
	}
	public int getJ_No_of_Laptops_in_Stock() {
		return J_No_of_Laptops_in_Stock;
	}
	public void setJ_No_of_Laptops_in_Stock(int j_No_of_Laptops_in_Stock) {
		J_No_of_Laptops_in_Stock = j_No_of_Laptops_in_Stock;
	}
	public int getK_No_of_Laptops_to_be_Ordered() {
		return K_No_of_Laptops_to_be_Ordered;
	}
	public void setK_No_of_Laptops_to_be_Ordered(int k_No_of_Laptops_to_be_Ordered) {
		K_No_of_Laptops_to_be_Ordered = k_No_of_Laptops_to_be_Ordered;
	}
	public int getL_No_of_Laptops_in_for_Service() {
		return L_No_of_Laptops_in_for_Service;
	}
	public void setL_No_of_Laptops_in_for_Service(int l_No_of_Laptops_in_for_Service) {
		L_No_of_Laptops_in_for_Service = l_No_of_Laptops_in_for_Service;
	}
	public int getM_No_of_Laptops_to_be_out_for_delivery() {
		return M_No_of_Laptops_to_be_out_for_delivery;
	}
	public void setM_No_of_Laptops_to_be_out_for_delivery(int m_No_of_Laptops_to_be_out_for_delivery) {
		M_No_of_Laptops_to_be_out_for_delivery = m_No_of_Laptops_to_be_out_for_delivery;
	}
	
}
