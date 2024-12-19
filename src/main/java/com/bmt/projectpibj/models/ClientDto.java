package com.bmt.projectpibj.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class ClientDto {

	@NotEmpty(message = "Nama depan harus diisi")
	private String firstName;
	
	@NotEmpty(message = "Nama belakang harus diisi")
	private String lastName;
	
	@NotEmpty(message = "Email harus diisi")
	@Email
	private String email;
	
	private String nomorhp;
	private String alamat;
	
	@NotEmpty(message = "Status harus diisi")
	private String status; // Dalam proses, Butuh persetujuan, Selesai, Batal

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomorhp() {
        return nomorhp;
    }

    public void setNomorhp(String nomorhp) {
        this.nomorhp = nomorhp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}

