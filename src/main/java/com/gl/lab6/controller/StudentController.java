package com.gl.lab6.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gl.lab6.entity.Student;
import com.gl.lab6.service.StudentService;


	@Controller
	@RequestMapping("/student")
	public class StudentController {

		@Autowired
		private StudentService studentService;
		
		@RequestMapping("/list")
		public String listStudents(Model model) {

			List<Student> student = studentService.findAll();

			model.addAttribute("students", student);
			return "Student";
		}
		
		@RequestMapping("/addStudent")
		public String showFormForAdd(Model theModel) {

			Student student = new Student();

			theModel.addAttribute("student", student);

			return "StudentForm";
		}
		
		@RequestMapping("/updateStudent")
		public String showFormForUpdate(@RequestParam("id") Integer theId,
				Model theModel) {

			Student student = studentService.findById(theId);

			theModel.addAttribute("student", student);
		
			return "StudentForm";			
		}


		@PostMapping("/save")
		public String saveStudent(Integer id, @RequestParam("fname") String fname,
				@RequestParam("lname") String lname, @RequestParam("course") String course, @RequestParam("country") String country) {

			System.out.println(id);
			Student student;
			if(id!=0)
			{
				student=studentService.findById(id);
				student.setFname(fname);
				student.setLname(lname);
				student.setCountry(country);
				student.setCourse(course);
			}
			else
				student=new Student(fname, lname, country, course);
			
			studentService.save(student);

			return "redirect:/student/list";

		}

		@RequestMapping("/deleteStudent")
		public String delete(@RequestParam("id") Integer theId) {

			if(theId!=0)
			{
				Student student=studentService.findById(theId);
				studentService.delete(student);
			}
			
			return "redirect:/student/list";
		}
		
		@RequestMapping("/403")
		public ModelAndView accessDenied(Principal user)
		{
			ModelAndView mv=new ModelAndView();
			
			if(user!=null)
			{
				mv.addObject("msg", "Hi "+user.getName()+", you are not allowed to access this page");			
			}
			else
			{
				mv.addObject("msg", "Hi, you are not allowed to access this page");	
			}
			mv.setViewName("403");
			return mv;
		}
	}

