package com.bodyrocks.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "gyms_detail")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","code","message"})

public class GymDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "location")
	private String location;

	@Column(name = "image1")
	private byte[] image1;
	
	@Column(name = "image2")
	private byte[] image2;
	
	@Column(name = "image3")
	private byte[] image3;
	
	@Column(name = "image4")
	private byte[] image4;
	
	@Column(name = "rating")
	private int rating;
	
	@Column(name="opening_time")
	private String openingTime;
	
	@Column(name="yoga")
	private Integer yoga;
	
	@Column(name="spa")
	private Integer spa;
	
	@Column(name="sauna_steam")
	private Integer saunaSteam;
	
	@Column(name="juicebar")
	private Integer juicebar;
	
	@Column(name="locker_room")
	private Integer lockerRoom;
	
	@Column(name="peronal_trainer")
	private Integer peronalTrainer;
	
	@Column(name="special_classes")
	private String specialClasses;
	
	@Column(name="contact_email")
	private String contactEmail;
	
	@Column(name="contact_phone")
	private String contactPhone;
	
	@Column(name="offers_detail")
	private String offerDetail;
	
	@Column(name="aerobics")
	private String aerobics;
	
	public byte[] getImage1() {
		return image1;
	}

	public void setImage1(byte[] image1) {
		this.image1 = image1;
	}

	public byte[] getImage2() {
		return image2;
	}

	public void setImage2(byte[] image2) {
		this.image2 = image2;
	}

	public byte[] getImage3() {
		return image3;
	}

	public void setImage3(byte[] image3) {
		this.image3 = image3;
	}

	public byte[] getImage4() {
		return image4;
	}

	public void setImage4(byte[] image4) {
		this.image4 = image4;
	}

	@Column(name = "city")
	private String city;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}

	public int getYoga() {
		return yoga;
	}

	public void setYoga(int yoga) {
		this.yoga = yoga;
	}

	public int getSpa() {
		return spa;
	}

	public void setSpa(int spa) {
		this.spa = spa;
	}

	public int getSaunaSteam() {
		return saunaSteam;
	}

	public void setSaunaSteam(int saunaSteam) {
		this.saunaSteam = saunaSteam;
	}

	public int getJuicebar() {
		return juicebar;
	}

	public void setJuicebar(int juicebar) {
		this.juicebar = juicebar;
	}

	public int getLockerRoom() {
		return lockerRoom;
	}

	public void setLockerRoom(int lockerRoom) {
		this.lockerRoom = lockerRoom;
	}

	public int getPeronalTrainer() {
		return peronalTrainer;
	}

	public void setPeronalTrainer(int peronalTrainer) {
		this.peronalTrainer = peronalTrainer;
	}

	public String getSpecialClasses() {
		return specialClasses;
	}

	public void setSpecialClasses(String specialClasses) {
		this.specialClasses = specialClasses;
	}

	public void setYoga(Integer yoga) {
		this.yoga = yoga;
	}

	public void setSpa(Integer spa) {
		this.spa = spa;
	}

	public void setSaunaSteam(Integer saunaSteam) {
		this.saunaSteam = saunaSteam;
	}

	public void setJuicebar(Integer juicebar) {
		this.juicebar = juicebar;
	}

	public void setLockerRoom(Integer lockerRoom) {
		this.lockerRoom = lockerRoom;
	}

	public void setPeronalTrainer(Integer peronalTrainer) {
		this.peronalTrainer = peronalTrainer;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getOfferDetail() {
		return offerDetail;
	}

	public void setOfferDetail(String offerDetail) {
		this.offerDetail = offerDetail;
	}

	public String getAerobics() {
		return aerobics;
	}

	public void setAerobics(String aerobics) {
		this.aerobics = aerobics;
	}

	
}
