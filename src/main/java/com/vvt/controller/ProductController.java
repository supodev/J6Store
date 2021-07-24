package com.vvt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vvt.entity.Product;
import com.vvt.service.ProductSerivce;

@Controller
public class ProductController {
	@Autowired
	ProductSerivce productSerivce;

	@RequestMapping("product/list")
	public String list(Model model, @RequestParam("cid") Optional<String> cid) {
		if (cid.isPresent()) {
			List<Product> list = productSerivce.findByCategoryId(cid.get());
			model.addAttribute("items", list);
		} else {
			List<Product> list = productSerivce.findAll();
			model.addAttribute("items", list);
		}
		return "product/list";
	}

	@RequestMapping("product/detail/{id}")
	public String details(Model model, @PathVariable("id") Integer id) {
		Product item = productSerivce.findById(id);
		model.addAttribute("item", item);
		return "product/detail";
	}
}
