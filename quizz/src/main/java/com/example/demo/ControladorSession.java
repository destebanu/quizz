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
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");

		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);

		return "start";
	}
	
	
	@PostMapping("/persistMessage")
	public String start(@RequestParam("name") String name, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		}
		messages.add(name);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		return "redirect:/p1";
	}

	@PostMapping("/destroy")
	public String destroySession(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/start";
	}
	
	@GetMapping("/p1")
	public String p1(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");

		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);

		return "p1";
	}
	
	
	@PostMapping("/pm1")
	public String p1(@RequestParam("respuesta") String respuesta, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		}
		messages.add(respuesta);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		return "redirect:/p2";
	}
		
		@GetMapping("/p2")
		public String p2(Model model, HttpSession session) {
			@SuppressWarnings("unchecked")
			List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");

			if (messages == null) {
				messages = new ArrayList<>();
			}
			model.addAttribute("sessionMessages", messages);

			return "p2";
		}
		
		
		@PostMapping("/pm2")
		public String p2(@RequestParam("respuesta") String respuesta, HttpServletRequest request) {
			@SuppressWarnings("unchecked")
			List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
			if (messages == null) {
				messages = new ArrayList<>();
				request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
			}
			messages.add(respuesta);
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
			return "redirect:/p3";
		}
			
			@GetMapping("/p3")
			public String p3(Model model, HttpSession session) {
				@SuppressWarnings("unchecked")
				List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");

				if (messages == null) {
					messages = new ArrayList<>();
				}
				model.addAttribute("sessionMessages", messages);

				return "p3";
			}
			
			
			@PostMapping("/pm3")
			public String p3(@RequestParam("respuesta") HttpServletRequest request) {
				@SuppressWarnings("unchecked")
				List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
				if (messages == null) {
					messages = new ArrayList<>();
					request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
				}
				
				request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
				return "redirect:/p4";
				
				
	}
			@GetMapping("/p4")
			public String p4(Model model, HttpSession session) {
				@SuppressWarnings("unchecked")
				List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");

				if (messages == null) {
					messages = new ArrayList<>();
				}
				model.addAttribute("sessionMessages", messages);

				return "p4";
			}
			
			
			@PostMapping("/pm4")
			public String p4(@RequestParam("respuesta") String respuesta, HttpServletRequest request) {
				@SuppressWarnings("unchecked")
				List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
				if (messages == null) {
					messages = new ArrayList<>();
					request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
				}
				messages.add(respuesta);
				request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
				return "redirect:/p5";
				
				
	}
			@GetMapping("/p5")
			public String p5(Model model, HttpSession session) {
				@SuppressWarnings("unchecked")
				List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");

				if (messages == null) {
					messages = new ArrayList<>();
				}
				model.addAttribute("sessionMessages", messages);

				return "p5";
			}
			
			
			@PostMapping("/pm5")
			public String p5(@RequestParam("respuesta") String respuesta, HttpServletRequest request) {
				@SuppressWarnings("unchecked")
				List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
				if (messages == null) {
					messages = new ArrayList<>();
					request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
				}
				messages.add(respuesta);
				request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
				return "redirect:/p6";
				
				
	}
			@GetMapping("/p6")
			public String p6(Model model, HttpSession session) {
				@SuppressWarnings("unchecked")
				List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");

				if (messages == null) {
					messages = new ArrayList<>();
				}
				model.addAttribute("sessionMessages", messages);

				return "p6";
			}
			
			// COMO PONER REQUEST PARA 3 RESPUESTAS
			@PostMapping("/pm6")
			public String p6(@RequestParam("respuesta1") String respuesta1, String respuesta2, String respuesta3, HttpServletRequest request) {
				@SuppressWarnings("unchecked")
				List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
				if (messages == null) {
					messages = new ArrayList<>();
					request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
				}
				messages.add(respuesta1);
				messages.add(respuesta2);
				messages.add(respuesta3);
				
				request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
				return "redirect:/p7";
				
				
	}
			@GetMapping("/p7")
			public String p7(Model model, HttpSession session) {
				@SuppressWarnings("unchecked")
				List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");

				if (messages == null) {
					messages = new ArrayList<>();
				}
				model.addAttribute("sessionMessages", messages);

				return "p7";
			}
			
			
			@PostMapping("/pm7")
			public String p7(@RequestParam("respuesta") String respuesta, HttpServletRequest request) {
				@SuppressWarnings("unchecked")
				List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
				if (messages == null) {
					messages = new ArrayList<>();
					request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
				}
				messages.add(respuesta);
				request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
				return "redirect:/resultado";
				
				
	}
			
		
	
	
	
}