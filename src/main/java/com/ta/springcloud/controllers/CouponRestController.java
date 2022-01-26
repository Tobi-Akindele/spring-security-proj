package com.ta.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ta.springcloud.model.Coupon;
import com.ta.springcloud.repos.CouponRepository;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

	@Autowired
	private CouponRepository couponRepository;
	
	@PostMapping(value = "/coupon")
	public Coupon create(@RequestBody Coupon coupon) {
		return couponRepository.save(coupon);
	}
	
	@GetMapping(value = "/coupon/{code}")
	public Coupon getCoupon(@PathVariable("code") String code) {
		return couponRepository.findByCode(code);
	}
}
