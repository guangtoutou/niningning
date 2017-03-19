package com.niningning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;

import com.niningning.data.Distributor;
import com.niningning.db.DistributorRepository;

@Controller
public class HomeController {

	@Autowired
	DistributorRepository distRepository;

	@RequestMapping(value = "/distributor.json", method = GET)
	public @ResponseBody List<Distributor> home() {
		List<Distributor> distributors = distRepository.findAll();
		return distributors;
	}

	@RequestMapping(value = "/distributor.json", method = POST)
	public @ResponseBody void addDistributor(@RequestParam(value = "distName") String name,
			@RequestParam(value = "soldTo") String soldTo, @RequestParam(value = "address") String address) {
		Distributor distributor = new Distributor();
		distributor.setName(name);
		distributor.setSoldTo(soldTo);
		distributor.setAddress(address);
		distRepository.save(distributor);

	}
}
