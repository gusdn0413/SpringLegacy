package com.nc13.spring_legacy.controller;

import com.nc13.spring_legacy.model.BoardDTO;
import com.nc13.spring_legacy.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final BoardService boardService;

    @Autowired
    public HomeController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public String showHome(Model model) {
        List<BoardDTO> list = boardService.selectAll();
        model.addAttribute("list", list);
        return "index";
    }

    @GetMapping("/board/showAll")
    public String showAll(Model model) {
        model.addAttribute("list", "showAll 도착");
        return "index";
    }
}
