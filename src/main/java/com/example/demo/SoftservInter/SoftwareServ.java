package com.example.demo.SoftservInter;
import java.util.List;
import com.example.demo.model.Software;

public interface SoftwareServ {

	Software saveSoftware(Software soft);
	List<Software> getSoftwareFromDb();
	Software getSoftwareById(int softwareId);
	Software updateSoftwareDetailsById(Software soft, int softwareId);
	void deleteSoftwareById(int softwareId);
}