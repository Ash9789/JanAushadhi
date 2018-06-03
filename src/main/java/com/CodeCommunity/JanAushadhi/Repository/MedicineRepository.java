package com.CodeCommunity.JanAushadhi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CodeCommunity.JanAushadhi.Model.MedicineInfo;

public interface MedicineRepository  extends JpaRepository<MedicineInfo, String>  {

}
