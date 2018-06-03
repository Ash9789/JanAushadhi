package com.CodeCommunity.JanAushadhi.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.CodeCommunity.JanAushadhi.Model.MedicineInfo;
import com.CodeCommunity.JanAushadhi.Repository.MedicineRepository;

@Controller
public class HomeController {

	@Autowired
	MedicineRepository medicineRepo;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String loginMessage(ModelMap model) {
		List<MedicineInfo> allMedicine = medicineRepo.findAll();
		model.put("allMedicine", allMedicine);

		return "Index";
	}

	@RequestMapping(value = "/add-med", method = RequestMethod.GET)
	public String medicineAdd(ModelMap model) {

		return "medicine_add";
	}

	@RequestMapping(value = "/addMed.htm", method = RequestMethod.POST)
	String add(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MedicineInfo med = new MedicineInfo();

		String medicineName = request.getParameter("medicineName");
		String genericName = request.getParameter("genericName");
		String indications = request.getParameter("indications");
		String dosage = request.getParameter("dosage");
		String drugForm = request.getParameter("drugForm");
		String sideEffects = request.getParameter("sideEffects");
		
		med.setMedicineName(medicineName);
		med.setGenericName(genericName);
		med.setDosage(dosage);
		med.setDrugForm(drugForm);
		med.setIndications(indications);
		med.setSideEffects(sideEffects);
		
		medicineRepo.save(med);
		
		return "redirect:home";

	}

}
