package com.exintermadiate.Controller;

import java.util.List;

import com.exintermadiate.Domain.Team;
import com.exintermadiate.Service.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex")
public class TeamController {

    @Autowired
    private TeamService service;

    
    /** 
     * @param model
     * @return String
     */
    @RequestMapping("")
    public String index(Model model) {
        List<Team> teamList = service.findAll();
        model.addAttribute("teamList", teamList);
        return "team";
    }

    
    /** 
     * @param id
     * @param model
     * @return String
     */
    @RequestMapping("/detail")
    public String detail(final String id, final Model model) {
        final Team team = service.load(Integer.parseInt(id));
        model.addAttribute("team", team);
        return "detail";
    }

    
    /** 
     * @param model
     * @return String
     */
    @RequestMapping("/return")
    public String back(Model model){
        List<Team> teamList = service.findAll();
        model.addAttribute("teamList", teamList);
        return index(model);
    }
}