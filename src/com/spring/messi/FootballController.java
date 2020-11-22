package com.spring.messi;

import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.messi.player.FootballPlayer;

@Controller
@RequestMapping("/football")
public class FootballController {

//this is for git check
	@Autowired
	private SampleBean sampleBean;
	
	@Value("#{characterBio}")
	private HashMap<String,String> characterMap;
	
	@InitBinder
	public void binder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, trimmerEditor);
	}
	
	@RequestMapping("/home")
	public String startPage()
	{
		System.out.println("Username : " + sampleBean.getUserName());
		System.out.println("CharacterMap : " + characterMap);
		return "footballHome";
	}
	
	@ModelAttribute
	public void fillModel(Model model)
	{
		model.addAttribute("character",characterMap);
	}
	
	@RequestMapping("/create")
	public String createPlayer(Model model)
	{
		return "newPlayer";
	}
	/*
	@ModelAttribute("footballPlay")
	public void generateForm(Model model)
	{
		model.addAttribute("footballPlay", new FootballPlayer());
	}
	*/
	 
	@ModelAttribute("footballTennis")
	public FootballPlayer generateForm()
	{
		return new FootballPlayer();
	}
	
	@RequestMapping("/processFootballPlayer")
	public String success(@Valid @ModelAttribute("footballTennis") FootballPlayer footballPlayer,BindingResult br,Model model)
	{
		System.out.println(br);
		if(br.hasErrors())
		{
			return "newPlayer";
		}
		System.out.println("FirstName " + footballPlayer.getFirstName());
		System.out.println("LastName " + footballPlayer.getLastName());
		model.addAttribute("superPlayer", footballPlayer);
		return "success"; 
	}
}
