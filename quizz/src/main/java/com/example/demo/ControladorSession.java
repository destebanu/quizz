package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorSession {

	
	@GetMapping("/start")
	public String start(Model model, HttpSession session) {
		
		return "start";
	}
	
	
	@PostMapping("/persistMessage")
	public String start(@RequestParam("name") String name, HttpServletRequest request) {
				
		request.getSession().setAttribute("r0", name);
		return "redirect:/p1";
	}

	@PostMapping("/destroy")
	public String destroySession(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/start";
	}
	
	@GetMapping("/p1")
	public String p1(Model model, HttpSession session) {
		
		return "p1";
	}
	
	
	@PostMapping("/pm1")
	public String p1(@RequestParam("respuesta") String respuesta, HttpServletRequest request) {
				
		request.getSession().setAttribute("r1", respuesta);
		return "redirect:/p2";
	}
		
		@GetMapping("/p2")
		public String p2(Model model, HttpSession session) {
			
			return "p2";
		}
		
		
		@PostMapping("/pm2")
		public String p2(@RequestParam("respuesta") String respuesta, HttpServletRequest request) {
			
			request.getSession().setAttribute("r2", respuesta);
			return "redirect:/p3";
		}
			
			@GetMapping("/p3")
			public String p3(Model model, HttpSession session) {
				
				return "p3";
			}
			
			
			@PostMapping("/pm3")
			public String p3(@RequestParam("respuesta") String respuesta, HttpServletRequest request) {
								
				request.getSession().setAttribute("r3", respuesta);
				return "redirect:/p4";
				
				
	}
			@GetMapping("/p4")
			public String p4(Model model, HttpSession session) {
				
				return "p4";
			}
			
			
			@PostMapping("/pm4")
			public String p4(@RequestParam("respuesta") String respuesta, HttpServletRequest request) {
				
				request.getSession().setAttribute("r4", respuesta);
				return "redirect:/p5";
				
				
	}
			@GetMapping("/p5")
			public String p5(Model model, HttpSession session) {
				
				return "p5";
			}
			
			
			@PostMapping("/pm5")
			public String p5(@RequestParam("respuesta") String respuesta, HttpServletRequest request) {
				
				request.getSession().setAttribute("r5", respuesta);
				return "redirect:/p6";
				
				
	}
			@GetMapping("/p6")
			public String p6(Model model, HttpSession session) {
				
				return "p6";
			}
			
			// COMO PONER REQUEST PARA 3 RESPUESTAS
			@PostMapping("/pm6")
			public String p6(@RequestParam("respuesta") String respuesta1, String respuesta2, String respuesta3, HttpServletRequest request) {
				
				String messages[] = new String[3];
					
				messages[0] = respuesta1;
				messages[1] = respuesta2;
				messages[2] = respuesta3;
				
				String respuesta = "";
				int aux = 0;
				
				for (String elemento: messages)
					if (elemento != null && !elemento.equals(""))
						aux++;
			
				if (aux == 3)
					respuesta = "bard";
				else if (aux == 0)
					respuesta = "cleric";
				else respuesta = "barbarian";
				
				
				
				request.getSession().setAttribute("r6", respuesta);
				return "redirect:/p7";
				
				
	}
			@GetMapping("/p7")
			public String p7(Model model, HttpSession session) {
				
				return "p7";
			}
			
			
			@PostMapping("/pm7")
			public String p7(@RequestParam("respuesta") String respuesta, HttpServletRequest request) {
				
				request.getSession().setAttribute("r7", respuesta);
				return "redirect:/resultado";
				
				
	}
			@GetMapping("/resultado")
			public String resultado(Model model, HttpSession session) {
				
				return "resultado";
			}
			
		
	
	
	
}