package com.example.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.SoftservInter.SoftwareServ;
import com.example.demo.model.Software;
import com.example.demo.repository.SoftwareRepo;

@Service
public class SoftwareServiceImpl implements SoftwareServ{

	SoftwareRepo softRepo;

	public SoftwareServiceImpl(SoftwareRepo softRepo) {
		this.softRepo = softRepo;
	}

	public Software saveSoftware(Software soft) {
		return softRepo.save(soft);
	}

	@Override
	public List<Software> getSoftwareFromDb() {
		
		return softRepo.findAll();
	}

	@Override
	public Software getSoftwareById(int softwareId) {
		Optional<Software> soft = softRepo.findById(softwareId);
		if(soft.isPresent()) {
			return soft.get();
		}
		else {
			return null;
		}
		
	}

	@Override
	public Software updateSoftwareDetailsById(Software newVal, int softwareId) {
		
		Optional<Software> soft = softRepo.findById(softwareId);
		if(soft.isPresent()) {
			Software existingSoftware = soft.get();  

			existingSoftware.setName(newVal.getName());
			existingSoftware.setVersion(newVal.getVersion());
			existingSoftware.setReleaseDate(newVal.getReleaseDate());
			existingSoftware.setPrice(newVal.getPrice());
			existingSoftware.setOperatingSystems(newVal.getOperatingSystems());
			existingSoftware.setInstallerSize(newVal.getInstallerSize());
			existingSoftware.setRatings(newVal.getRatings());
			existingSoftware.setDescription(newVal.getDescription());
			softRepo.save(existingSoftware);
			return existingSoftware;
		}
		else {
			return null;
		}
		
		
	}

	@Override
	public void deleteSoftwareById(int softwareId) {
		Optional<Software> soft = softRepo.findById(softwareId);
		if(soft.isPresent()) {
			softRepo.deleteById(softwareId);
		}
		
	}
}

	