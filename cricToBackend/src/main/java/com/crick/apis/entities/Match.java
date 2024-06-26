package com.crick.apis.entities;

import jakarta.persistence.*;
import org.springframework.beans.factory.config.YamlProcessor;

import java.util.Date;

@Entity
@Table(name="cricket_matches")
public class Match {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int MatchId;

    private String teamHeading;

    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;

    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated

    private MatchStatus status;

    private Date date=new Date();

    public Match(String liveText, int matchId, String teamHeading, String matchNumberVenue, String battingTeam, String battingTeamScore, String bowlTeam, String bowlTeamScore, String matchLink, String textComplete, MatchStatus status, Date date) {
        this.liveText = liveText;
        MatchId = matchId;
        this.teamHeading = teamHeading;
        this.matchNumberVenue = matchNumberVenue;
        this.battingTeam = battingTeam;
        this.battingTeamScore = battingTeamScore;
        this.bowlTeam = bowlTeam;
        this.bowlTeamScore = bowlTeamScore;
        this.matchLink = matchLink;
        this.textComplete = textComplete;
        this.status = status;
        this.date = date;
    }

    public Match() {

    }
    public void setMatchStatus(){
        if(textComplete.isBlank()){
            this.status=MatchStatus.LIVE;
        }else{
            this.status=MatchStatus.COMPLETED;
        }
    }
    public int getMatchId() {
        return MatchId;
    }

    public void setMatchId(int matchId) {
        MatchId = matchId;
    }

    public String getTeamHeading() {
        return teamHeading;
    }

    public void setTeamHeading(String teamHeading) {
        this.teamHeading = teamHeading;
    }

    public String getMatchNumberVenue() {
        return matchNumberVenue;
    }

    public void setMatchNumberVenue(String matchNumberVenue) {
        this.matchNumberVenue = matchNumberVenue;
    }

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getBattingTeamScore() {
        return battingTeamScore;
    }

    public void setBattingTeamScore(String battingTeamScore) {
        this.battingTeamScore = battingTeamScore;
    }

    public String getBowlTeam() {
        return bowlTeam;
    }

    public void setBowlTeam(String bowlTeam) {
        this.bowlTeam = bowlTeam;
    }

    public String getBowlTeamScore() {
        return bowlTeamScore;
    }

    public void setBowlTeamScore(String bowlTeamScore) {
        this.bowlTeamScore = bowlTeamScore;
    }

    public String getLiveText() {
        return liveText;
    }

    public void setLiveText(String liveText) {
        this.liveText = liveText;
    }

    public String getMatchLink() {
        return matchLink;
    }

    public void setMatchLink(String matchLink) {
        this.matchLink = matchLink;
    }

    public String getTextComplete() {
        return textComplete;
    }

    public void setTextComplete(String textComplete) {
        this.textComplete = textComplete;
    }

    public MatchStatus getStatus() {
        return status;
    }

    public void setStatus(MatchStatus status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}