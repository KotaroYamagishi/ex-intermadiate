package com.exintermadiate.Domain;


public class Team {
    private Integer id;
    private String leagueName;
    private String teamName;
    private String headquarters;
    private String inauguration;
    private String history;

    
    /** 
     * @return Integer
     */
    public Integer getId() {
        return id;
    }

    
    /** 
     * @param id
     */
    public void setId(final Integer id) {
        this.id = id;
    }

    
    /** 
     * @return String
     */
    public String getLeagueName() {
        return leagueName;
    }

    
    /** 
     * @param leagueName
     */
    public void setLeagueName(final String leagueName) {
        this.leagueName = leagueName;
    }

    
    /** 
     * @return String
     */
    public String getTeamName() {
        return teamName;
    }

    
    /** 
     * @param teamName
     */
    public void setTeamName(final String teamName) {
        this.teamName = teamName;
    }

    
    /** 
     * @return String
     */
    public String getHeadquarters() {
        return headquarters;
    }

    
    /** 
     * @param headquarters
     */
    public void setHeadquarters(final String headquarters) {
        this.headquarters = headquarters;
    }

    
    /** 
     * @return String
     */
    public String getInauguration() {
        return inauguration;
    }

    
    /** 
     * @param inauguration
     */
    public void setInauguration(String inauguration) {
        this.inauguration = inauguration;
    }

    
    /** 
     * @return String
     */
    public String getHistory() {
        return history;
    }

    
    /** 
     * @param history
     */
    public void setHistory(final String history) {
        this.history = history;
    }
}