package com.nit.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.VehicleModel;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	Map<Integer,VehicleModel> vdetails=new HashMap<>();
		
	@GetMapping
	public Collection<VehicleModel> getVehicles() {
		return vdetails.values();
	}
	
	@PostMapping
	public String postVehicle(@RequestBody VehicleModel vehicle) {
		VehicleModel vm= new VehicleModel();
		vm.setVid(vehicle.getVid());
		vm.setVname(vehicle.getVname());
		vm.setVtype(vehicle.getVtype());
		vm.setVowner(vehicle.getVowner());
		vdetails.put(vehicle.getVid(), vm);
		
		return "Vehicles posted...";
	}
	
	
	

}
