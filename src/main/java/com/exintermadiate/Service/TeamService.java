package com.exintermadiate.Service;

import java.util.List;

import com.exintermadiate.Domain.Team;
import com.exintermadiate.Repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    @Autowired
    private TeamRepository repository;

    
    
    /** 
     * @param id
     * @return Team
     */
    public Team load(Integer id){
        Team team=repository.load(id);
        return team;
    }

    
    /** 
     * @return List<Team>
     */
    public List<Team> findAll(){
        List<Team> teamList=repository.findAll();
        return teamList;
    }
}