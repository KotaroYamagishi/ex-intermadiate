package com.exintermadiate.Repository;

import java.util.List;

import com.exintermadiate.Domain.Team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class TeamRepository {
    @Autowired
    private NamedParameterJdbcTemplate template;

    private static final RowMapper<Team> TEAM_ROW_MAPPER
    =(rs,i)->{
        final Team team=new Team();
        team.setId(rs.getInt("id"));
        team.setLeagueName(rs.getString("league_name"));
        team.setTeamName(rs.getString("team_name"));
        team.setHeadquarters(rs.getString("headquarters"));
        team.setInauguration(rs.getString("inauguration"));
        team.setHistory(rs.getString("history"));
        return team;
    };

    
    /** 
     * @param id
     * @return Team
     */
    // id検索
    public Team load(final Integer id){
        final String sql="SELECT * FROM teams WHERE id=:id";
        final SqlParameterSource param=new MapSqlParameterSource().addValue("id", id);
        final Team team=template.queryForObject(sql, param, TEAM_ROW_MAPPER);
        return team;
    }

    
    /** 
     * @return List<Team>
     */
    //findall()の設定、発足日順で昇順
    public List<Team> findAll(){
        final String sql="SElECT * FROM teams ORDER BY inauguration";
        final List<Team> teamList=template.query(sql,TEAM_ROW_MAPPER);
        return teamList;
    }
}