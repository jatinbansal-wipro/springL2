package com.assignment.controller;

@Controller
public class MarksController {
    @GetMapping("/marks")
    public String showForm(Model model) {
        model.addAttribute("marksForm", new MarksForm());
        return "marksForm";
    }

    @PostMapping("/marks")
    public String submitForm(@ModelAttribute MarksForm marksForm, Model model) {
        int totalMarks = marksForm.getScienceMarks() + marksForm.getMathMarks() + marksForm.getEnglishMarks();
        model.addAttribute("totalMarks", totalMarks);
        return "marksResult";
    }
}
